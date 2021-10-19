package com.example.navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolderExample> {
    private ArrayList<Items> items;

    public static class ViewHolderExample extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;

        public ViewHolderExample(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.textView1);
            mTextView2 = itemView.findViewById(R.id.textView2);
        }
    }

    public Adapter(ArrayList<Items> exampleList){
        items = exampleList;
    }

    @Override
    public ViewHolderExample onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_example, parent, false);
        ViewHolderExample vhe = new ViewHolderExample(v);
        return vhe;
    }

    @Override
    public void onBindViewHolder(ViewHolderExample holder, int position) {
        Items currentItem = items.get(position);

        holder.mImageView.setImageResource(currentItem.getImageRes());
        holder.mTextView1.setText(currentItem.getChatName());
        holder.mTextView2.setText(currentItem.getMessage());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
