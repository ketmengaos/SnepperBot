import org.json.*;
import org.json.simple.JSONObject;

import java.net.*;
import java.io.*;

public class SnepMain {

    public static void main(String[] args) {

        String botToken = "249339687:AAEFPlWdW5viGqw4zt8VEtNqnhZNX6yTi20";
        String website = "https://api.telegram.org/bot"+botToken+"/getupdates";
        String inputLine;

        JSONObject obj = new JSONObject();

        try {
            URL url = new URL(website);

            BufferedReader input = new BufferedReader(new InputStreamReader(url.openStream()));

            while ((inputLine = input.readLine()) != null) {
                System.out.println(inputLine);
            }
            input.close();

        } catch(MalformedURLException e) {
            System.out.println("Invalid URL");
            System.exit(0);
        } catch(IOException e) {
            System.out.println("IOException Error.");
            System.exit(1);
        }
    }
}
