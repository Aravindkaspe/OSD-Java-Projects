import java.util.Scanner;

public class MyProgram{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Name : ");
        String name = scan.nextLine();

        System.out.println("Enter the age");
        int age = scan.nextInt();

        System.out.println("Enter the address");
        String address = scan.nextLine();
    }
}