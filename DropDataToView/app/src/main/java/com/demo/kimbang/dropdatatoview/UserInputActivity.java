package com.demo.kimbang.dropdatatoview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class UserInputActivity extends AppCompatActivity {

    EditText edFullName, edAddress, edBirthDate, edPhoneNumber;
    Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);

        anhXa();

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                responeDataToMainActi();
            }
        });
    }

    private class ElementView{
        private TextView txtFullName, txtAddress, txtBirthDate, txtPhoneNumber;
        private EditText edFullName, edAddress, edBirthDate, edPhoneNumber;
        private Button addBtn;
    }

    private void anhXa() {
        /**
         * edit text
         */

        edFullName = (EditText) findViewById(R.id.edFullName);
        edAddress = (EditText) findViewById(R.id.edAddress);
        edBirthDate = (EditText) findViewById(R.id.edBirthdate);
        edPhoneNumber = (EditText) findViewById(R.id.edBirthdate);

        /**
         * button
         */

        addBtn = (Button) findViewById(R.id.btnAdd);
    }

    private void responeDataToMainActi() {
        Bundle bundle = new Bundle();

        bundle.putString("fullName", edFullName.getText().toString());
        bundle.putString("address", edAddress.getText().toString());
        bundle.putString("phoneNumber", edPhoneNumber.getText().toString());
        bundle.putString("birthDate", edBirthDate.getText().toString());

        Intent intent = getIntent();

        intent.putExtra("userInfo", bundle);
        setResult(RESULT_OK, intent);

        finish();//close current activity main
    }
}
