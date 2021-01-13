// Phonkrit Chinatiworn 632115031
package Lab7_1;
public class NerfGun {
    private int ID = 1;
    private int ammo = 0;
    private int noAmmo = 0;

    NerfGun(){
        this.ID = 1;
    }

    NerfGun(int ammo){
        this.ammo = ammo;
        this.ID = 2;
    }

    public int fire(){
        if (ammo == 0) {
            System.out.println("There is no ammunition");
            return noAmmo;
        }
        System.out.println("Bang!!");
        this.ammo = ammo-1;
        return ammo;
    }

    public int reload(int rAmmo){
        this.ammo = ammo + rAmmo;
        if (ammo > 15){
            System.out.println("Error!! the ammunition is overload");
            ammo = ammo - rAmmo;
        }
        return ammo;
    }

    public int displayNumOfAmmunition(){
        System.out.println(ammo + " Bullet Left");
        return ammo;
    }

    public int displayGunID(){
        System.out.println("The ID of this gun is " + ID);
        return ammo;
    }
}
