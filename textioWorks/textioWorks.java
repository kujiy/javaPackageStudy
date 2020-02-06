import java.io.*;
import java.net.*;
import textio.TextIO;

public class textioWorks {

	public static void main(String[] args) {

		System.out.println("----------");
		InputStream in = null;
		OutputStream out = null;
		System.out.println("----------");

		String url = "";
		url = geturlString();

	}

	public static String geturlString() {

		System.out.print("What's your URL?");
		final String urlString = TextIO.getln();
		System.out.println("url = " + urlString);

		return urlString;
	}
}
