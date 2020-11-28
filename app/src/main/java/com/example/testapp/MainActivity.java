package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Email;
    private EditText password;
    private Button   login;
    private  TextView info;
    SharedPreferences sharesprefences;
    private static String namee="hamza";
    private static String Key_name="name";
    private static String key_email="email";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email=(EditText)findViewById(R.id.editText);
        password=(EditText)findViewById(R.id.editText3);
        login=(Button)findViewById(R.id.button);
        info=(TextView)findViewById(R.id.textView2);
        sharesprefences=getSharedPreferences(namee,MODE_PRIVATE);
        String name=sharesprefences.getString(Key_name,null);
        String passwordd=sharesprefences.getString(key_email,null);
        if(name!=null && password!=null)
        {
            Email.setText(name);
            password.setText(passwordd);
        }
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=Email.getText().toString();
                String passwordd= password.getText().toString();
                //hjkkhk k

                //jhutyryryt

                if(name.isEmpty() || passwordd.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"please enter your name or id",Toast.LENGTH_LONG).show();
                }
                else
                {

                    SharedPreferences.Editor editor=sharesprefences.edit();
                    editor.putString(Key_name,name);
                    editor.putString(key_email,passwordd);
                    editor.apply();

                        Toast.makeText(MainActivity.this, "succesfully movred to nexr secreen",
                                Toast.LENGTH_LONG).show();

                        Intent intent = new Intent(MainActivity.this, signup.class);
                        intent.putExtra("name", name);
                        intent.putExtra("password", passwordd);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "name   " + name + '\n' + " your password" + passwordd, Toast.LENGTH_SHORT).show();
                    }


            }


        });




    }

}
