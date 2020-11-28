package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    private EditText ename;
    private EditText email;
    private EditText password;
    private Button   btn;
    private TextView infoo;
    //sdwdwd
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ename=(EditText)findViewById(R.id.editText);
        email=(EditText)findViewById(R.id.editText4);
        password=(EditText)findViewById(R.id.editText5);
        btn=(Button)findViewById(R.id.button3);
       infoo=(TextView)findViewById(R.id.textView3);

       final String name =   getIntent().getStringExtra("name");
       final String passwords= getIntent().getStringExtra("password");
       ename.setText(name);
       password.setText(passwords);


    btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namee= ename.getText().toString();
                String mail=email.getText().toString();
                String pasword=password.getText().toString();
                if(namee.isEmpty() || mail.isEmpty() || pasword.isEmpty())
                {
                    Toast.makeText(signup.this,"please enter your all data",Toast.LENGTH_LONG).show();
                }else{

                }
                {
                    Toast.makeText(signup.this,"name   "+namee +'\n'+" your email  "+mail+'\n'+"youd password "
                            +password,Toast.LENGTH_SHORT).show();
                }
            }

        });


    }
}
