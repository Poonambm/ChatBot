import java.util.Scanner;

public class ChatBot {
    static String name;

    // Greeting
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name? ");
        name = scanner.nextLine();
        System.out.println("Hi " + name);

    }// Asking the user to repeat their name

    public static void repeatname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you repeat your name");
        name = scanner.nextLine();
        System.out.println("How are you doing today " + name);
    }

    public static void guessuserage() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the character that matches to your age ?");
            System.out.println("Enter Z for Generation Z (ages 7-22)");
            System.out.println("Enter M for Millennials (ages 23-38)");
            System.out.println("Enter X for Generation X (ages 39-54)");
            System.out.println("Enter B for Boomers (ages 55-73)");
            System.out.println("Enter S for silent (ages 74-91)");
            String userInput = scanner.nextLine();
            if (userInput.equals("Z")) {
                System.out.println(name + " your age is 15 years");
                break;
            } else if (userInput.equals("M")) {
                System.out.println(name + " your age is 29 years");
                break;
            } else if (userInput.equals("X")) {
                System.out.println(name + " your age is 40 years");
                break;
            } else if (userInput.equals("B")) {
                System.out.println(name + " your age is 60 years");
                break;
            } else if (userInput.equals("S")) {
                System.out.println(name + " your age is 80 years");
                break;
            } else {
                System.out.println("Only enter valid choices");
            }
        }
    }

    public static void counttonum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 25");
        int end = scanner.nextInt();

        for (int i = 1; i <= end; i++) {
            System.out.println(i);
        }
    }
    public static void javaQuiz() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose the correct answer for below question");
            System.out.println("If a java variable is declared as private, where may the variable be accessed?");
            System.out.println("a:A private variable may only be accessed within the class in which it is declared.");
            System.out.println("b:A private variable may be accessed outside the class in which it is declared.");
            System.out.println("c:A private variable may be changed outside the class in which it is declared.");
            System.out.println("d:A private variable may be accessed by another class in which it wasn't declared.");
                      
            String userInput = scanner.nextLine();
            if (userInput.equals("a")) {
                System.out.println(name + " your answer is correct");
                break;
            } else if (userInput.equals("b")) {
                System.out.println(name + " your answer is wrong plz retry");
               
            } else if (userInput.equals("c")) {
                System.out.println(name + "your answer is wrong plz retry");
            
            } else if (userInput.equals("d")) {
                System.out.println(name + " your answer is wrong plz retry");
              
            
            } else {
                System.out.println("Only enter valid choices");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        greeting();
       repeatname();
        guessuserage();
        counttonum();
        javaQuiz();
    }

}
