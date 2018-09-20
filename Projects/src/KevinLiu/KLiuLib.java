package KevinLiu;

public class KLiuLib {
    public static boolean isPalindrome(String str)
    {
        String str2="";
        int i=str.length()-1; //starts from the end//
        while(i>=0)
        {
            str2+=str.substring(i,i+1); //takes each letter reversed//
            i--;
        }
        return (str.toLowerCase().equals(str2.toLowerCase())); //compares both strings in lowercase//
    }
    public static String cutOut(String mainStr,String subStr)
    {
        String hold=""; //hold and hold2 is here to store different parts of mainStr in case the subStr is identified in the middle//
        String hold2="";
        if(mainStr.contains(subStr) && mainStr.indexOf(subStr)==0) //Removes subStr when it appears in the beginning of mainStr//
        {
            mainStr = mainStr.substring(mainStr.indexOf(subStr)+subStr.length());
        }
        else //if subStr appears first in the middle, then it removes subStr and adds the remaining string together//
        {
            hold = mainStr.substring(0,mainStr.indexOf(subStr));
            hold2= mainStr.substring(mainStr.indexOf(subStr)+subStr.length()+1,mainStr.length());
            mainStr = hold+hold2;
        }
        return mainStr;
    }
    public static String dateStr(String str)
    {
        if (str.substring(2,3).equals("/") && str.substring(5,6).equals("/"))
        {
            str = str.substring(3, 5) + "-" + str.substring(0, 2) + "-" + str.substring(6, 10);
        }
        return str;
    }
    public static boolean isFibonacci(int num)
    {
        int a = 1;
        int b = 1;
        for(int i=0;i<Integer.MAX_VALUE;i++)
        {
            if(num == a || num == b) //Stops the code immediately if num is equal to either a or b//
            {
                break;
            }
            else if(a>num || b>num) //Required to avoid looping if num is not part of the sequence//
            {
                return false;
            }
            else                   //Fibonacci sequence's formula//
                a = a + b;
                b = a + b;
        }
        return(num == a || num == b);
    }
    public static int leastCommonMultiple(int a, int b, int c)
    {
        int i = Math.min(a,Math.min(b,c)); //i starts at the lowest value-efficiency//
        while(i<Integer.MAX_VALUE)
        {
            if(i%a==0 && i%b==0 && i%c==0)//stops the loop if i is equal to a,b, or c//
            {
                break;
            }
            else if (i>=Integer.MAX_VALUE-1)//Makes sure that the max value isn't printed out, if the LCM of a,b and c are greater than max value//
            {
                System.out.println("No LCM was founded");
                System.exit(1);
            }
            else
            {
                i++;
            }
        }
        return i;
    }

}
