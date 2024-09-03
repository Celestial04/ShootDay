package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GalleryActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PhotoAdapter adapter;
    private List<String> photoUrls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Simulez l'obtention des URLs des photos téléchargées depuis le serveur
        photoUrls = new ArrayList<>();
        photoUrls.add("https://example.com/photo1.jpg");
        photoUrls.add("https://example.com/photo2.jpg");
        photoUrls.add("https://example.com/photo3.jpg");

        adapter = new PhotoAdapter(photoUrls);
        recyclerView.setAdapter(adapter);
    }
}
