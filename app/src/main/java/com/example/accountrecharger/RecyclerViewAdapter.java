package com.example.accountrecharger;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mImageOne = new ArrayList<>();
    private ArrayList<String> mImageTwo = new ArrayList<>();
    private ArrayList<String> mImageOneSentences = new ArrayList<>();
    private ArrayList<String> mImageTwoSentences = new ArrayList<>();
    private ArrayList<String> mTextOne = new ArrayList<>();
    private ArrayList<String> mTextTwo = new ArrayList<>();
    private ArrayList<Integer> mCardOneVisibility = new ArrayList<>();
    private ArrayList<Integer> mCardTwoVisibility = new ArrayList<>();
    private ArrayList<Integer> mLinearOneVisibility = new ArrayList<>();
    private ArrayList<Integer> mLinearTwoVisibility = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(ArrayList<String> mImageOne, ArrayList<String> mImageTwo, ArrayList<String> mImageOneSentences, ArrayList<String> mImageTwoSentences, ArrayList<String> mTextOne, ArrayList<String> mTextTwo, ArrayList<Integer> mCardOneVisibility, ArrayList<Integer> mCardTwoVisibility, ArrayList<Integer> mLinearOneVisibility, ArrayList<Integer> mLinearTwoVisibility, Context mContext) {
        this.mImageOne = mImageOne;
        this.mImageTwo = mImageTwo;
        this.mImageOneSentences = mImageOneSentences;
        this.mImageTwoSentences = mImageTwoSentences;
        this.mTextOne = mTextOne;
        this.mTextTwo = mTextTwo;
        this.mCardOneVisibility = mCardOneVisibility;
        this.mCardTwoVisibility = mCardTwoVisibility;
        this.mLinearOneVisibility = mLinearOneVisibility;
        this.mLinearTwoVisibility = mLinearTwoVisibility;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.i(TAG, "onBindViewHolder: called");

//        holder.imageName.setText(mImageNames.get(position));.
        int cardOneVisibility = mCardOneVisibility.get(position);
        if (cardOneVisibility == 1) {
            holder.cardOne.setVisibility(View.VISIBLE);
        } else if (cardOneVisibility == 2) {
            holder.cardOne.setVisibility(View.INVISIBLE);
        } else {
            holder.cardOne.setVisibility(View.GONE);
        }

        int cardTwoVisibility = mCardTwoVisibility.get(position);
        if (cardTwoVisibility == 1) {
            holder.cardTwo.setVisibility(View.VISIBLE);
        } else if (cardTwoVisibility == 2) {
            holder.cardTwo.setVisibility(View.INVISIBLE);
        } else {
            holder.cardTwo.setVisibility(View.GONE);
        }
//        holder.linearOne.setVisibility(mLinearOneVisibility.get(position));
        String my_image = mImageOne.get(position);
//        holder.imageOne.setImageResource().getDrawable(my_image);


//        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.i(TAG, "onClick: clicked on: " + mImageNames.get(position));
//                Toast.makeText(mContext, mImageNames.get(position), Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    public int getItemCount() {

        return mTextOne.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        LinearLayout parentLayout;
        LinearLayout linearMain;
        CardView cardOne;
        LinearLayout linearOne;
        ImageView imageOne;
        TextView textOne;
        TextView textSentenceOne;
        CardView cardTwo;
        LinearLayout linearTwo;
        ImageView imageTwo;
        TextView textTwo;
        TextView textSentenceTwo;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parentLayout = itemView.findViewById(R.id.main_parent);
            linearMain = itemView.findViewById(R.id.linear_main);
            cardOne = itemView.findViewById(R.id.card_one);
            linearOne = itemView.findViewById(R.id.linear_one);
            imageOne = itemView.findViewById(R.id.image_one);
            textOne = itemView.findViewById(R.id.text_one);
            textSentenceOne = itemView.findViewById(R.id.text_sentence_one);
            cardTwo = itemView.findViewById(R.id.card_two);
            linearTwo = itemView.findViewById(R.id.linear_two);
            imageTwo = itemView.findViewById(R.id.image_two);
            textTwo = itemView.findViewById(R.id.text_two);
            textSentenceTwo = itemView.findViewById(R.id.text_sentence_two);

        }
    }

}
