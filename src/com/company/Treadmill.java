package com.company;

public class Treadmill extends Obstacle {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean contest(Contestant contestant) {
        if (contestant.run(length)) {
            System.out.println("Пробежал дистанцию");
            return true;
        } else {
            System.out.println("Не смог пробежать дистанцию");
            return false;
        }
    }
}
