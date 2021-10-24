package ru.mirea.selivanov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import ru.mirea.selivanov.intentapp.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        String date = (String) getIntent().getSerializableExtra("date");
        TextView textView = findViewById(R.id.textView);
        textView.setText(date);
    }
}