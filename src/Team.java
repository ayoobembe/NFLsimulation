import java.util.ArrayList;
import java.math.*;


public class Team {
	private String name;
	private Coach coach;
	private ArrayList<Player> lineUp;
	private int[] record = {0,0};
	private int difference;
	
	
	public Team(){
		
	}

	/*	Notes on the constructor and how it relates to gameplay 
	 * 	When the team is constructed it's given a name and coach, but its
	 * 	actual line-up is still unpopulated. The line-up would be filled in 
	 *  the "run" class. 
	 *  The team class would have a separate method to handle populating
	 *  the line-up which would be called on the team in the run class.
	 */
	
	public Team(String teamName, Coach coach){
		name = teamName;
		this.coach = coach;
		lineUp = new ArrayList<Player>();
		difference = this.findDifference();
	}
	
	public void setLineup(ArrayList<Player> lineUp){
		this.lineUp = lineUp;
	}
	
	/* Notes on findDifference method
	 * Finds the sum of the differences between  each player's scheme number
	 * and the coach's scheme number. The resulting number would be used in the 
	 * run program to compute the winner in a team contest.
	 */
	public int findDifference(){
		int d = 0;
		for(Player p: lineUp){
			int n = Math.abs(p.getScheme() - coach.getScheme());
			d += n;
		}
		return d;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public String getName(){
		return name;
	}
	
	public void addCoach(Coach c){
		coach = c;
	}
	
	public Coach getCoach(){
		return coach;
	}
	
	public void setCoach(Coach c){
		
	}
	
	public boolean addPlayer(){
		return false;
		//player added to lineUp ...
	}
	
	public boolean dropPlayer(){
		return false;
	}
	
	public int[] record(){
		int[] i = new int[2];
		i[0] = 0;
		i[1] = 0;
		return i;
	}
	
	public void addWin(){
		
	}
	
	public void addLoose(){
		
	}
	*/

}
