// Author: Zack Zeplin
// PID: 730244229
// I pledge the UNC and COMP290 Honor Code.
package comp290;
import java.util.*;

public class Jrep {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String match = args[0];
      while (sc.hasNextLine()) {
          String n = sc.nextLine();
          if (n.contains(match)) {
               System.out.println(n);
          }
      }
}
}
