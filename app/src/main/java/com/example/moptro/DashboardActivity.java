package com.example.moptro;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    private TextView userNameTextView;
    private ProgressBar progressBarMonday, progressBarTuesday, progressBarWednesday, progressBarThursday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Initialize UI elements
        userNameTextView = findViewById(R.id.user_name);
        progressBarMonday = findViewById(R.id.progressBar2);
        progressBarTuesday = findViewById(R.id.progressBar3);
        progressBarWednesday = findViewById(R.id.progressBar4);
        progressBarThursday = findViewById(R.id.progressBar5);

        // Update user name (replace with actual logic)
        String userId = "2815"; // Assuming userId is a string
        userNameTextView.setText("vinay (EMP ID: " + userId + ")");

        // Update progress bars (replace with actual data)
        progressBarMonday.setProgress(75); // Example value, replace with actual data
        progressBarTuesday.setProgress(80); // Example value, replace with actual data
        progressBarWednesday.setProgress(85); // Example value, replace with actual data
        progressBarThursday.setProgress(90); // Example value, replace with actual data
    }
}