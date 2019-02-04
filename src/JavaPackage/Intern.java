package JavaPackage;
import java.util.Scanner;
public class Intern extends Employee implements IPrintable{
    private  String SchoolNamr;

    public void PrintMyData()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Intern{" +
                "SchoolNamr='" + SchoolNamr + '\'' +
                '}';
    }
}