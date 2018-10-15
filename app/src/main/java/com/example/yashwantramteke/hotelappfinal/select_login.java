package com.example.yashwantramteke.hotelappfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class select_login extends AppCompatActivity {
    Button customerButton;
    Button adminButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }

    public void openCustomerLoginScreen(View view) {
        customerButton = (Button)findViewById(R.id.logincustomer);
        customerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(select_login.this, customer_login.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void openAdministratorLoginScreen(View view) {
        adminButton = (Button)findViewById(R.id.loginadmin);
        adminButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(select_login.this, admin_login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
