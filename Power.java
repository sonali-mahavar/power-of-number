
package power;

import java.util.Scanner;

public class Power {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=2,p=6;
        long result=1;
        int i=p;
        for(;i!=0;--i){
            result*=number;
            
        }
            System.out.println(number+"^"+p+"="+result);
        
    }
    
}
