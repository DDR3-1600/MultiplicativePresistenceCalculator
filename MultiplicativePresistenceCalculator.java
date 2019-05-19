
/**
 * This program calculates how many cycles a number can go without 
 * being a number less than 10 while having each of its digits multiplied
 * by eachother.
 * @author Jacob Robertson 
 * @version 1.o.o
 */
import java.util.* ;
public class MultiplicativePresistenceCalculator 
{
    
    
    public static void main(String[] args){
    // change input to change number calculated    
    int input = 777;
    int count = 0;
    int work = 1;
    
    while(input != 1 && input != 0){
        String[] inputArray = Integer.toString(input).split("");
        List<String> aa = new ArrayList<String>();
        aa = Arrays.asList(inputArray);
        System.out.println("input is now: "+input);
        
        if(input < 9){
            System.out.println("input less than 10");
            break;
        }
        for(String s : aa){
        
        work *= Integer.parseInt(s);
        System.out.println("Current product of int's: "+work);
           
        
        
    }
    count++;
    input = work;
    work = 1;
    }
    System.out.println("* ");
    System.out.println("Number of cycles: "+count);
    
}
}
