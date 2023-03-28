package ru.mirea.laricheva.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    TextView textViewInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView textViewInput = findViewById(R.id.textViewInput);
            String developersBook = extras.getString(MainActivity.KEY);
            textViewInput.setText(String.format("Мой любимая книга: %s", developersBook));
        }
    }

    public void onSendBook(View view) {
        EditText editText = findViewById(R.id.editTextFavouriteBook);
        String text  = "Название Вашей " +
                "любимой книги: " + editText.getText().toString();

        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE, text);
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}