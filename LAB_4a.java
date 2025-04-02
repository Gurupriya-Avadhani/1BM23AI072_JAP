import java.util.Scanner;
public class LAB_4a {
        public enum DayOfWeek{
            SUNDAY,
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY;
            public boolean isWorkday(){
                return(this!=SATURDAY && this!=SUNDAY);
            }
        }
        public static void main(String[] args){
            System.out.println("is monday a workday?"+DayOfWeek.MONDAY.isWorkday());
            System.out.println("is saturday a workday?"+DayOfWeek.SATURDAY.isWorkday());
        }
    }
