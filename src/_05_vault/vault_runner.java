package _05_vault;

public class vault_runner {
public static void main(String[] args) {
	james_bond jamesbond = new james_bond();
	vault vault = new vault(1000001);
	int i = jamesbond.findCode(vault);
	System.out.println(i);
}
}
