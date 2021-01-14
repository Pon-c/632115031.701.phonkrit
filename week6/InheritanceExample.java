package week6;

public class InheritanceExample {
    public static void main(String[] args) {
        Artist art = new Artist("Ball",20);
        Jobs doctor = new Jobs("Matt",21);
        Jobs engineer = new Jobs("Vajra",18);
        Jobs dancer = new Jobs("Pop",32);
        Jobs driver = new Jobs("Joy",27);
        Jobs runner = new Jobs("Dyne",23);
        
        art.genre = "hip hop";
        art.gender = "Male";
        doctor.genre = "Doctor";
        doctor.gender = "Male";
        engineer.genre = "Engineer";
        engineer.gender = "Female";
        dancer.genre = "Dancer";
        dancer.gender = "Male";
        driver.genre = "Driver";
        driver.gender = "Female";
        runner.genre = "Runner";
        runner.gender = "Male";
        art.introduce();
        art.playMusic();
        doctor.introduce();
        doctor.showJobs();
        engineer.introduce();
        engineer.showJobs();
        dancer.introduce();
        dancer.showJobs();
        driver.introduce();
        driver.showJobs();
        runner.introduce();
        runner.showJobs();

    }
}
