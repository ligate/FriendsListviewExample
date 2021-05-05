package com.exercise.friends;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
ListView myFriendsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myFriendsListView = findViewById(R.id.friends);

        ArrayList<String> myFriends = new ArrayList<String>();

        myFriends.add("John");
        myFriends.add("Steve");
        myFriends.add("mark");
        myFriends.add("Dennis");
        myFriends.add("tim");
        myFriends.add("Robin");
        

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myFriends);

        myFriendsListView.setAdapter(arrayAdapter);

        myFriendsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(),"Hello:" + myFriends.get(i), Toast.LENGTH_LONG).show();




            }
        });

    }
}