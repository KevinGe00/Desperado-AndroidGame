package com.example.game;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public abstract class AbstractActivity extends AppCompatActivity {
    public GameView currView;
    public boolean backPress = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (currView != null) {
            currView.stop();
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        if (currView != null) {
            currView.resume();
            currView.levelPresenter.unpauseGame();
        }

    }

    /**
     * Instantiate the win game state.
     * @param points the points that the game was lost with.
     * @param goldCoins the gold that was won with.
     * @param lives the lives remaining that were won with.
     */
    public void winGame(int points, int goldCoins, int lives) {
        Intent win = new Intent(this, WinActivity.class);
        win.putExtra("Points", points);
        win.putExtra("Gold", goldCoins);
        win.putExtra("Lives", lives);
        win.putExtra("Previous", this.getClass());
        startActivity(win);
        finish();
    }

    /**
     * Instantiate the lose game state.
     * @param points the points that the game was lost with.
     * @param goldCoins the gold that was lost with.
     */
    public void loseGame(int points, int goldCoins) {
        Intent lose = new Intent(this, LoseActivity.class);
        lose.putExtra("Points", points);
        lose.putExtra("Gold", goldCoins);
        lose.putExtra("Lives", 0);
        lose.putExtra("Previous", this.getClass());
        startActivity(lose);
        finish();

    }


    public void pause() {
        Intent pauseMenu = new Intent(this, PauseScreen.class);
        startActivityForResult(pauseMenu, 0);
    }


}
