package src.main.Exercises;

class Car{
    //Class Member Variables & Fields
    String sModel;
    int iGear;
    int iHighestSpeed;
    String sColor;
    int iMake;
    boolean bLeftHandDrive;
    String sTransmission;
    int iTyres;
    int iDoors;

    public void DisplayCharacterstics(){
        System.out.println("Model of the com.Exercises.Car: " +  sModel);
        System.out.println("Number of gears in the com.Exercises.Car: " +  iGear);
        System.out.println("Max speed of the com.Exercises.Car: " +  iHighestSpeed);
        System.out.println("Color of the com.Exercises.Car: " +  sColor);
        System.out.println("Make of the com.Exercises.Car: " +  iMake);
        System.out.println("Transmission of the com.Exercises.Car: " +  sTransmission);

    }
}

public class ClassTextExercise {

    public static void main (String [] args){
        //Use the com.Exercises.Car keyword to declare com.Exercises.Car Class variable
        Car Toyota;
        Toyota = new Car();

        Toyota.bLeftHandDrive = true;
        Toyota.iDoors = 4;
        Toyota.iGear = 5;
        Toyota.iHighestSpeed = 200;
        Toyota.iMake = 2014;
        Toyota.iTyres = 4;
        Toyota.sColor = "Black";
        Toyota.sTransmission = "Manual";
        Toyota.sModel = "Camry";

        //Using com.Exercises.Car class method
        Toyota.DisplayCharacterstics();
    }

}
