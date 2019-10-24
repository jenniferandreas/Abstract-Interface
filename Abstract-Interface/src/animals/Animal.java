package animals;

import behaviours.EatBehaviour;

public abstract class Animal {
	private EatBehaviour eatbehaviour;
	
	public void doEatMeat(){
		eatbehaviour.eat();
	}

	public EatBehaviour getEatbehaviour() {
		return eatbehaviour;
	}

	public void setEatbehaviour(EatBehaviour eatbehaviour) {
		this.eatbehaviour = eatbehaviour;
	}
	
}
