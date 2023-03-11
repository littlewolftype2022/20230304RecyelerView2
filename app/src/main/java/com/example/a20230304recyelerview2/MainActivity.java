package com.example.a20230304recyelerview2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private MyAdatpter mAdapter;
    private ItemObject[] mMyDataset = new ItemObject[100];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);


        //如已经知道的内容变化不会改变recyclerView的布局大小，使用该设置来改变性能
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        for(int i=0;i<100;i++){
            ItemObject itemObject = new ItemObject();
            itemObject.setText1("Item" + i +"_Text1");
            itemObject.setText2("Item" + i +"_Text2");
            mMyDataset[i] = itemObject;
        }
        mAdapter = new MyAdatpter(mMyDataset);
        mRecyclerView.setAdapter(mAdapter);
    }
}