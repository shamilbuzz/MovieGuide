package com.esoxjem.movieguide.listing;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.esoxjem.movieguide.R;
import com.google.auto.factory.AutoFactory;

/**
 * @author Ashwini Kumar.
 */
@AutoFactory(implementing = MovieListingViewHolderFactory.class)
public class MovieListingHolder extends RecyclerView.ViewHolder
{
    public TextView name;
    public ImageView poster;
    public View titleBackground;

    public MovieListingHolder(ViewGroup parent)
    {
        super(LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_grid_item, parent, false));
        name = (TextView) itemView.findViewById(R.id.movie_name);
        poster = (ImageView) itemView.findViewById(R.id.movie_poster);
        titleBackground = itemView.findViewById(R.id.title_background);
    }
}
