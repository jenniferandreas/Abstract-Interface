import java.util.ArrayList;
import java.util.Scanner;

import animals.Animal;
import animals.Carnivore;
import animals.Herbivore;
import behaviours.EatMeat;
import behaviours.EatNoMeat;

public class Main {
	public Main(){
		ArrayList<Animal> animals = new ArrayList<>();
		String input;
		Carnivore carnivore = new Carnivore();
		Herbivore herbivore = new Herbivore();
		
		do{
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		}while(!input.equals("Carnivore")&&!input.equals("Herbivore"));
		
		if(input.equals("Carnivore"))
		{
			animals.add(carnivore);
		}
		else{
			animals.add(herbivore);
		}
		
		carnivore.setEatbehaviour(new EatMeat());
		herbivore.setEatbehaviour(new EatNoMeat());
		
		for(int i =0;i<animals.size();i++)
		{
			animals.get(i).doEatMeat();
		}
	}
	public static void main(String[] args) {
	
		new Main();
	}
}
