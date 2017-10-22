package com.example.lavender.exampleproject;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Lavender on 2017/10/22.
 */

public class ViewGroupActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewgroup_layout);
        Button btn2 =  (Button) findViewById(R.id.searchBtn);
        Button btn1 =  (Button) findViewById(R.id.searchBtn);

//        Button button1=(Button) findViewById(R.id.searchBtn);


        EditText editView =  (EditText)findViewById(R.id.editView);
    }
}
