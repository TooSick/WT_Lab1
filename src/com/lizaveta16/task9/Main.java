package com.lizaveta16.task9;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        var bucket = new Bucket();
        bucket.addBall(new Ball(Color.BLACK, 2));
        bucket.addBall(new Ball(Color.BLUE, 7));
        bucket.addBall(new Ball(Color.RED, 12));
        bucket.addBall(new Ball(Color.BLUE, 4));

        System.out.println(bucket.getWeight());
        System.out.println((long) bucket.getCountByColor(Color.BLUE));
    }
}

// task10
// javac -d binTask9 -sourcepath src src/com/lizaveta16/task9/Main.java
// java -classpath ./binTask9 com.lizaveta16.task9.Main

//task11
// cd /binTask9
// jar cfe task9.jar com.lizaveta16.task9.Main .
// java -jar task9.jar
