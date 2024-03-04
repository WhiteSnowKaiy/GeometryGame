import java.util.Scanner;

public class App {
    public static String username;

    public static void main(String[] args) {   
        while (true){
            introduction();
            pickModel();
        }
    }

    public static void introduction(){
        System.out.println("Hello human, please enter your name");

        try (Scanner scanner = new Scanner(System.in)) {
            username = scanner.nextLine();
        }

        System.out.println("Hello "+ username +", It's nice to meet you. Let's continue further to pick a model.");
    }

    public static void pickModel(){
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Pick model (1) Rectangle, (2) Circle, (3) Square");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            } 
        }
    }
}