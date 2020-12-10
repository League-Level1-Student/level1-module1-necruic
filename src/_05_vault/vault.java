package _05_vault;

public class vault {
int secretcode;
	boolean tryCode(int guess) {
		if (guess==secretcode) {
		return true;
		}
		else {
			return false;
		}
	}
	vault(int combination){
		secretcode=combination;
				}
}

