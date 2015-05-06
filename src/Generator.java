import java.util.Random;
import java.math.BigInteger;
import java.security.SecureRandom;

public class Generator {
	public String name;
	public Random generator;
	
	public Generator(String generatorName){
	//set name	= generatorName
		name = generatorName;
		generator = new Random(19847562);
	}
	
	public Generator(int randomUtilSeed){
		name = "default";
		generator = new Random(randomUtilSeed);
	}
	
	//WHAT I'M WORKING ON NOW//
	public int generateCoachScheme(){
		return generator.nextInt(100);  //need to find a way if scheme already exists
	}
	
	public int generateAthleteScheme(){
		return generator.nextInt(100);	//also need a way to check if scheme already exists
	}
	
	public int generateAthleticAbility(){
		return generator.nextInt(100);	//need to check if the numbers above are as specified
	}
	
	public int generateContractLength(){
		return generator.nextInt(5);
	}
	
	public String generateAthleteName(){
		return "xxx";		
		//nameIndex = generator.nextInt(5000);
		
	}
	
	public String generateCoachName(){
		return "xxx";		//also involves a similar algorithm
	}
	
	
	
}
