// YRAY, ZACARIAS N.
// BSCS 1A

import java.util.Scanner; 

class LabActivity1EmployeeInformationSystem {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String userName;
    String lastName;
    int age;
    double hours;
    double wage;

    System.out.print("Enter your first name: "); 
    userName = myObj.nextLine();   

    System.out.print("Enter your last name: ");
    lastName = myObj.nextLine();

    System.out.print("Enter your age: ");
    age = myObj.nextInt();
    myObj.nextLine(); 

    System.out.print("Enter hours worked: ");
    hours = myObj.nextDouble();
    myObj.nextLine(); 

    System.out.print("Enter hourly wage: ");
    wage = myObj.nextDouble();
    myObj.nextLine(); 

    double totalWage = hours * wage;

    System.out.println("Employee Information\n---------------------");
    System.out.println("Fullname is : "+userName+" "+lastName);    
    System.out.println("Age is      : " + age + " years old");
    System.out.println("Daily salary: " + totalWage);

    myObj.close(); 
  }
}