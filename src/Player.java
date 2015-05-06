//import org.uncommons.maths.*;
import org.uncommons.maths.random.GaussianGenerator;
import java.util.Random;
//import java.math.*;

public class Player {
	
	//Fields
	private String name;
	private int scheme;
	private int athletism;
	private int contractLength;
	private Team team;
	
	
	
	//Methods
	
		//Constructors
	public Player(){
		
	}
	
	public Player(String playerName){
		name = playerName;
		Random r = new Random();
		GaussianGenerator g1 = new GaussianGenerator(50.0, 15, r );
		scheme = (int) (Math.round(g1.nextValue()));
		athletism = (int) (Math.round(g1.nextValue()));
		GaussianGenerator g2 = new GaussianGenerator(2, 1, r );
		contractLength = (int) (Math.round(g2.nextValue()));
		//What do I do about team ....?
	}
	
	
		//Functionality
	public int getScheme(){
		return scheme;
	}
	
	public int getAthletism(){
		return athletism;
	}
	
	public int getContract(){
		return contractLength;
	}
	
	
	
	
	
	
	
	/*
	public void resetContract(){
		
	}
	
	public void decrementContract(){
		
	}
	
	public boolean setTeam(){
		return true;
	}
	
	public void setTeamName(){
		
	}
	
	public String getTeamName(){
		return "I'm working";
	}
	
	public void setScheme(){
		
	}
	
	public int getScheme(){
		return 0;
	}
	
	public void setAthletism(){
		
	}
	
	public int getAthletism(){
		return 0;
	}
	
	public void setContractLength(){
		
	}
	
	public int contractLength(){
		return 0;
	}
	*/

}
