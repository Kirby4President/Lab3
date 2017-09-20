//I have no clue what this class does
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class Lab3 {


/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */
public static String urlToString(final String url) {
    Scanner urlScanner;
    try {
        urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
    } catch (IOException e) {
        return "";
    }
    String contents = urlScanner.useDelimiter("\\A").next();
    urlScanner.close();
    return contents;
}

public static void main(String[] args) {
        // TODO Auto-generated method stub
    int words = 0;
    String text = urlToString("http://erdani.com/tdpl/hamlet.txt");
    for (int i = 0; i < text.length(); i++ ) {
        if (text.charAt(i) != ' ' && text.charAt(i+1) == ' ' && i + 1 < text.length())
            words++;
        if (i + 1 == text.length() && text.isChar(i))

    }

    System.out.println(text);
    System.out.printf("has %d words.", words);


    }

}
