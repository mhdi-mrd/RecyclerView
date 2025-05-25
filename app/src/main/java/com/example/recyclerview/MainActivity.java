package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // ایجاد یک لیست نمونه از کتاب‌ها
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Book One", "Author A", 2020));
        bookList.add(new Book("Book Two", "Author B", 2021));
        bookList.add(new Book("Book Three", "Author C", 2022));

        BookAdapter adapter = new BookAdapter(bookList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
