import java.util.Scanner;

public class curConverter {
    //your code goes here
    static double convertToCedi(double dollar){
        return 11.50*dollar;
    }
    static double convertToNaira(double dollar){
        return 445.31*dollar;
    }
    
    public static void main(String[] args) {
        System.out.println("This is updated every six hours, to make sure it is relatively accurate");
        System.out.println("");
        System.out.println("I have made this copyright free, however make sure to include the link to this original file, if this source code is reused in any form.");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter G to convert from dollar to Ghana cedis, or N to convert from dollar to naira: ");
        String user_entry= sc.nextLine();
        //String res=user_entry;
        String Gh="G";
        String Na="N";
        
          if (user_entry.equals(Gh)){	
        System.out.println("Please enter only the numerical amount, in dollars");
        double money = sc.nextDouble();   
        System.out.println("The equivalent of"+" $" +money+" in cedis is "+"Ghc"+ " "+ convertToCedi(money)+"0");
        
        
        }
        else if (user_entry.equals(Na)){
            System.out.println("Please enter only the numerical amount in dollars");
            double money = sc.nextDouble();   
            System.out.println("The equivalent of"+" $" +money+" in naira is "+"N"+ " "+ convertToNaira(money));
            }
        else{
            System.out.println("Please enter G or N only.");
            
        }
        System.out.println("");
        System.out.println("Thanks");
    sc.close();
        
    }
}