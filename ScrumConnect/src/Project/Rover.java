package Project;

import java.util.Scanner;

public class Rover {

	 private int x;
	    private int y;
	    private char direction;

	    public Rover(int x, int y, char direction) {
	        this.x = x;
	        this.y = y;
	        this.direction = direction;
	    }
	    
	    private void turnLeft() {
	        switch (direction) {
	            case 'N':
	                direction = 'W';
	                break;
	            case 'W':
	                direction = 'S';
	                break;
	            case 'S':
	                direction = 'E';
	                break;
	            case 'E':
	                direction = 'N';
	                break;
	        }
	    }
	    
	    private void turnRight() {
	        switch (direction) {
	            case 'N':
	                direction = 'E';
	                break;
	            case 'E':
	                direction = 'S';
	                break;
	            case 'S':
	                direction = 'W';
	                break;
	            case 'W':
	                direction = 'N';
	                break;
	        }
	    }
	    
	    private void moveForward(int maxX, int maxY) {
	        switch (direction) {
	            case 'N':
	                y = Math.min(y + 1, maxY);
	                break;
	            case 'E':
	                x = Math.min(x + 1, maxX);
	                break;
	            case 'S':
	                y = Math.max(y - 1, 0);
	                break;
	            case 'W':
	                x = Math.max(x - 1, 0);
	                break;
	        }
	    }
	    
	    
	    public void processInstructions(String instructions, int maxX, int maxY) {
	        for (char instruction : instructions.toCharArray()) {
	            switch (instruction) {
	                case 'L':
	                    turnLeft();
	                    break;
	                case 'R':
	                    turnRight();
	                    break;
	                case 'M':
	                    moveForward(maxX, maxY);
	                    break;
	            }
	        }
	    }

	    public String getPosition() {
	        return x + " " + y + " " + direction;
	    }
	}



	    
	    
	

