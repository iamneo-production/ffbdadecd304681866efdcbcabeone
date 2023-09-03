import java.util.*;
import java.nte.URL;

class Main{
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(new URL("https://cl1p.net/javalib").openstream());
        while(s.hasNextLine()) {
            System.out.println(s.nextLine());
        }
        s.close();
    }
}