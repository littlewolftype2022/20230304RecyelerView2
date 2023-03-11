package com.example.a20230304recyelerview2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.a20230304recyelerview2.R;

public class MyAdatpter extends RecyclerView.Adapter<MyAdatpter.ViewHolder> {


    private ItemObject[] mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView1;
        public TextView mTextView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView1 = (TextView) itemView.findViewById(R.id.text_view_1);
            mTextView2 = (TextView) itemView.findViewById(R.id.text_view_2);
        }
    }

    public MyAdatpter(ItemObject[] myDataset){
        mDataset = myDataset;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        holder.mTextView1.setText(mDataset[position].getText1());
        holder.mTextView2.setText(mDataset[position].getText2());
    }



    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
