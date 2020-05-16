package _05_vault;

import java.util.Random;

public class Vault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vault myvault = new Vault(2);
		if(myvault.tryCode(2)) {
			System.out.println("The code matches");
		}else {
			System.out.println("The code doesn't match");
		}
	}
	int secret;
	public Vault() {
		secret=(new Random()).nextInt(1_000_001);
	}
	public Vault(int mysecret){
		secret = mysecret;
	}

	boolean tryCode(int code) {
		if(secret == code) {
			return true;
		}else {
			return false;
		}
	}
}
