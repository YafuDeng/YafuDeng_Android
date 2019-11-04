package com.example.yafudeng_midterm_redo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class triangle extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        root.setGravity(Gravity.CENTER_HORIZONTAL);
        root.setOrientation(LinearLayout.VERTICAL);

        Intent intent = getIntent();
        int number = intent.getIntExtra(question1.EXTRA_NUMBER, 0);

        //TextView textView = (TextView) findViewById(R.id.lines);

        //textView.setText("" + number);
        int num = number;

        if (num >= 1){
            for(int i = 1; i<= num; i++) {
                LinearLayout ln = new LinearLayout(this);
                ln.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                ln.setGravity(Gravity.CENTER_HORIZONTAL);
                for(int j = 1; j<=i; j++) {
                    Button nbt = new Button(this);
                    nbt.setText("");
                    ln.addView(nbt);
                }

                root.addView(ln);
            }
        }

        setContentView(root);

    }

}
