package Project;

import java.util.Scanner;

public class MarsRovers {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the upper-right coordinates of the plateau
	        System.out.println("Enter X Coordinate");
	        int maxX = scanner.nextInt();
	        System.out.println("Enter Y Coordinate");
	        int maxY = scanner.nextInt();
	        scanner.nextLine();

	        StringBuilder output = new StringBuilder();

	        // Process rovers
	        while (scanner.hasNext()) {
	            System.out.println("Enter X Coordinate");
	            int x = scanner.nextInt();
	            System.out.println("Enter Y Coordinate");
	            int y = scanner.nextInt();
	            System.out.println("Enter Direction");
	            char direction = scanner.next().charAt(0);
	            scanner.nextLine();

	            Rover rover = new Rover(x, y, direction);

	            // Read rover's instructions
	            String instructions = scanner.nextLine();

	            // Process instructions and update rover's position
	            rover.processInstructions(instructions, maxX, maxY);

	            // Append the final position to the output
	            output.append(rover.getPosition()).append("\n");
	        }

	        scanner.close();

	        // Print the final positions of all rovers
	        System.out.println(output.toString().trim());
	    }
	}


