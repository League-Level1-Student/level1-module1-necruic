package _02_cat;

public class cat_runner {
public static void main(String[] args) {
	Cat cat = new Cat("Garfield");

    /* 1. Make the Cat meow
	
	* 2. Get the Cat to print it's name

	* 3. Kill the Cat! 
	
	*/
cat.meow();
cat.printName();
for (int i = 0; i < 9; i++) {
	cat.kill();
}
}
}
