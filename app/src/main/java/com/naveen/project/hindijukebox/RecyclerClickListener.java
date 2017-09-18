package com.naveen.project.hindijukebox;


import com.naveen.project.hindijukebox.adapters.List1Adapter;
import com.naveen.project.hindijukebox.adapters.List2Adapter;
import com.naveen.project.hindijukebox.adapters.ListAdapter;

public interface RecyclerClickListener {

    void onItemClicked(ListAdapter.SimpleViewHolder holder, int position);
    void onItemClicked(List1Adapter.SimpleViewHolder holder, int position);
    void onItemClicked(List2Adapter.SimpleViewHolder holder, int position);

}
