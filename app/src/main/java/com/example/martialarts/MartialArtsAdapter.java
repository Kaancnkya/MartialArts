package com.example.martialarts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.ViewTreeViewModelKt;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MartialArtsAdapter extends RecyclerView.Adapter<MartialArtsAdapter.MartialArtsViewHolder> {
    private final ArrayList<MartialArts> martialArtsArrayList;
    private final LayoutInflater inflater;
    private MartialArtsItemClickListener martialArtsItemClickListener;

    public MartialArtsAdapter(Context context, ArrayList<MartialArts> martialArtsArrayList, MartialArtsItemClickListener martialArtsItemClickListener) {
        this.martialArtsArrayList = martialArtsArrayList;
        this.inflater = LayoutInflater.from(context);
        this.martialArtsItemClickListener = martialArtsItemClickListener;
    }

    @NonNull
    @Override
    public MartialArtsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_view,parent,false);
        return new MartialArtsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MartialArtsViewHolder holder, int position) {
        MartialArts martialArts = martialArtsArrayList.get(position);
        holder.tittleView.setText(martialArts.getTittle());
        holder.subtittleView.setText(martialArts.getSummary());
        holder.imageView.setImageResource(martialArts.getImage());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                martialArtsItemClickListener.onItemClickListener(martialArts);
            }
        });

    }

    @Override
    public int getItemCount() {
        return martialArtsArrayList.size();
    }

    class MartialArtsViewHolder extends RecyclerView.ViewHolder{

        TextView tittleView;
        TextView subtittleView;
        ImageView imageView;
        CardView cardView;

        public MartialArtsViewHolder(@NonNull View itemView) {
            super(itemView);

            tittleView = itemView.findViewById(R.id.textViewTittle);
            subtittleView = itemView.findViewById(R.id.textViewSubtittle);
            imageView = itemView.findViewById(R.id.imageView);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
    public interface MartialArtsItemClickListener{
        void onItemClickListener(MartialArts martialArts);
    }
}

