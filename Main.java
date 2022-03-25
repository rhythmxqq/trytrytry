package com.company;

import java.util.Scanner;
class PrimException extends Exception{
    private double xxx;

    public double getxxx() {
        return xxx;
    }
    public PrimException(String message,double xxx){
        super(message);
        this.xxx = xxx;
    }

}

class primer {
    public static double Exceprion(double x, double y) throws PrimException{
        double z = 0;
        if(y == -1){
            throw new PrimException("delenie na nolik ", y);
        }
        z = (x + y) / (y + 1);
        return z;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x: ");
        double x = in.nextDouble();
        System.out.println("Введите число y: ");
        double y = in.nextDouble();
        try {
            System.out.println(primer.Exceprion(x, y));
        } catch (PrimException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getxxx());
        }
    }
}
