package com.example.biz.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {
    String xReceivedStr;
    int xReceivedInt;
    ListView xMyList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        xMyList = (ListView) findViewById(R.id.list_view);
        Intent x2Intent = getIntent();
        xReceivedStr = x2Intent.getStringExtra("ATTRIBUTO_STRINGOSO");
        xReceivedInt = x2Intent.getIntExtra("ATTRIBUTO_NUMEROSO", 1);

        xMyList.setAdapter();

    }
}
