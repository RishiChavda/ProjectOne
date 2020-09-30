package projectone;

import java.util.Base64;

public class ProgramOne {
	public static void main(String[] args) {
		try {
			String plain = "amessageamessageamessageamessage";
			String cipher = Base64.getEncoder().encodeToString(plain.getBytes());

			System.out.println("PLAIN\t" + plain);
			System.out.println("CIPHER\t" + cipher);

			String decrypted = new String(Base64.getDecoder().decode(cipher.getBytes()));

			System.out.println("DECRYPT\t" + decrypted);
		}
		catch(Exception e) {
			// do nothing
		}
	}
}
