// Generate parantheses - basic recursion and backtracking
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public void rec(int n,int o,int c,ArrayList<String> res,String curr)
    {
        if(o==n && o==c)
        {
            res.add(curr);
            return;
        }
        // add open
        if(o<n)
            rec(n,o+1,c,res,curr+'(');
        // add closed
        if(c<o)
            rec(n,o,c+1,res,curr+')');
    }
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        ArrayList<String> res = new ArrayList<>();
        String r = new String();
        rec(n,0,0,res,r);
        return res;
    }
}
