import java.util.*;
	
//import java.util.Scanner;
//import java.math.BigInteger;
//import java.security.SecureRandom;



public class run {
	
	public static void main(String[] args){
		
		/*
		String[] teamNames = 
		{"Buffallo Bills", "Baltimore Ravens", "Houston Texans", "Denver Broncos", 
					"Dallas Cowboys", "Chicago Bears", "Atlanta Falcons", "Arizona Cardinals"};
		
		String[] coachNames = 
		{"Doug Marrone", "John Harbaugh", "Gary Kubiak", "John Fox", 
					"Jason Garrett", "Marc Trestman", "Mike Smith", "Bruce Arians"};
		
		String[] playerNames = 
		{		"David Baas", "Jason Babin", "Jonathan Babineaux", 
				"Johnson Bademosi", "Allen Bailey", "Brandon Bair",
				"Billy Banjema", "Chase Baker", "Edwin Baker",
				"Daniel Baldridge", "Doug Baldwin", "Alan Ball",
				"Christian Ballard", "Brandon Banks", "Justin Bannan",
				"Joe Baynard", "Ronde Barber", "Allen Barbre",
				"Don Barclay", "Brandon Barden", "Joe Barksdale",
				"Antwan Barnes", "Kevin Barnes", "Nick Barnett"
		};
		
		Team[] teams = new Team[8];
		Coach[] coaches = new Coach[8];
		Player[] players = new Player[24];
		
		for(int i = 0; i<8 ;i++ ){
			teams[i] = new Team(teamNames[i], coachNames[i]);
		}
		
		for(int i = 0; i<8; i++){
			//System.out.println(teams[i].getName() + "//" + teams[i].getCoach().getName());
			//System.out.println(teams[i].getCoach().getName());
			System.out.println(teams[i].getCoach().getScheme());
		}
		
		
		for(int i = 0; i<24; i++){
			players[i] = new Player(playerNames[i]);
		}
		
		
		*/
		
		Player val = new Player("Valentine");
		Player jaqe = new Player("Jaqe");
		Player dipo = new Player("Dipo");
		Player frank = new Player("Frank");
		
		System.out.println("val athletism:" + val.getAthletism());
		System.out.println("val scheme:" + val.getScheme());
		System.out.println("val contract:" + val.getContract());
		
		System.out.println("\n");
		
		System.out.println("jaqe athletism:" + jaqe.getAthletism());
		System.out.println("jaqe scheme:" + jaqe.getScheme());
		System.out.println("jaqe contract:" + jaqe.getContract());
		
		System.out.println("\n");
		
		System.out.println("dipo athletism:" + dipo.getAthletism());
		System.out.println("dipo scheme:" + dipo.getScheme());
		System.out.println("dipo contract:" + dipo.getContract());
		
		System.out.println("\n");
		
		System.out.println("frank athletism:" + frank.getAthletism());
		System.out.println("frank scheme:" + frank.getScheme());
		System.out.println("frank contract:" + frank.getContract());
		
		Coach ayo = new Coach("ayo");
		Coach jamie = new Coach("jamie");
		
		System.out.println("\n");
		System.out.println("ayo scheme: " + ayo.getScheme());
		System.out.println("\n");
		System.out.println("jamie scheme:" + jamie.getScheme());
		
		
		
	}

}
