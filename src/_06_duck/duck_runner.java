package _06_duck;

public class duck_runner {
public static void main(String[] args) {
	duck daffy = new duck("donuts",5);
	daffy.quack();
	rhino ryan = new rhino(0, "cookies");
	ryan.horn_attack();
	ryan.trample();
}
}
