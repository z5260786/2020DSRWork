package kingsAssignment;

import java.util.Arrays;



/**
 * The Class Team.
 *
 * @Tian Kingsbury
 */
public class Team {

    /** The total games. */
    private int numPlayers, wins, totalGames;
    
    /** The team name. */
    private String teamName;
    
    /** The coach names. */
    private String[] coachNames; //coach array within team object
    
    /** The win percentage. */
    private Double winPercentage;
    
    /**
     * Instantiates a new team.
     */
    public Team() {
    	
    }

    /**
     * Instantiates a new team.
     *
     * @param teamName the team name
     * @param coachNames the coach names
     * @throws InvalidNameException 
     */
    public Team(String teamName, String[] coachNames) throws InvalidNameException {
        setNumPlayers(numPlayers);
        setWins(wins);
        setTotalGames(totalGames);
        setTeamName(teamName);
        this.coachNames = new String[coachNames.length]; //make team array equal in length to the array that was passed to the object
        this.coachNames = coachNames; //make the team array equal to the passed array
        this.winPercentage = calcWinPercentage();
    }

    /**
     * Gets the num players.
     *
     * @return the num players
     */
    public int getNumPlayers() {
        return numPlayers;
    }

    /**
     * Gets the wins.
     *
     * @return the wins
     */
    public int getWins() {
        return wins;
    }

    /**
     * Gets the total games.
     *
     * @return the total games
     */
    public int getTotalGames() {
        return totalGames;
    }

    /**
     * Gets the team name.
     *
     * @return the team name
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Gets the coach names.
     *
     * @return the coach names
     */
    public String[] getCoachNames() {
        return coachNames;
    }
    
    /**
     * Sets the num coaches.
     *
     * @param coaches the new number of coaches
     */
    public void setNumCoaches(int coaches) {
    	this.coachNames = new String[coaches];
    }
    
    /**
     * Sets the coach names.
     *
     * @param i the index
     * @param name the coach name
     * @throws InvalidNameException 
     */
    public void setCoachNames(int i, String name) throws InvalidNameException {
    	if(name == null || name.isEmpty() || !(name.matches("^[a-zA-Z\\s?]+")))
    		throw new InvalidNameException("Error: Invalid input, coach name must not be empty and only contain characters a-z and A-Z only.");
    	
    	this.coachNames[i] = name;
    }

    /**
     * Gets the win percentage.
     *
     * @return the win percentage
     */
    public Double getWinPercentage() {
        return calcWinPercentage();
    }

    /**
     * Sets the num players.
     *
     * @param numPlayers the new num players
     */
    public void setNumPlayers(int numPlayers) {
    	this.numPlayers = numPlayers;
    }

    /**
     * Sets the wins.
     *
     * @param wins the new wins
     */
    public void setWins(int wins) {
        this.wins = wins;
    }

    /**
     * Sets the total games.
     *
     * @param totalGames the new total games
     */
    public void setTotalGames(int totalGames) {
        this.totalGames = totalGames;
    }

    /**
     * Sets the team name.
     *
     * @param teamName the new team name
     * @throws InvalidNameException 
     */
    public void setTeamName(String teamName) throws InvalidNameException {
    	if(teamName == null || teamName.isEmpty() || !(teamName.matches("^[a-zA-Z\\s?]+")))
    		throw new InvalidNameException("Error: Invalid input, team name must not be empty and only contain characters a-z and A-Z only.");
    	
        this.teamName = teamName;
    }

    /**
     * Calc win percentage.
     *
     * @return the double
     */
    private double calcWinPercentage() {
        return ((double) this.wins / this.totalGames) * 100;
    }

    /* 
     * toString() for Object
     */
    @Override
    public String toString() {
        return "Team{" + "numPlayers=" + numPlayers + ", wins=" + wins
                + ", totalGames=" + totalGames + ", teamName=" + teamName
                + ", coachNames=" + Arrays.toString(coachNames) //print the array in a nice manner 
                + ", winPercentage=" + winPercentage + '}';
    }
    
    public String[][] toArray() {
    	String[][] arr = new String[6][];
    	String[] coaches = new String[(coachNames.length > 0) ? coachNames.length + 1 : 2];
    	if(coachNames.length > 0) {
	    	for (int i = 0; i < coachNames.length; i++) {
	    		coaches[i + 1] = coachNames[i];
	    	}
    	} else {
    		coaches[1] = "Not set.";
    	}
    	

    	coaches[0] = "coachNames";
    	
    	arr[0] = new String[] {"numPlayers", (numPlayers < 0) ? "Not set." : String.valueOf(numPlayers)};
    	arr[1] = new String[] {"wins", (wins < 0) ? "Not Set." : String.valueOf(wins)};
    	arr[2] = new String[] {"totalGames", (totalGames < 0) ? "Not set." : String.valueOf(totalGames)};
    	arr[3] = new String[] {"teamName", (teamName == null) ? "Not set." : teamName};
    	arr[4] = coaches;
    	arr[5] = new String[] {"winPercentage", (winPercentage < 0) ? "Not set." : String.valueOf(winPercentage)};
    	
        return arr;
    }

}