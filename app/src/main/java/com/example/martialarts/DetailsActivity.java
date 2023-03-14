package com.example.martialarts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        MartialArts martialArts = (MartialArts) getIntent().getSerializableExtra("MartialArts");

        TextView textView = findViewById(R.id.detailsTextView);
        ImageView imageView = findViewById(R.id.imageViewDetails);
        TextView textViewContent = findViewById(R.id.content);

        textView.setText(martialArts.getTittle());
        textViewContent.setText(martialArts.getSummary());
        imageView.setImageResource(martialArts.getImage());


    }
}