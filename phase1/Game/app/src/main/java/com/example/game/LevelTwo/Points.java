package com.example.game.LevelTwo;

import android.graphics.Canvas;

import com.example.game.GameObject;

public class Points extends GameObject {
    private int points;

    public void setPoints(int points) {
        this.points = points;
    }

    public Points(int x, int y, int size, int color, int points) {
        super(x, y, size, color);
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawText("Points: " + Integer.toString(this.points), x, y, getPaintText());
    }
}