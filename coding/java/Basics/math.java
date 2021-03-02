import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        double x = 12.456;
        double y = 14;
        double z = Math.max(x, y);
        System.out.println(z);
        double a = Math.abs(x);
        System.out.println(a);
        System.out.println(Math.round(x));

        System.out.println(Math.ceil(x)); 
        System.out.println(Math.floor(x));


        //hypotenuse of a triangle
        double xx;
        double yy;
        double zz;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x : ");
        xx = scanner.nextDouble();
        System.out.println("Enter y : ");
        yy = scanner.nextDouble();

        zz = Math.sqrt((xx*xx)+(yy*yy));
        System.out.println("The Hypotenuse of the triangle : "+zz);

        scanner.close();

    }
    
}
