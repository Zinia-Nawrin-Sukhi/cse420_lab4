import java.util.*;
import java.io.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.io.File;
public class Lab4 {
  
  public static void main(String[] args) {
    
    String regex = "(public|private|public static|\\s) +[\\w\\<\\>\\[\\]]+\\s+(\\w+) *\\([^\\)]*\\) *(\\{?|[^;])";
    String regex1= "^(?!.*\\bmain\\b).*$";
      
    Pattern r = Pattern.compile(regex);
    Pattern r1 = Pattern.compile(regex1);
        
    try {
      
      File fileName = new File("F:\\cse420\\lab\\lab4.txt");
      FileReader fileReader = new FileReader(fileName);     
      BufferedReader bufferedreader = new BufferedReader(fileReader);           
      StringBuffer sb = new StringBuffer();
      String strLine;
      System.out.println("Methods:");
            
      while ((strLine = bufferedreader.readLine()) != null) {
        
        Matcher m = r.matcher(strLine);
        boolean b = m.matches();
        if (b == true){
          Matcher m1 = r1.matcher(strLine);
          boolean b1 = m1.matches();
          if (b1 == true){
            
            String []word = strLine.split("\\s+");
            
            String x = "int";
            String x1 = "double";
            String x2 = "float";
            String x3 = "String";
            String x4 = "char";
            String x5 = "void";
            
            int index = 0;
            for (int i = 0; i < word.length; i++) {
              
              if (word[i].equals(x) || word[i].equals(x1) || word[i].equals(x2) || word[i].equals(x3)||word[i].equals(x4)||word[i].equals(x5)) 
              { 
                index = i;
                                
                break;
              }
           }
            for(int j=index+1; j <word.length; j++){
              System.out.print(word[j]+" ");
            }
            
            System.out.println("return type: "+ word[index]);
          
          }
        }
      
      } 
    }
    
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}