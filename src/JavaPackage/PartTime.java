package JavaPackage;
import java.util.Scanner;
    abstract public class PartTime extends Employee implements IPrintable{
        int Rate;
        int HoursWorked;

        public int getRate() {
            return Rate;
        }

        public void setRate(int rate) {
            Rate = rate;
        }

        public int getHoursWorked() {
            return HoursWorked;
        }

        public void setHoursWorked(int hoursWorked) {
            HoursWorked = hoursWorked;
        }
        public void PrintMyData()
        {
            System.out.println(toString());
        }

        @Override
        public String toString() {
            return "PartTime{" +
                    "Rate=" + Rate +
                    ", HoursWorked=" + HoursWorked +
                    '}';
        }
    }

