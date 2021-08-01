package com.company;

public class Cat implements Contestant {
    private int maxHeightJump;
    private int maxDistanceRun;
    Cat(){
        this.maxDistanceRun = 200;
        this.maxHeightJump = 3;
    }
    @Override
    public boolean jump(int height) {
        if(height < 0){
            System.out.println("Некорректное значение");
            return false;
        } else if(height >=maxHeightJump) {
            System.out.println(" Кот не перепрыгнул");
            return false;
        } else  {
            System.out.println(" Кот Успешно перепрыгнул");
            return true;
        }


    }

    @Override
    public boolean run(int distance) {
        if(distance < 0){
            System.out.println("Некорректное значение");
            return false;
        } else if(distance >=maxDistanceRun) {
            System.out.println("Кот пробежал");
            return false;
        } else  {
            System.out.println("Кот не пробежал");
            return true;
        }
    }
}
