package com.example.yafudeng_midterm_redo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class question1 extends AppCompatActivity {
    private Button triangle;
    public final static String EXTRA_NUMBER = "com.example.yafudeng_midterm_redo.ENTRA_NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        triangle = (Button) findViewById(R.id.triangle);

        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTriangle();
            }
        });
    }

    public void openTriangle(){
        EditText editText = (EditText) findViewById(R.id.lines);
        int number = Integer.parseInt(editText.getText().toString());

        Intent intent = new Intent(this, triangle.class);
        intent.putExtra(EXTRA_NUMBER, number);
        startActivity(intent);
    }
}
