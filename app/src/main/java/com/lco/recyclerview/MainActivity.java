package com.lco.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView courselist;
    private int[] images={R.drawable.hero,R.drawable.hero,R.drawable.hero,R.drawable.hero,R.drawable.hero,R.drawable.hero,R.drawable.hero,R.drawable.hero,R.drawable.hero,R.drawable.hero,R.drawable.hero,R.drawable.hero};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        courselist=findViewById(R.id.recyclerview);
        courselist.setLayoutManager(new LinearLayoutManager(this));
       //int course[]={"asif","khan","gulshan","vivek","Himanshu","khan","kumar","sharma","asif","khan","gulshan","vivek","asif","khan","gulshan","vivek","asif","khan","gulshan","vivek"};
        courselist.setAdapter(new CourseAdapter(images));
    }
}
