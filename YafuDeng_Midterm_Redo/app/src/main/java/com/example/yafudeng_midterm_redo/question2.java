package com.example.yafudeng_midterm_redo;

import androidx.appcompat.app.AppCompatActivity;

import android.database.DataSetObserver;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class question2 extends AppCompatActivity {
    String items[] = new String[] {"                                             0",
            "                                             0" ,
            "                                             0",
            "                                             0",
            "                                             0"};
    int click0 = 1;
    int click1 = 1;
    int click2 = 1;
    int click3 = 1;
    int click4 = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        ListView listView  = (ListView) findViewById(R.id.list);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
        listView.setBackgroundColor(Color.GREEN);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        items[position] = "                                             " + click0++;
                        adapter.notifyDataSetChanged();
                        break;
                    case 1:
                        items[position] = "                                             " + click1++;
                        adapter.notifyDataSetChanged();
                        break;
                    case 2:
                        items[position] = "                                             " + click2++;
                        adapter.notifyDataSetChanged();
                        break;
                    case 3:
                        items[position] = "                                             " + click3++;
                        adapter.notifyDataSetChanged();
                        break;
                    case 4:
                        items[position] = "                                             " + click4++;
                        adapter.notifyDataSetChanged();
                        break;
                }
            }
        });
    }

}
