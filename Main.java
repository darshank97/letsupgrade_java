import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double tax=0,tax_amt=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Enter the year of birth");
        int year=sc.nextInt();
        System.out.println("Enter the month of birth");
        int month=sc.nextInt();
        System.out.println("Enter the date of birth");
        int date=sc.nextInt();
        System.out.println("Enter the salary");
        double salary=sc.nextInt();

        System.out.println("Name:"+name);
        int calculated_age=2020-year;
        System.out.println("Age:"+calculated_age);

        if(salary>500000){
            tax=0.2;
            tax_amt=salary*tax;
            salary=salary-(salary*tax);
            System.out.println("Annual salary:"+salary);
            System.out.println("Tax amount:"+tax_amt);
        }

        else if(salary>400000){
            tax=0.15;
            tax_amt=salary*tax;
            salary=salary-(salary*tax);
            System.out.println("Annual salary:"+salary);
            System.out.println("Tax amount:"+tax_amt);
        }

        else if(salary>300000){
            tax=0.1;
            tax_amt=salary*tax;
            salary=salary-(salary*tax);
            System.out.println("Annual salary:"+salary);
            System.out.println("Tax amount:"+tax_amt);
        }

        else if(salary>200000){
            tax=0.05;
            tax_amt=salary*tax;
            salary=salary-(salary*tax);
            System.out.println("Annual salary:"+salary);
            System.out.println("Tax amount:"+tax_amt);
        }


    }
}
