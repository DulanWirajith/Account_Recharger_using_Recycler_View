package com.example.accountrecharger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private static final String TAG = "MainActivity";

    //    vars
    private ArrayList<String> mImageOne= new ArrayList<>();
    private ArrayList<String> mImageTwo= new ArrayList<>();
    private ArrayList<String> mImageOneSentences = new ArrayList<>();
    private ArrayList<String> mImageTwoSentences = new ArrayList<>();
    private ArrayList<String> mTextOne = new ArrayList<>();
    private ArrayList<String> mTextTwo = new ArrayList<>();
    private ArrayList<Integer> mCardOneVisibility = new ArrayList<>();
    private ArrayList<Integer> mCardTwoVisibility = new ArrayList<>();
    private ArrayList<Integer> mLinearOneVisibility = new ArrayList<>();
    private ArrayList<Integer> mLinearTwoVisibility = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initImageBitmaps();
/*
        CardView dialog_card = findViewById(R.id.dialog_card);
        CardView mobitel_card = findViewById(R.id.mobitel_card);

        dialog_card.setOnClickListener(this);
        mobitel_card.setOnClickListener(this);*/

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        /*switch (v.getId()) {
            case R.id.dialog_card:
                intent = new Intent(this, Dialog_Account_Recharge.class);
                startActivity(intent);
                break;
            case R.id.mobitel_card:
                System.out.println("Button 2 Clicked!!!");
                break;
            default:
                break;
        }*/
    }



    private void initImageBitmaps() {
        mCardOneVisibility.add(1);
        mLinearOneVisibility.add(1);
        mImageOne.add("@drawable/dialog_axiata");
        mTextOne.add("Dialog");
        mImageOneSentences.add("Recharge your Dialog Account");
        mCardTwoVisibility.add(1);
        mLinearTwoVisibility.add(1);
        mImageTwo.add("@drawable/dialog_axiata");
        mTextTwo.add("Mobitel");
        mImageTwoSentences.add("Recharge your Mobitel Account");

        mCardOneVisibility.add(1);
        mLinearOneVisibility.add(1);
        mImageOne.add("@drawable/dialog_axiata");
        mTextOne.add("Dialog");
        mImageOneSentences.add("Recharge your Dialog Account");
        mCardTwoVisibility.add(1);
        mLinearTwoVisibility.add(1);
        mImageTwo.add("@drawable/dialog_axiata");
        mTextTwo.add("Mobitel");
        mImageTwoSentences.add("Recharge your Mobitel Account");

        mCardOneVisibility.add(1);
        mLinearOneVisibility.add(1);
        mImageOne.add("@drawable/dialog_axiata");
        mTextOne.add("Dialog");
        mImageOneSentences.add("Recharge your Dialog Account");
        mCardTwoVisibility.add(0);
        mLinearTwoVisibility.add(1);
        mImageTwo.add("@drawable/dialog_axiata");
        mTextTwo.add("Mobitel");
        mImageTwoSentences.add("Recharge your Mobitel Account");

//        mImageUrls.add("https://cdn.wccftech.com/wp-content/uploads/2018/01/Android-Logo.jpg");
//        mNames.add("ASD");
//
//
//        mImageUrls.add("https://ahotcupofjoe.net/wp-content/uploads/2017/02/android-apps.jpg");
//        mNames.add("ASDF");
//
//        mImageUrls.add("https://cdn.wccftech.com/wp-content/uploads/2018/01/Android-Logo.jpg");
//        mNames.add("ASD");
//
//
//        mImageUrls.add("https://ahotcupofjoe.net/wp-content/uploads/2017/02/android-apps.jpg");
//        mNames.add("ASDF");
//
//        mImageUrls.add("https://cdn.wccftech.com/wp-content/uploads/2018/01/Android-Logo.jpg");
//        mNames.add("ASD");
//
//
//        mImageUrls.add("https://ahotcupofjoe.net/wp-content/uploads/2017/02/android-apps.jpg");
//        mNames.add("ASDF");
//
//        mImageUrls.add("https://cdn.wccftech.com/wp-content/uploads/2018/01/Android-Logo.jpg");
//        mNames.add("ASD");
//
//
//        mImageUrls.add("https://ahotcupofjoe.net/wp-content/uploads/2017/02/android-apps.jpg");
//        mNames.add("ASDF");
//        mImageUrls.add("https://cdn.wccftech.com/wp-content/uploads/2018/01/Android-Logo.jpg");
//        mNames.add("ASD");
//
//
//        mImageUrls.add("https://ahotcupofjoe.net/wp-content/uploads/2017/02/android-apps.jpg");
//        mNames.add("ASDF");
//        mImageUrls.add("https://cdn.wccftech.com/wp-content/uploads/2018/01/Android-Logo.jpg");
//        mNames.add("ASD");
//
//
//        mImageUrls.add("https://ahotcupofjoe.net/wp-content/uploads/2017/02/android-apps.jpg");
//        mNames.add("ASDF");
//        mImageUrls.add("https://cdn.wccftech.com/wp-content/uploads/2018/01/Android-Logo.jpg");
//        mNames.add("ASD");
//
//
//        mImageUrls.add("https://ahotcupofjoe.net/wp-content/uploads/2017/02/android-apps.jpg");
//        mNames.add("ASDF");
        initRecyclerView();

    }

    public void initRecyclerView() {
        Log.i(TAG, "initRecyclerView: init recyclerview");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter( mImageOne, mImageTwo,  mImageOneSentences, mImageTwoSentences,  mTextOne,  mTextTwo, mCardOneVisibility, mCardTwoVisibility, mLinearOneVisibility, mLinearTwoVisibility, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}

