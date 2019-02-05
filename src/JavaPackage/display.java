package JavaPackage;
import sun.awt.geom.AreaOp;
import java.lang.String;
import javax.naming.Name;
import java.util.Scanner;
public class display {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Car[] c1 = new Car[1];
        Car[] c2 = new Car[1];
        Car[] c3 = new Car[1];
        Car[] c4 = new Car[1];
        Car[] c5 = new Car[1];
        Car[] c6 = new Car[1];
        String temp;
        int temp1;
        for (int i = 0; i < c1.length; i++) {
            System.out.println("Name = ");
            temp = input.next();
            c1[i] = new Car();
            c1[i].setName(temp);
            System.out.println("Year Of Birth = ");
            temp1 = input.nextInt();
            c2[i] = new Car();
            c2[i].setAge(temp1);

            System.out.println("Make = ");
            temp = input.next();
            c3[i] = new Car();
            c3[i].setMake(temp);
            System.out.println("Plate = ");
            temp = input.next();
            c4[i] = new Car();
            c4[i].setPlate(temp);
            System.out.println("CarName = ");
            temp = input.next();
            c5[i] = new Car();
            c5[i].setCarName(temp);
            System.out.println("CarType = ");
            temp = input.next();
            c6[i] = new Car();
            c6[i].setCarType(temp);
        }
        for (int i = 0; i < c1.length; i++) {
            System.out.println("Name : " + c1[i].getName());
            System.out.println("Age : " + c2[i].getAge());
            {
                System.out.println("Employee has a car\n");
                System.out.println("Make : " + c3[i].getMake());
                System.out.println("Plate : " + c4[i].getPlate());
                System.out.println("CarName : " + c5[i].getCarName());
                System.out.println("CarType : " + c6[i].getCarType());
            }

            MotorCycle[] m1 = new MotorCycle[1];
            MotorCycle[] m2 = new MotorCycle[1];
            MotorCycle[] m3 = new MotorCycle[1];
            MotorCycle[] m4 = new MotorCycle[1];
            MotorCycle[] m5 = new MotorCycle[1];
            for (i = 0; i < m1.length; i++) {
                System.out.println("Name = ");
                temp = input.next();
                m1[i] = new MotorCycle();
                m1[i].setName(temp);
                System.out.println("Year Of Birth = ");
                temp1 = input.nextInt();
                m2[i] = new MotorCycle();
                m2[i].setAge(temp1);

                System.out.println("Make = ");
                temp = input.next();
                m3[i] = new MotorCycle();
                m3[i].setMake(temp);
                System.out.println("Plate = ");
                temp = input.next();
                m4[i] = new MotorCycle();
                m4[i].setPlate(temp);
                System.out.println("MotorCycleType = ");
                temp = input.next();
                m5[i] = new MotorCycle();
                m5[i].setMotorcycleType(temp);

            }
            for (i = 0; i < c1.length; i++) {
                System.out.println("Name : " + m1[i].getName());
                System.out.println("Age : " + m2[i].getAge());
                {
                    System.out.println("Employee has a motorcycle\n");
                    System.out.println("Make : " + m3[i].getMake());
                    System.out.println("Plate : " + m4[i].getPlate());
                    System.out.println("CarName : " + m5[i].getMotorcycleType());
                }


                FixedBasedPartTime[] fd1 = new FixedBasedPartTime[5];


                CommissionBasedPartTime[] ct1 = new CommissionBasedPartTime[5];

                FullTime[] f1 = new FullTime[5];

                PartTime[] p1 = new PartTime[5];

                Intern[] n1 = new Intern[5];
            }
        }
    }
}