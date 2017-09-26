

public class Lucky1and2
{
    public static void main(String [] args){
        int num [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean one = false, three = false;
        for(int x =0 ; x < num.length ; x++){
            if(num[x] == 1){
                one = true;
            }else if(num[x] == 3){
                three = true;
            }
        }
        
        if(one == true && three == true){
            System.out.println("TRUE");
            System.out.println("Your array contains 1 and 3");
        }else{
            System.out.println("FALSE");
            System.out.println("Your array does not contain 1 and 3");
        }
    }
}
