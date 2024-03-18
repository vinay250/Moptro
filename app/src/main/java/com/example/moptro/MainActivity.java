package com.example.moptro;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.username_edit_text);
        passwordEditText = findViewById(R.id.password_edit_text);
        loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                // Basic validation
                if (TextUtils.isEmpty(username)) {
                    Toast.makeText(MainActivity.this, "Please enter your username", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(MainActivity.this, "Please enter your password", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!Patterns.EMAIL_ADDRESS.matcher(username).matches()) {
                    Toast.makeText(MainActivity.this, "Invalid email format", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Placeholder for server-side authentication
                boolean isAuthenticated = performAuthentication(username, password);

                if (isAuthenticated) {
                    // Login successful, open DashboardActivity
                    try {
                        Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                        startActivity(intent);
                    } catch (Exception e) {
                        Log.e("MainActivity", "Error starting DashboardActivity", e);
                    }
                } else {
                    // Login failed
                    Toast.makeText(MainActivity.this, "Login failed. Please check your credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    private boolean performAuthentication(String username, String password) {
        // Check if the provided credentials match the hardcoded values
        return username.equals("vinayakavirat008@gmail.com") && password.equals("vinay");
    }
}
