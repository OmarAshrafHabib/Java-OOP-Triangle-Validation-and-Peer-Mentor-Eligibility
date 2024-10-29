import java.util.Scanner;

public class PeerMentor {
    public static void main(String[] args) {

        System.out.println("Are you an Undergrad student? ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        if (userInput.equals("yes")) {
            System.out.println("Will you be on a study term? ");
            String q2 = sc.nextLine();
            if (q2.equals("yes")) {
                System.out.println("Is your GPA at least 2.7?");
                String q3 = sc.nextLine();
                if (q3.equals("yes")) {
                    System.out.println("You should apply!");
                } else if (q3.equals("no")) {
                    System.out.println("Sorry, you cannot apply.");
                }
            } else if (q2.equals("no")) {
                System.out.println("Sorry, you cannot apply.");
            }
        }

        else if (userInput.equals("no")) {
            System.out.println("Are you a grad student? ");
            String q4 = sc.nextLine();
            if (q4.equals("yes")) {
                System.out.println("Do you have your supervisor's permission?");
                String q5 = sc.nextLine();
                if (q5.equals("yes")) {
                    System.out.println("You should apply!");
                } else if (q5.equals("no")) {
                    System.out.println("Sorry, you cannot apply.");
                }
            } else if (q4.equals("no")) {
                System.out.println("Sorry, you cannot apply.");
            }
        }

    }
}
