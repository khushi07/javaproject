package JavaPackage;
import java.util.Scanner;
public class CommissionBasedPartTime extends PartTime implements IPrintable
{
    int Commission;

    public int getCommission() {
        return Commission;
    }

    public void setCommission(int commission) {
        Commission = commission;
    }

    public double ComissionPerCalcEarnings()
    {
        return (Rate*HoursWorked)+Commission*(Rate*HoursWorked)/100;
    }
    public void PrintMyData()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        super.PrintMyData();
        return "Employee is a Part Time/Commissioned" +
                ", \nRate=" + Rate +
                ", \nHoursWorked=" + HoursWorked +
                "\nCommission=" + Commission +"%"+
                "\nEarnings= " + ComissionPerCalcEarnings()+"("+Rate*HoursWorked+" + "+Commission+"% of "+Rate*HoursWorked+")";
    }
}
