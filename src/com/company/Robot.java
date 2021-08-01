package com.company;

public class Robot implements Contestant {
    private int maxHeightJump;
    private int maxDistanceRun;
    Robot(){
        this.maxDistanceRun = 12000;
        this.maxHeightJump = 20;
    }
    @Override
    public boolean jump(int height) {
        if(height < 0){
            System.out.println("Некорректное значение");
            return false;
        } else if(height >=maxHeightJump) {
            System.out.println("Не справился с препятствием");
            return false;
        } else  {
            System.out.println("Успешно справился с препятствием");
            return true;
        }


    }

    @Override
    public boolean run(int distance) {
        if(distance < 0){
            System.out.println("Некорректное значение");
            return false;
        } else if(distance >=maxDistanceRun) {
            System.out.println("Не справился с препятствием");
            return false;
        } else  {
            System.out.println("Успешно справился с препятствием");
            return true;
        }
    }
}
