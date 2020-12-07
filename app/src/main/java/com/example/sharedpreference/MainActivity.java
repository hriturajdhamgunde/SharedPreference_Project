package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtName;
    EditText edtPassword;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edt_Name);
        edtPassword = findViewById(R.id.edt_pass);

    }

    public void Login(View view) {

        String name = edtName.getText().toString();
        String pass = edtPassword.getText().toString();

        if(name.equals("")||pass.equals("")){
            Toast.makeText(this,"Please fill all fields",Toast.LENGTH_SHORT).show();
        }else {

            User user = new User(MainActivity.this);
            user.setName(name);
            user.setPass(pass);
            String msg = Validation.validate(user);
            if(msg.equals("Success")){

                startActivity(new Intent(MainActivity.this,Welcome.class));
                finish();
            }
            else{

                Toast.makeText(this,"Invalid User Name Or Password",Toast.LENGTH_SHORT).show();
            }

        }

    }
}