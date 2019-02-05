package JavaPackage;
import sun.awt.geom.AreaOp;

import javax.naming.Name;
import java.util.Scanner;
public class display {
        public static void main(String args[])
        {
                  Scanner input=new Scanner(System.in);
                  Car[] c1 = new Car[1];
                  String temp;
                  for(int i=0;i<c1.length;i++)
                  {
                          System.out.println("Make = ");
                          temp=input.next();
                          c1[i]=new Car();
                          c1[i].setMake(temp);
                  }
                  for(int i=0;i<c1.length;i++)
                    {
                        System.out.println("Make : "+ c1[i].getMake());
                    }

                  FixedBasedPartTime[] fd1=new FixedBasedPartTime[5];


                  MotorCycle[] m1=new MotorCycle[5];

                  CommissionBasedPartTime[] ct1= new CommissionBasedPartTime[5];

                  FullTime[] f1=new FullTime[5];

                  PartTime[] p1=new PartTime[5];

                  Intern[] n1= new Intern[5];
            }
}