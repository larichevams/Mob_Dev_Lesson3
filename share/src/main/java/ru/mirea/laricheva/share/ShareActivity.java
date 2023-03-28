package ru.mirea.laricheva.share;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        textView = findViewById(R.id.textView);
        textView.setText("Номер по списку 17. Вы в ShareActivity!");
    }
}