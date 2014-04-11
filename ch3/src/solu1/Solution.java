package solu1;

public class Solution {
	public static boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int temp=1;
        int digit=1;
        while((x/temp)>10)
        {
            temp=temp*10;
            digit++;
        }
        int temp2=10;
        for(int i=0;i<digit/2;i++)
        {
            int m=x/temp;
            x=x-m*temp;
            int n=(x%temp2)/temp2*10;
            temp=temp/10;
            temp2=temp2*10;
            if(m!=n)
            {
                return false;
            }
        }
        return true;
        
    }
	public static void main(String[] args)
	{
		boolean b=isPalindrome(10);
		System.out.println(b);
		System.out.println(b);
	}

}


