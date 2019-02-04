package JavaPackage;
import java.util.Scanner;
public class FullTime extends Employee implements IPrintable {
    private int Salary;
    private int Bonus;
    public int BonusCalcEarnings()
    {
        return Salary+Bonus;
    }

    public void PrintMyData()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "FullTime{" +
                "Salary=" + Salary +
                ", Bonus=" + Bonus +
                '}';
    }
}
