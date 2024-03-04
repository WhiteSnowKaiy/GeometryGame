import java.util.ArrayList;
import java.util.Scanner;

import models.Model;
import models.Square;

public class App {
    public static String username;
    public static ArrayList<Model> listOfModels;

    public static void main(String[] args) {
        listOfModels = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                introduction(scanner);
                pickModel(scanner);
            }
        }
    }

    public static void introduction(Scanner scanner){
        System.out.println("Hello human, please enter your name");

        username = scanner.nextLine();        

        System.out.println("Hello "+ username +", It's nice to meet you. Let's continue further to pick a model.");
    }

    public static void pickModel(Scanner scanner) {
        System.out.println("Create model (1) Rectangle, (2) Circle, (3) Square, or select a model ");
        int choice = scanner.nextInt();
    
        scanner.nextLine();
    
        switch (choice) {
            case 1:
                // TODO: Make Rectangle
                break;
            case 2:
                // TODO: Make Circle
                break;
            case 3:
                Square square = new Square();
                
                // Ensure listOfModels is initialized before adding elements
                if (listOfModels == null) {
                    listOfModels = new ArrayList<>();
                }
                
                listOfModels.add(square);
    
                System.out.println("Input size of x axis (f), y axis (f) and yaw (int), with name (str), this name must be unique");
                float xAxisSize = scanner.nextFloat();
                float yAxisSize = scanner.nextFloat();
                int yaw = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                String name = scanner.nextLine();
    
                square.setxAxis(xAxisSize);
                square.setyAxis(yAxisSize);
                square.setYaw(yaw);
    
                if (listOfModels.isEmpty()) {
                    square.setName(name);
                    break;
                }
    
                for (Model modelInList : listOfModels) {
                    if (modelInList.getName().equals(name)) {
                        break;
                    }
                }
                square.setName(name);
    
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
    }
    
}