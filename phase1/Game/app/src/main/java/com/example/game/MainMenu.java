package com.example.game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    /**
     * If a view object in this layout is clicked, decide what happens.
     *
     * @param v the view object that is clicked.
     */
    public void beginLevelOne(View v) {
        Intent levelOne = new Intent(this.getBaseContext(), MainActivity.class);
        startActivity(levelOne);
    }

    public void beginLevelTwo(View v) {
        Intent levelTwo = new Intent(this.getBaseContext(), PauseScreen.class);
        startActivity(levelTwo);
    }

    public void beginLevelThree(View v) {
        Intent levelThree = new Intent(this.getBaseContext(), LevelThreeActivity.class);
        startActivity(levelThree);
    }

}