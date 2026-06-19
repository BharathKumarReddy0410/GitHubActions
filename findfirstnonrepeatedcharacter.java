import java.util.Scanner;
import java.util.*;
public class  findfirstnonrepeatedcharacter{
     
     public static char firstnonrepeatedcharacter(String s){
            boolean foundchar=false;
            if(s==null||s.trim().isEmpty()){
                 return '#';
            }
            HashMap<Character,Integer> h1=new LinkedHashMap<Character,Integer>();
            for(int i=0;i<s.length();i++){
                     char ch=s.charAt(i);
                     if(h1.containsKey(ch)){
                              h1.put(ch, h1.get(ch)+1);  
                     }else{
                              h1.put(ch,1);
                     }
             }
             for(Map.Entry<Character,Integer>a1:h1.entrySet()){
                 if(a1.getValue()==1){
                         foundchar=true;
                          return a1.getKey();
                  }
             }
           return '#';
     }



     public static void  main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string:");
            String input=sc.next();
          
            char ch1=firstnonrepeatedcharacter(input);
            System.out.println(ch1);
                
     }
}
