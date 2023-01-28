import java.util.Scanner;
public class Demo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for rectangle or 2 for circle:");
            int choice = sc.nextInt();
            
             // Validate user input
             if (choice != 1 && choice != 2) {
                System.out.println("Invalid input. Please enter 1 or 2.");
                return;
             }
                                            
             Shape shape;
             if (choice == 1) {
                System.out.println("Enter length:");
                double length = sc.nextDouble();
                System.out.println("Enter width:");
                double width = sc.nextDouble();
                shape = new Rectangle(length, width);
             }
             else{
                System.out.println("Enter radius:");
                double radius = sc.nextDouble();
                shape = new Circle(radius);
             }
                                            
             System.out.println("Area: " + shape.getArea());                                                                                                                                                                                
             }
}
