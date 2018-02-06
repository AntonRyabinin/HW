package by.htp.jd01.less06un03.hw06;
import java.util.Scanner;
public class Coordinate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean g;

        if(x>=-4 && y>=-3 && x<=4){
            g = true;
        } else if(x>=-2 && y<=3 && x<=2){
            g = true;
        } else {
            g = false;
        }
        System.out.println(g);
    }
}
