package com.example.game.LevelOne;

import java.util.ArrayList;

/**
 * A coin in level 1
 */
class Coin extends TappableObject {

    /**
     * Constructor for a new coin object
     */
    Coin(int newX, int newY) {
        super(newX, newY, 50, 50);
    }

    /**
     * Communicates with the presenter to draw a coin at its x and y location.
     */
    @Override
    void draw(LevelOnePresenterInterface presenter) {
        presenter.drawCoin(getX(), getY());
    }

    /**
     * Generates the 'response' to a coin getting tapped, i.e. how it affects game stats (lives, coins, points).
     *
     * @return an ArrayList where the 1st element is the change in gold, 2nd change in points, 3rd change in lives.
     */
    ArrayList<Integer> tapResponse() {
        ArrayList<Integer> response = new ArrayList<>();
        response.add(1); //Change in gold associated with a piece of gold
        response.add(100); //change in points associated with a piece of gold
        response.add(0); //change in lives associated with a piece of gold.
        return response;
    }

}
