package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Contestant> contestants = new ArrayList<>();
        contestants.add(new Human());
        contestants.add(new Cat());
        contestants.add(new Robot());

        List <Obstacle> obstacles = new ArrayList<>();
        obstacles.add(new Wall(7));
        obstacles.add(new Treadmill(1230));
        obstacles.add(new Treadmill(10000));


        for(Contestant contestant : contestants){
            for (Obstacle obstacle : obstacles){
                if(!obstacle.contest(contestant))break;
            }

        }
    }
}
