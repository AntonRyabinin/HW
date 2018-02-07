package by.htp.jd01.less06un03.hw06;

import java.util.Scanner;

public class Coordinate {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
		
        int x = init("Enter coordinate 'x': ");
        int y = init("Enter coordinate 'y': ");
		
        boolean check = checkArea(x, y);

        show(check);
    }

    public static int init(String msg){

        System.out.print(msg);
        while (!sc.hasNextInt()) {
            System.out.println("The value you have entered is not integer!");
            System.out.print(msg);
            sc.next();
        }
        int coordinate = sc.nextInt();
        return coordinate;
    }


    public static boolean checkArea(int x, int y){

        return ((x>=-4 && y>=-3 && x<=4) || (x>=-2 && y<=3 && x<=2));

    }


    public static void show(boolean check){

        System.out.println("The answer is: " + check);

    }

}
