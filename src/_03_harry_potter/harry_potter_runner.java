package _03_harry_potter;

public class harry_potter_runner {
public static void main(String[] args) {
//	 1. create harry potter
//		* 2. make him become invisible
//		* 3. spy on Professor Snape
//		* 4. make him become visible again
//		* 5. cast a “stupefy” spell
	HarryPotter HarryPotter = new HarryPotter();
	HarryPotter.makeInvisible(true);
	HarryPotter.spyOnSnape();
	HarryPotter.makeInvisible(false);
	HarryPotter.castSpell("Stupefy");
}
}
