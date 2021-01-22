package week7;

public class MountainBicycle {
    int speed,cspeed,schange,gearc; //cspeed = current speed, schange = speed change
    int conti = 1;

    public MountainBicycle(int cspeed){
    }

    public void showMBicycle(int cspeed){
        this.cspeed = cspeed;
        System.out.println("Current speed : " + cspeed);
    }

    public void speedUpMBicycle(int schange, int gearc){
        this.schange = schange;
        this.gearc = gearc;
        speed = cspeed + (schange * gearc);
        if (speed <= 99){
        System.out.println("Your current speed : " + speed);
        cspeed = speed;
        }
        else{
        System.out.println("You go above 99 KM/h limit, limiting current speed to 99 KM/h");
        speed = 99;
        cspeed = speed;
        }
    }

    public void breakMBicycle(int schange){
        this.schange = schange;
        speed = cspeed - (schange * 5);
        if (speed >= 0){
            System.out.println("Your current speed : " + speed);
            cspeed = speed;
            }
            else{
            System.out.println("You can't go below 0 KM/h limit, limiting current speed to 0 KM/h");
            speed = 0;
            cspeed = speed;
            }
    }
}
