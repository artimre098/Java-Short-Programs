
public class CountEven
{
    public static void main(String [] args){

        int [] num = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8, 9, 10};
        int count = 0;
        for(int x = 0 ; x < num.length; x++){
            if(num[x]%2 == 0){
                count++;
            }
        }
        System.out.print("Array: ");
        for(int x = 0 ; x < num.length; x++){
            System.out.print(num[x]+ " ");	
        }
        System.out.println("\n");
		System.out.print("Even numbers: ");
        for(int x = 0 ; x < num.length; x++){
            if(num[x]%2 == 0){
                System.out.print(num[x]+ " ");
            }
        }
		System.out.println("\nNo. of Even numbers: " + count);
        
    }
}

