package com.demo.kimbang.dropdatatoview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE_INPUT = 100;
    public static final int REQUEST_CODE_CBACK = 1;


    ListView lstUser;
    ArrayList<Users> userList;
    UsersAdapter usersAdapter;

    ImageButton imgAddBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXa();

        pushUserInfomation();

        usersAdapter = new UsersAdapter(this,userList, R.layout.list_user_info);

        lstUser.setAdapter(usersAdapter);

//        imgAddBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, UserInputActivity.class);
//                startActivityForResult(intent, REQUEST_CODE_INPUT);
//            }
//        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_INPUT) {
            Bundle bundle = data.getBundleExtra("userInfo");

            userList.add(new Users(
                    bundle.getString("fullName"),
                    bundle.getString("address"),
                    bundle.getString("phoneNumber"),
                    bundle.getString("birthDate"),
                    R.drawable.avatar)
            );

            usersAdapter = new UsersAdapter(this,userList, R.layout.list_user_info);

            lstUser.setAdapter(usersAdapter);
        }
    }

    private void pushUserInfomation() {

        Log.d("dd", "aaa");

//        if (userList.size() == 0) {
            userList = new ArrayList<>();
//        }

        userList.add(new Users(
                "Nguyen Kim Bang",
                "Nguyen Tat Thang - Nha Trang - Khanh Hoa",
                "016771544680",
                "10-08-1992",
                R.drawable.avatar)
        );
    }

    private void anhXa() {
        lstUser = (ListView) findViewById(R.id.lstUser);
        imgAddBtn = (ImageButton) findViewById(R.id.imgAddBtn);
    }
}
