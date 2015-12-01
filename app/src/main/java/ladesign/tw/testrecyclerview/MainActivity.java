package ladesign.tw.testrecyclerview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  宣告 recyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // 設定要給 Adapter 的陣列為 itemsData
        ItemData itemsData[] = {
                new ItemData("hello1"),
                new ItemData("hello2"),
                new ItemData("hello3"),
                new ItemData("hello1"),
                new ItemData("hello2"),
                new ItemData("hello3"),
                new ItemData("hello1"),
                new ItemData("hello2"),
                new ItemData("hello3"),
                new ItemData("hello1"),
                new ItemData("hello2"),
                new ItemData("hello3"),
        };

        MyAdapter mAdapter = new MyAdapter(itemsData);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }


}
