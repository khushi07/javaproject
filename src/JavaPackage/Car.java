package JavaPackage;
import java.util.Scanner;
public class Car extends Vehicle implements IPrintable
{
    private String CarName;
    private String CarType;

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public String getCarType() {
        return CarType;
    }

    public void setCarType(String carType) {
        CarType = carType;
    }
    public void PrintMyData()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Employee has a Car " +
                "\nCarName="  + CarName + '\'' +
                "\nCarType= " + CarType + '\'';
    }
}





