package JavaPackage;

import java.util.Scanner;
import java.util.Scanner;
public class display {
    public static void main(String args[])
    {
        {
            Car c1 = new Car();
            c1.getCarName();
            c1.setCarName("khushi");
            c1.getCarType();
            c1.setCarType("Five Seater");
            c1.PrintMyData();
            FixedBasedPartTime fd1=new FixedBasedPartTime();
            fd1.getRate();
            fd1.setRate(21);
            fd1.getHoursWorked();
            fd1.setHoursWorked(20);
            fd1.getFixedAmount();
            fd1.setFixedAmount(12);
            fd1.PrintMyData();
            MotorCycle m1=new MotorCycle();
            m1.getMake();
            m1.setMake("BMW");
            m1.getPlate();
            m1.setPlate("ca-283-22");
            m1.getMotorcycleType();
            m1.setMotorcycleType("Racer");
            m1.PrintMyData();
            MotorCycle m2=new MotorCycle();
            CommissionBasedPartTime ct1= new CommissionBasedPartTime();
            ct1.getRate();
            ct1.setRate(30);
            ct1.getHoursWorked();
            ct1.setHoursWorked(10);
            ct1.getCommission();
            ct1.setCommission(20);
            ct1.ComissionPerCalcEarnings();
            ct1.PrintMyData();
            CommissionBasedPartTime ct2= new CommissionBasedPartTime();
            FullTime f1=new FullTime();
            FullTime f2=new FullTime();
            Intern n1= new Intern();
            Intern n2= new Intern();


        }
    }
}
