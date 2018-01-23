
package caesarcipher;

import java.util.Scanner;


public class CaesarCipher {

  private static String CaesarCipher(int key,String plain)
    {
        boolean flag=true;
        String cipher=new String();
        if(key<0 ||key>25)
            return "";
        
        String Alpha=new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        for (int i = 0; i < plain.length(); i++) {
            
            if(!Character.isUpperCase(plain.charAt(i)))
            {
                flag=false;
                break;
                
            }
            if( !Character.isAlphabetic(plain.charAt(i)))
            {   flag=false;
            break;
            }
           
            
            
           else {
            char temp = plain.charAt(i);
            int pos=Alpha.lastIndexOf(temp);
           char c=Alpha.charAt((pos+key)%26);
           cipher+=c;
            }
            
               
            
        }
      if(flag)
        return cipher;
      else
          return "";
    }
    
    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
      int key=sc.nextInt();


      String plain=sc.next();
       
        System.out.println(CaesarCipher( key,plain));
       
        
        
        
//       // System.out.println(CaesarCipher("wxyz",3));
//      Playfair p=new Playfair();
//      //p.fillMatrix("largest");
//      
//        System.out.println(p.encryptPlain("at full moon","senior"));
//       
      
      
            
        }
        
        
    }
    
