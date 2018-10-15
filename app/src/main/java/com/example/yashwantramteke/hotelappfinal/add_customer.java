package com.example.yashwantramteke.hotelappfinal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class add_customer extends AppCompatActivity {
    private Button mAddCustomerButton;
    private DatabaseReference mDatabase;
    private EditText mPhoneField;
    private EditText mPasswordField;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_add_activity);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mAddCustomerButton = (Button)findViewById(R.id.register_button);
        mPhoneField = (EditText)findViewById(R.id.phone_field);
        mPasswordField = (EditText)findViewById(R.id.password_field);

        mAddCustomerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenum = mPhoneField.getText().toString().trim();
                String password = mPasswordField.getText().toString().trim();
                HashMap<String, String> dataMap = new HashMap<String, String>();
                dataMap.put("Phone number", phonenum);
                dataMap.put("Password", password);
                mDatabase.push().setValue(dataMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()) {
                            Toast.makeText(add_customer.this, "Data has been entered successfully...", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(add_customer.this, "Error...", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

    }
}
