package Solution;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class stackBalanced 
{
	 static boolean isBallanced(String paranString)
	    {
	        List<String>closingParan =  Arrays.asList("}", ")", "]"); // danh sach cac ngoặc đóng
	        boolean isBallanced = true; // biến kiểm tra
	        ArrayList<String> stack = new ArrayList<String>();
	        if(paranString.length()>0)
	        {
	            for(int i = 0;i<paranString.length();i++)
	            {
	                String paran = paranString.substring(i,i+1); 
	                if(stack.size() == 0 && closingParan.contains(paran)) // nếu stack rỗng và có dấu đóng ngoặc thì not balanced
	                {
	                    isBallanced=false;
	                    break;
	                }
	                else
	                {
	                    if(paran.equals("{") || paran.equals("(") || paran.equals("["))
	                    {
	                        stack.add(paran);
	                    }
	                    else
	                    {
	                        String stackParan = stack.get(stack.size()-1);
	                        if((stackParan.equals("{") && paran.equals("}")) || (stackParan.equals("(") && paran.equals(")") || (stackParan.equals("[") && paran.equals("]")))) 
	                        {
	                            stack.remove(stack.size()-1);
	                        }
	                        else
	                        {
	                            isBallanced = false;
	                            break;
	                        }
	                    }
	                }
	            }  
	        }
	        if(stack.size()>0) isBallanced = false;
	        return isBallanced;    
	    }
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        while(sc.hasNext())
	        {
	            if(isBallanced(sc.nextLine()))
	            {
	                System.out.println("true");
	            }
	            else
	            {
	                System.out.println("false");
	            }       
	        }
	        
	    }

}
