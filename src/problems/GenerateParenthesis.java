package problems;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	static int numCalls = 0;
	
	public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }
    
    public static void backtrack(List<String> list, String str, int open, int close, int max){
    	++numCalls;
    	System.out.println("num calls: " + numCalls);
        
        if (str.length() == max*2) {
            list.add(str);
            System.out.println("returning: " + str);
            return;
        }
        
        if (open < max) {
        	System.out.println(str + " open: " + open + " close: " + close + "max: " + max);
        	backtrack(list, str+"(", open+1, close, max);
        }
            
        if (close < open) {
        	System.out.println(str + " open: " + open + " close: " + close + "max: " + max);
        	backtrack(list, str+")", open, close+1, max);
        }
            
    }

}
