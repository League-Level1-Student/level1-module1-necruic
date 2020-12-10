package _05_vault;

public class james_bond {
	int findCode (vault vault){
		for (int i = 0; i < 1000000; i++) {
		boolean numguess = vault.tryCode(i);
		if (numguess == true) {
			return i;
		}
		
	}
		return -1;
		
	}
}

