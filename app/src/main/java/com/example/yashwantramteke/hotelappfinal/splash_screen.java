package com.example.yashwantramteke.hotelappfinal;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash_screen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Thread.sleep(3000);
        }
        catch(Exception ignored) {
            ignored.printStackTrace();
        }
        finally {
            Intent intent = new Intent(this, select_login.class);
            startActivity(intent);
            finish();
        }
    }
}
