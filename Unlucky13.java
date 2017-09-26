

import java.util.*;
public class Unlucky13
{
    public static void main(String [] args){
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of element you want to input: ");
        
        int arrLength = in.nextInt();
        int num [] = new int [arrLength];
        
        System.out.println("Enter numbers");
        for(int x = 0 ; x < num.length ; x++){
        
            System.out.print("Input " + x + ": ");
            num[x] = in.nextInt();
            
        }
        
        int sum = 0;
        for(int x = 0 ; x < num.length ; x++){
            if(num[x] == 13){
                break;
            }else{
                sum += num[x];
            }
        }
        
        System.out.println("Sum: " + sum);
    }
}
