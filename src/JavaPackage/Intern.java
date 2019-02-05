package JavaPackage;
import java.util.Scanner;
public class Intern extends Employee implements IPrintable{
    private  String SchoolName;

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public void PrintMyData()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        super.PrintMyData();
        return "Employee is an Intern" +
                "\nSchoolName='" + SchoolName + '\'' +
                "\nTotal Payroll= "+1000+
                '}';
    }
}