package com.demo.kimbang.dropdatatoview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class UsersAdapter extends BaseAdapter{
    private Context context;
    private ArrayList<Users> usersList;
    private int layout;

    public UsersAdapter(Context context, ArrayList<Users> usersList, int layout) {
        this.context = context;
        this.usersList = usersList;
        this.layout = layout;
    }

    private class ViewHolder {
        private TextView txtFullName, txtAddress, txtPhoneNumber, txtBirthDate;
        private ImageView imgAvatar;
    }

    @Override
    public int getCount() {
        return usersList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null) {

            holder = new ViewHolder();

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(layout, null);

            Users users = usersList.get(position);

            mapped(holder, convertView, users);

            convertView.setTag(holder);

        } else {
            convertView.getTag();
        }

        return convertView;
    }

    private void mapped(ViewHolder holder, View convertView, Users users) {
        holder.txtFullName = (TextView) convertView.findViewById(R.id.txtFullName);
        holder.txtAddress = (TextView) convertView.findViewById(R.id.txtAddress);
        holder.txtPhoneNumber = (TextView) convertView.findViewById(R.id.txtPhoneNumber);
        holder.txtBirthDate = (TextView) convertView.findViewById(R.id.txtBirthDate);
        holder.imgAvatar = (ImageView) convertView.findViewById(R.id.imgAvatar);

        holder.txtFullName.setText(users.getFulName());
        holder.txtAddress.setText(users.getAddress());
        holder.txtPhoneNumber.setText(users.getPhoneNumber());
        holder.txtBirthDate.setText(users.getBirthDate());
        holder.imgAvatar.setImageResource(users.getAvatar());
    }
}
