package com.books.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

public class MainActivity extends AppCompatActivity {
RecyclerView rv;
MyAdapter adapter;
String titles[];
String dirNames[];
int posters[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.recyler);
        titles=getResources().getStringArray(R.array.movieTitles);
        dirNames=getResources().getStringArray(R.array.directorNames);
        posters= new int[]{
                R.drawable.aa,
                R.drawable.bahubali,
                R.drawable.chirutha,
                R.drawable.dookudu,
                R.drawable.eega,
                R.drawable.fidha,
                R.drawable.gabbarsingh,
                R.drawable.hello,
                R.drawable.i,
                R.drawable.jayam

        };
        adapter=new MyAdapter(titles,dirNames,posters, this);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
        }
}
