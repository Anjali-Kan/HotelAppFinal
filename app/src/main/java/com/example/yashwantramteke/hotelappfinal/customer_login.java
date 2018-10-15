package com.example.yashwantramteke.hotelappfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class customer_login extends AppCompatActivity {
    Button loginButton; //button b1
    Button cancelButton; // button b2
    EditText emailName; //edit text ed1
    EditText enterPassword; //edit text ed2
    TextView text; //tx1
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_activity);

        loginButton = (Button)findViewById(R.id.button1);
        emailName = (EditText)findViewById(R.id.editText1);
        enterPassword = (EditText)findViewById(R.id.editText2);

        cancelButton = (Button)findViewById(R.id.button2);
        text = (TextView)findViewById(R.id.textview);
        text.setVisibility(View.GONE);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(emailName.getText().toString().equals("admin") && enterPassword.getText().toString().equals("admin")) {
                    Toast.makeText((getApplicationContext()), "Redirecting...", Toast.LENGTH_SHORT).show();
                    Intent intent = (new Intent(customer_login.this, navigation_drawer.class));
                    startActivity(intent);
                    finish();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials have been entered.", Toast.LENGTH_SHORT).show();

                    text.setVisibility(View.VISIBLE);

                    counter--;
                    text.setText(Integer.toString(counter));

                    if(counter == 0)
                        loginButton.setEnabled(false);
                }
            }
        });


        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
