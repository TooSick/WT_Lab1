package com.lizaveta16.task9;

import java.awt.*;
import java.util.ArrayList;

public class Bucket {

    private final ArrayList<Ball> balls = new ArrayList<>();;

    public void addBall(Ball ball){
        balls.add(ball);
    }

    public double getWeight(){
        double weight = 0;
        for (Ball ball: balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int getCountByColor(Color color){
        int count = 0;
        for (Ball ball: balls) {
            if(ball.getColor() == color){
                count++;
            }
        }
        return count;
    }
}
