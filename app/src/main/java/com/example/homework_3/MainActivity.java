package com.example.homework_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Contact> contact = new ArrayList<>();
    private RecyclerView contactRecycleView;
    private ContactsAdapter adapter = new ContactsAdapter(contact);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactRecycleView = findViewById(R.id.recycle_view);
        loadData();
        adapter = new ContactsAdapter(contact);
        contactRecycleView.setAdapter(adapter);
    }
    private void loadData() {
        contact.add(new Contact("23","Alex","Johnson"));
        contact.add(new Contact("18","Barbara","Sweet"));
        contact.add(new Contact("20","Brandan","Blunt"));
        contact.add(new Contact("22","Cassidy","Caron"));
        contact.add(new Contact("17","Danny","Dakota"));
        contact.add(new Contact("19","Margaret","Evelin"));
        contact.add(new Contact("21","larry","Wood"));
        contact.add(new Contact("25","Emma","Stone"));
    }
}