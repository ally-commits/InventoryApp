package com.example.inventoryapp;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void redirectUserLogin(View view) {
        Intent intent = new Intent(getApplicationContext(), UserLogin.class);
        startActivity(intent);
    }
    public void redirectAdminLogin(View view) {
        Intent intent = new Intent(getApplicationContext(), AdminLogin.class);
        startActivity(intent);
    }
}