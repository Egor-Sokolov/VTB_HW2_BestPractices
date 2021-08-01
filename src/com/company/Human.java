package com.company;

public class Human implements Contestant {
    private int maxHeightJump;
    private int maxDistanceRun;
    Human(){
        this.maxDistanceRun = 1200;
        this.maxHeightJump = 2;
    }

    @Override
    public boolean jump(int height) {
        if(height < 0){
            System.out.println("Некорректное значение");
            return false;
        } else if(height >=maxHeightJump) {
            System.out.println("Человек не перепрыгнул");
            return false;
        } else  {
            System.out.println("Человек перепрыгнул");
            return true;
        }


    }

    @Override
    public boolean run(int distance) {
        if(distance < 0){
            System.out.println("Некорректное значение");
            return false;
        } else if(distance >=maxDistanceRun) {
            System.out.println(" Человек Не пробежал");
            return false;
        } else  {
            System.out.println("Человек пробежал");
            return true;
        }
    }
}
