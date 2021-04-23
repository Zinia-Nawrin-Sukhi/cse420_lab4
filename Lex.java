import java.util.Scanner;
import java.util.Arrays;
import java.io.File;

public class Lex{
    public static void main (String[] args){
        try{
            Scanner s = new Scanner(new File("F:\\cse420\\lab\\lab4\\lab4.txt"));
            while(s.hasNext()){
                String v = s.nextLine();
                String j = s.next();
                if (v.contains("(") && j.contains("{")){
                    
                    String[] n = v.split("\\("); 
                    
                    String[] j1 = n[0].split(" ");
                    int q1 = j1.length;
                    System.out.print(j1[q1-1]);
                    
                    String p2 = "("+n[1];
                    System.out.print(p2);
                    
                    System.out.println(", return type: "+ j1[q1-2]);
                    
                }
            }
            
        }
        catch (Exception e){}
    }
}
