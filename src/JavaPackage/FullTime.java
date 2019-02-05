package JavaPackage;
import java.util.Scanner;
public class FullTime extends Employee implements IPrintable {
    private int Salary;
    private int Bonus;

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getBonus() {
        return Bonus;
    }

    public void setBonus(int bonus) {
        Bonus = bonus;
    }

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
        return "Employee is a FullTime" +
                "\nSalary=" + Salary +
                ", \nBonus=" + Bonus +
                '}';
    }
}