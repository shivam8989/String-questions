package training;
import java.util.*;
public class Duplicate_cHAR {
    public static void rempveDuplicates(String str, int idx, StringBuilder ns, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(ns);
            return;
        }
        char currentchar = str.charAt(idx);
        if (map[currentchar - 'a'] == true) {
            rempveDuplicates(str, idx + 1, ns, map);
        } else {
            map[currentchar - 'a'] = true;
            rempveDuplicates(str, idx + 1, ns.append(currentchar), map);
        }
    }


        public static void main (String args[]){
            Scanner sc = new Scanner(System.in);
            String str = new String(sc.nextLine());
            StringBuilder sb =new StringBuilder(" ");
            boolean map[] = new boolean[26];
            rempveDuplicates(str,0 ,sb,map);
        }
    }
