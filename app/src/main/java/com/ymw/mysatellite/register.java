package com.ymw.mysatellite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {
    EditText etName, etPress;
    Button bnLoin, bnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = (EditText)findViewById(R.id.userEditText);
        etPress = (EditText)findViewById(R.id.user_pass);
        bnLoin = (Button)findViewById(R.id.bnLogin);
        bnCancel = (Button)findViewById(R.id.bnCancel);

        bnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register.this.finish();
            }
        });

        bnLoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validate()){
                    if (loginPro()){
                        Intent intent = new Intent(register.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }


            }

            private boolean loginPro(){
                String username = etName.getText().toString();
                String pwd = etPress.getText().toString();
                if (username.equals("wxwx") && pwd.equals("NUAA")){
                    return true;
                }
                else
                    DialogUtil.showDialog(register.this, "用户名或密码错误，请重新输入!", false);
                return false;
            }

            private boolean validate() {
                String username = etName.getText().toString().trim();
                if (username.equals("")){
                    DialogUtil.showDialog(register.this,"用户名是必填项！",false);
                    return false;
                }
                String pwd = etPress.getText().toString().trim();
                if (pwd.equals("")){
                    DialogUtil.showDialog(register.this,"密码是必填项！",false);
                }
                return true;
            }
        });


    }
}
