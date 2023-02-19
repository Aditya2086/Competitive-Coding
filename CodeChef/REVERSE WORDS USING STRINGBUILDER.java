import java.util.*;

public class Main {
 public static String WordsInReverse(String str1) {
  StringBuilder sb = new StringBuilder(str1);
  String StrRev = sb.reverse().toString();

  String[] words = StrRev.split(" ");
  StringBuilder reverse = new StringBuilder();
  for (String tmp: words) {
   sb = new StringBuilder(tmp);
   reverse.append(sb.reverse() + " ");
  }
  reverse.deleteCharAt(reverse.length() - 1);
  return reverse.toString();
 }

 public static void main(String[] args) {
  String str1 = "INDIA IS MY PRIDE";
  System.out.println("Sentence :- " + str1);
  System.out.println("After Reversed The Sentence :- " + WordsInReverse(str1));
 }
}
