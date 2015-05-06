import org.uncommons.maths.*;
import org.uncommons.maths.random.GaussianGenerator;
import java.util.Random;
import java.math.*;

public class Coach {
	private String name;
	private int scheme;
	//private Generator gCoach;
	
	public Coach(){
	/*	gCoach = new Generator("default");
		name = "default";
		scheme = gCoach.generateCoachScheme();  */
	}
	
	public Coach(String coachName){
		name = coachName;
		Random r = new Random();
		GaussianGenerator g = new GaussianGenerator(50.0, 15, r );
		scheme = (int) (Math.round(g.nextValue()));
		//gCoach = null;
	}
	
	
	public int getScheme(){
		return scheme;
	}
	
	/*
	public void setScheme(int n){
		scheme = n;
	}
	
	public int getScheme(){
		return scheme;
	}
	
	public String getName(){
		return name;
	}

	*/
}
