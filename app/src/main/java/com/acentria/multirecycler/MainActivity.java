package com.acentria.multirecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Movie> movieList = new ArrayList<>();
    private List<ModelTwo> newMoviewList = new ArrayList<>();
    RecyclerView itemRecycler;
    ItemAapter itemAapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemAapter = new ItemAapter(movieList);
        itemRecycler = findViewById(R.id.itemRecycler);

//
        SpannableGridLayoutManager gridLayoutManager = new
                SpannableGridLayoutManager(new SpannableGridLayoutManager.GridSpanLookup() {
            @Override
            public SpannableGridLayoutManager.SpanInfo getSpanInfo(int i) {
                if (i%9==0){
                    return new SpannableGridLayoutManager.SpanInfo(2, 2);
                } else {
                    return new SpannableGridLayoutManager.SpanInfo(1, 1);
                }
            }
        }, 3, 1f);
   //   StaggeredGridLayoutManager gridLayoutManager = new StaggeredGridLayoutManager(3,LinearLayoutManager.VERTICAL);
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
//        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
//            @Override
//            public int getSpanSize(int position) {
//                int num = 0;
//                if(position == 0)
//                    num = 2;
//                else if(position == 1)
//                    num = 1;
//                else if (position % 4 == 0)
//                    num = 1;
//                else
//                    num = 2;
//                Log.i("spansize", "spansize: " + num);
//                return num;
//            }
//        });
//        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
//            @Override
//            public int getSpanSize(int position) {
//                switch(itemAapter.getItemViewType(position)){
//                    return if (position % 3 == 0)
//                        2;
//                    else
//                        1
//                }
//            }
//        });
        itemRecycler.setLayoutManager(gridLayoutManager);
        itemRecycler.setAdapter(itemAapter);
        prepareMovieData();


    }


    private void prepareMovieData() {
        for (int i=0; i<50; i++ ) {


                if (i%9==0){
                    movieList.add(new Movie(R.drawable.splsh, Movie.TWO_TYPE));

                }else {
                    movieList.add(new Movie(R.drawable.civic, Movie.ONE_TYPE));
                }



        }
    }
}
