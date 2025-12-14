import java.util.Scanner;

// Custom Exception
class WrongAge extends Exception {
    WrongAge(String message) {
        super(message);
    }
}

// Father Class
class Father {
    protected int fatherAge;

    public Father(int fatherAge) throws WrongAge {
        if (fatherAge < 0) {
            throw new WrongAge("Father's age cannot be negative!");
        }
        this.fatherAge = fatherAge;
        System.out.println("Father created with age: " + fatherAge);
    }
}

// Son Class
class Son extends Father {
    private int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);

        if (sonAge < 0) {
            throw new WrongAge("Son's age cannot be negative!");
        }

        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to father's age!");
        }

        this.sonAge = sonAge;
        System.out.println("Son created with age: " + sonAge);
    }
}

// MAIN CLASS (must be public)
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter father's age: ");
            int fAge = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter son's age: ");
            int sAge = Integer.parseInt(scanner.nextLine());

            Son s = new Son(fAge, sAge);
            System.out.println("\nFamily relationship established successfully!");

        } catch (WrongAge e) {
            System.out.println("\nError: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("\nPlease enter only valid integer numbers!");
        } finally {
            scanner.close();
        }
    }
}