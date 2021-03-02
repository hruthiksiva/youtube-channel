import java.util.Scanner;

public class scannerfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your name");
        String name = scanner.nextLine();

        System.out.println("how old are you");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Fav food");
        String food = scanner.nextLine();

        System.out.println("My name is "+name+ " age "+age+" food i like is "+food);
        scanner.close();
    }
}
