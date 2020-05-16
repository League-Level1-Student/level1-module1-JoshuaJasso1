package _05_vault;

public class JamesBond {

	public static void main(String[] args) {
		JamesBond jamesbond = new JamesBond();
		Vault vault = new Vault();
		int code = jamesbond.findCode(vault);
		System.out.println(code);
	}

	int findCode(Vault vault) {
		for (int i = 0; i <= 1000000; i++) {
			boolean code = vault.tryCode(i);
			if (code == true) {
				return i;
			}
		}
		return -1;

	}
}
