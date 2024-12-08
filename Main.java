import java.util.Scanner;
class NegativeExcepation extends Exception{
    @Override
    public String toString(){
        return "radius cannot be negative";
    }
    @Override
    public String getMessage(){
        return "radius cannot be negative!";
    }
} 

public class Main
{	
    public static double area(int r) throws NegativeExcepation{
		    if (r<0){
		        throw new  NegativeExcepation();
		    }
		    double result = Math.PI * r * r;
		    return result;
		}
	public static void main(String[] args) {
		System.out.println("Exception class......!");
		try{
		    double c = area(-1);
		    System.out.println(c);
		}
		catch(Exception e){
		    System.out.println(e);
		}
	
	}
}
