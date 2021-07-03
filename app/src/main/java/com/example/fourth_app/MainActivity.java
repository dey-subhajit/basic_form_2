package com.example.fourth_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_f_name, et_l_name, et_email, et_phone;
    CheckBox cbaccept;
    Button subBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_f_name = findViewById(R.id.et_f_name);
        et_l_name = findViewById(R.id.et_l_name);
        et_email = findViewById(R.id.et_email);
        et_phone = findViewById(R.id.et_phone);

        cbaccept = findViewById(R.id.cbaccept);

        subBtn = findViewById(R.id.subBtn);

        et_f_name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                System.out.print("Type... ");
                System.out.print(start);
                System.out.print(count);
                System.out.print(after);
                System.out.println(s);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String S1, S2, S3, S4, S5;
                S1 = et_f_name.getText().toString();
                S2 = et_l_name.getText().toString();
                S4 = et_email.getText().toString();
                S5 = et_phone.getText().toString();
                System.out.println(cbaccept.isChecked());
                S3 = "Your Name Is- "+S1+" "+S2+"\nEmail- "+S4+"\nPhone no- "+S5;
                Toast.makeText(MainActivity.this, S3, Toast.LENGTH_LONG).show();
            }
        });
    }
}