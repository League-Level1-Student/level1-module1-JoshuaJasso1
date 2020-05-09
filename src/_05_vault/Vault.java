package _05_vault;

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
	Vault(int mysecret){
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
