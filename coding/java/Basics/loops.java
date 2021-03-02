import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.println("Enter Your Age");
        int age = Integer.parseInt(scanner.nextLine());

        if(age==18){
            System.out.println("Welcome to Graduation");
        }
        else if(age <18){
            System.out.println("Drinking age below");
        }
        else if(age>100){
            System.out.println("Welcome to Godhood");
        }
        else{
            System.out.println("Invalid Input");
        }
        scanner.close();
    }
    
}
    
}
