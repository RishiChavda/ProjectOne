package projectone;

import com.sun.org.apache.xml.internal.security.utils.Base64;

public class ProgramOne {
	public static void main(String[] args) {
		String plain = "amessageamessageamessageamessage";
		String cipher = Base64.encode(plain.getBytes());

		System.out.println("PLAIN\t" + plain);

		System.out.println("CIPHER\t" + cipher);

	}
}
