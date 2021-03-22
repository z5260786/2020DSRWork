package kingsAssignment;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * The Class Assignment3.
 *
 * @Tian Kingsbury
 */
public class Assignment3 {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat threeDecPoints = new DecimalFormat("0.000");
        
        //The team object. Properties added by user input
        Team myTeam = new Team();

        //Set team name. If invalid input, prompt until valid.
        System.out.println("What is the team's name?");
        do {
            try {
               	myTeam.setTeamName(s.nextLine());; //fill each slot with a coach's name
               	break;
            } catch (Exception e) {
               	System.out.println(e.getMessage());
            }        	
        } while (true);
        
        //Set number of coaches, if not integer input then loop with input error message
        System.out.println("How many coaches does the team have?");
        while(!s.hasNextInt()) {
        	System.out.println("Error: Input must be a valid integer. Try again.");
	        s.next();
        }
        myTeam.setNumCoaches(s.nextInt());
        s.nextLine(); //Reads \n new line character that comes after integer in the input

        //Insert coach names one at a time. If invalid input, prompt until valid.
        for (int i = 0; i < myTeam.getCoachNames().length; i++) {
            System.out.println("What is coach #" + (i+1) + "'s name?");
            do {
	            try {
	            	myTeam.setCoachNames(i, s.nextLine());; //fill each slot with a coach's name
	            	break;
	            } catch (Exception e) {
	            	System.out.println(e.getMessage());
	            }
            } while (true);
        }

        //Set number of players, if not integer input then loop with input error message
        System.out.println("What is the total number of players?");
        while(!s.hasNextInt()) {
        	System.out.println("Error: Input must be a valid integer. Try again.");
	        s.next();
        }
        myTeam.setNumPlayers(s.nextInt());

        //Set number of wins, if not integer input then loop with input error message
        System.out.println("What is the total number of wins?");
        while(!s.hasNextInt()) {
        	System.out.println("Error: Input must be a valid integer. Try again.");
	        s.next();
        }
        myTeam.setWins(s.nextInt());

        //Set number of games played, if not integer input then loop with input error message
        System.out.println("What is the total number of games played?");
        while(!s.hasNextInt()) {
        	System.out.println("Error: Input must be a valid integer. Try again.");
	        s.next();
        }
        myTeam.setTotalGames(s.nextInt());

        //Convert team object to readable string
        System.out.println(myTeam.toString());

        if (myTeam.getWinPercentage() > 50.0) {
            System.out.print("It's been a good season.");
            System.out.print(" The team had a win percentage of "
                    + threeDecPoints.format(myTeam.getWinPercentage()) + ". \n");
        } else {
            System.out.print("Maybe you should get a better coach.");
            System.out.print(" The team had a win percentage of "
                    + threeDecPoints.format(myTeam.getWinPercentage()) + ". \n");
        }

        for (String coaches : myTeam.getCoachNames()) {
            System.out.println("A coach of team is " + coaches); //print out each of the coaches
        }
    }
}
