package JavaPackage;
import java.util.Scanner;
public class MotorCycle extends Vehicle implements IPrintable
{
    String MotorcycleType;

    public String getMotorcycleType() {
        return MotorcycleType;
    }

    public void setMotorcycleType(String motorcycleType) {
        MotorcycleType = motorcycleType;
    }

    public void PrintMyData()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Employee has a Motorcycle" +
                "\nMotorcycleType='" + MotorcycleType + '\'';
    }
}

