// Phonkrit Chinatiworn 632115031
package week7;

import java.util.Scanner;

public class MainBicycle {
    public static void main(String[] args) {

        Bicycle b = new Bicycle(0);
        MountainBicycle mb = new MountainBicycle(0);
        Scanner input = new Scanner(System.in);

        System.out.print("Input Bicycle type \n 1 for Normal , 2 for Mountain :");
        int select = input.nextInt();

        if (select == 1){
        System.out.print("Insert current speed : ");
        int speed = input.nextInt();
        b.showBicycle(speed);

        int change;
        do {
        System.out.print("Do you want to change speed? | input '0' to stop : ");
        change = input.nextInt();
        if (change == 0){
            System.exit(0);
        }
        else{
            System.out.print("Do you want to speed up or break \n Speed up = 1, Break = any number : ");
            int choose = input.nextInt();
            if (choose == 1) {
                System.out.print("Input gears change : ");
                int schange = input.nextInt();
                b.speedUpBicycle(schange);
            }
            else {
                System.out.print("Input break change : ");
                int schange = input.nextInt();
                b.breakBicycle(schange);
            }
        }
    }while (change != 0);

    }
    else if (select == 2){
        Scanner inputm = new Scanner(System.in);
        System.out.print("Insert current speed : ");
        int speedm = inputm.nextInt();
        mb.showMBicycle(speedm);

        int changem;
        do {
        System.out.print("Do you want to change speed? | input '0' to stop : ");
        changem = inputm.nextInt();
        if (changem == 0){
            System.exit(0);
        }
        else{
            System.out.print("Do you want to speed up or break \n Speed up = 1, Break = any number : ");
            int choose = inputm.nextInt();
            if (choose == 1) {
                System.out.print("Input speed change : ");
                int schangem = inputm.nextInt();
                System.out.print("Input gears change : ");
                int gearcm = inputm.nextInt();
                mb.speedUpMBicycle(schangem,gearcm);
            }
            else {
                System.out.print("Input break change : ");
                int schangem = inputm.nextInt();
                mb.breakMBicycle(schangem);
            }
        }
        }while (changem != 0);
    }
    
    else {
        System.out.print("Please input valid option");
    }
    }
}
