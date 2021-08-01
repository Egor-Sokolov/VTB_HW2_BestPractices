package com.company;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean contest(Contestant contestant) {
        if (contestant.run(height)) {
            System.out.println("Перепрыгнул стену");
            return true;
        } else {
            System.out.println("Не смог перепрыгнуть стену");
            return false;
        }
    }
}
