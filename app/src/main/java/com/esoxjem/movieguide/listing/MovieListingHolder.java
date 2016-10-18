package com.esoxjem.movieguide.listing;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.esoxjem.movieguide.R;
import com.google.auto.factory.AutoFactory;

import butterknife.BindView;

/**
 * @author Ashwini Kumar.
 */
@AutoFactory(implementing = MovieListingViewHolderFactory.class)
public class MovieListingHolder extends RecyclerView.ViewHolder
{
    @BindView(R.id.movie_name)
    TextView name;
    @BindView(R.id.movie_poster)
    ImageView poster;
    @BindView(R.id.title_background)
    View titleBackground;

    public MovieListingHolder(ViewGroup parent)
    {
        super(LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_grid_item, parent, false));
        name = (TextView) itemView.findViewById(R.id.movie_name);
        poster = (ImageView) itemView.findViewById(R.id.movie_poster);
        titleBackground = itemView.findViewById(R.id.title_background);
    }
}
