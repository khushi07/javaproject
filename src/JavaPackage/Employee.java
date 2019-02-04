package JavaPackage;
import java.util.Scanner;
    abstract public class Employee implements IPrintable{
        private String Name;
        private int age;
        private int CurrentYear=2019;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int CalcBirthYear(int a)
        {
            a=this.CurrentYear-this.age;
            return a;
        }
        public int CalcEarnings()
        {
            return 1000;
        }
        public void PrintMyData()
        {
            System.out.println(toString());
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "Name='" + Name + '\'' +
                    ", age=" + age +
                    ", CurrentYear=" + CurrentYear +
                    '}';
        }
    }
