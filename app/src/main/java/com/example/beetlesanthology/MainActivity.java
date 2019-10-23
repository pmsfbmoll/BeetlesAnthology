package com.example.beetlesanthology;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    protected EditText et;
    protected boolean edit;
    protected Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.editText);
        edit = false;
        b = findViewById(R.id.button);
    }

    public void onClickAddComment(View view) {
        if (edit) {
            b.setText("Add a comment");
            et.clearFocus();
        } else {
            b.setText("Save comments");
            et.requestFocus();
        }
        edit ^= true;
        et.setEnabled(edit);
    }
}
