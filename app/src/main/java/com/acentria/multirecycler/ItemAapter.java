package com.acentria.multirecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.List;

import static com.acentria.multirecycler.Movie.ONE_TYPE;
import static com.acentria.multirecycler.Movie.TWO_TYPE;

public class ItemAapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Movie> moviesList;
    private List<ModelTwo> newMoviewLists;
    private final int VIEW_TYPE_TEXTVIEW = 0;
    private final int VIEW0 = 0;
    private final int VIEW1 = 1;
    int cursorPosition=0;
    public ItemAapter(List<Movie> movieList) {
        this.moviesList = movieList;
    }

    @Override
    public int getItemViewType(int position) {

//
        Movie movie = moviesList.get(position);


            return movie.getType();


    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        switch (viewType) {

            case ONE_TYPE:
                View view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.movie_list_row, parent, false);
                return new MoviewListA(view);

            case TWO_TYPE:
                View  view1 = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.movie_list_two, parent, false);
                return new MoviewListTwo(view1);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        cursorPosition= position;
        Movie movie = moviesList.get(position);

        switch (movie.getType()) {

            case ONE_TYPE:

                ((MoviewListA) holder).imagecar.setImageResource(moviesList.get(position).getImage());
                break;
            case TWO_TYPE:

                ((MoviewListTwo) holder).imageView.setImageResource(moviesList.get(position).getImage());

                break;

        }

    }


    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    private class MoviewListA extends RecyclerView.ViewHolder {
        ImageView imagecar;

        public MoviewListA(View view) {
            super(view);

            imagecar = view.findViewById(R.id.imagecar);
        }
    }

    private class MoviewListTwo extends RecyclerView.ViewHolder {
        ImageView imageView;

        public MoviewListTwo(View view) {
            super(view);
            imageView = view.findViewById(R.id.newimageLay);
        }
    }


}
