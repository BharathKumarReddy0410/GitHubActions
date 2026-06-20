1.first repeated character in String
2. countfrequecny of character in string



import java.util.*;
import java.util.Scanner;

public class firstrepeatcharacter
{

      public static char findfirstrepeatedcharacter(String s)
      {
                 if(s==null ||s.trim().isEmpty())
                 {
                       return  '#';
                 }
                HashMap<Character,Integer> h1=new LinkedHashMap<Character,Integer>();
               for(int i=0;i<s.length();i++)
               {
                        char ch=s.charAt(i);
                        if(h1.containsKey(ch))
                        {
                                h1.put(ch,h1.get(ch)+1);
                         }
                          else
                         {
                                h1.put(ch,1);
                          }
                 }
           
            for(Map.Entry<Character,Integer>a1:h1.entrySet())
            {
                      if(a1.getValue()>1)
                      {
                          return a1.getKey();
                       }
             }
            return '#';
       }

       
      public static void main(String[] args)
      {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter The String:");
            String s=sc.next();
            
             char ch=findfirstrepeatedcharacter(s);
             if(ch!='#')
              {
                  System.out.println("first repeatedchaarcter is:"+ch);
              }
              else
              {
                   System.out.println(" No repeated character not found in String");
              }
        }

}

import java.util.*;
import java.util.Scanner;
public class countfrequency{

     public static void findfrequency(String s){
            if(s==null||s.trim().isEmpty()){
                System.out.println(" String is either null or empty");
                 return;
             }
             HashMap<Character,Integer> h1=new LinkedHashMap<Character,Integer>();
             for(int i=0;i<s.length();i++)
             {
                  char ch=s.charAt(i);
                  if(h1.containsKey(ch)){
                        h1.put(ch, h1.get(ch)+1);
                   }
                   else{
                         h1.put(ch,1);
                    }
               }
              for(Map.Entry<Character,Integer>a1:h1.entrySet()){
                    System.out.println(a1.getKey()+"---->"+a1.getValue());
              }
       }

       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter The String:");
              String s=sc.next();
              findfrequency(s);
       }
}