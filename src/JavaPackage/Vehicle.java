package JavaPackage;
import java.util.Scanner;
public abstract class Vehicle extends Employee implements IPrintable {
    private String Make;
    private String Plate;

    public String getMake()
    {
        return Make;
    }

    public void setMake(String make)
    {
        Make = make;
    }

    public String getPlate()
    {
        return Plate;
    }

    public void setPlate(String plate)
    {
        Plate = plate;
    }
    public void PrintMyData()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Make='" + Make + '\'' +
                ", Plate='" + Plate + '\'' +
                '}';
    }
}