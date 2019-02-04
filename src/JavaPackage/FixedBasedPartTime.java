package JavaPackage;
import java.util.Scanner;
public class FixedBasedPartTime extends PartTime implements IPrintable{
    private int FixedAmount;

    public int getFixedAmount() {
        return FixedAmount;
    }

    public void setFixedAmount(int fixedAmount) {
        FixedAmount = fixedAmount;
    }

    public int FixedAmountCalcEarnings()
    {
        return (Rate*HoursWorked)+FixedAmount;
    }
    public void PrintMyData()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Employee is PartTime / Fixed Amt" +
                ", \nRate=" + Rate +
                ", \nHoursWorked=" + HoursWorked +
                "\nFixedAmount=" + FixedAmount ;
    }
}
