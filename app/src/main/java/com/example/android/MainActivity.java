package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //create a textview
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set textview to ID + registerContextview
        textView = findViewById(R.id.article);
        registerForContextMenu(textView);
    }

    //create a context menu and inflate the menu.xml
    //menu.xml holds the edit/share/delete options
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
    }


    //onTextItemSelected -> grab the ID of the menu.xml items
    //make a toast for each one selected
    //return the item selected
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.editOption:
                Toast.makeText(this, "Clicked Edit", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.shareOption:
                Toast.makeText(this, "Clicked Share", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.deleteOption:
                Toast.makeText(this, "Clicked Delete", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

}