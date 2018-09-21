package KevinLiu;

public class KLiuLib {
    /**
     * Reverses string and compares if they are equal or not
     * @param str original string
     * @return True or false, true if reverse string = original string.
     */
    public static boolean isPalindrome(String str)
    {
        String str2="";
        int i=str.length()-1; //starts from the end//
        while(i>=0)
        {
            str2 = str2 + str.substring(i,i+1); //takes each letter reversed//
            i--;
        }
        return (str.toLowerCase().equals(str2.toLowerCase())); //compares both strings in lowercase//
    }

    /**
     * Removes the first occurrence of subStr
     * @param mainStr the main string where you want to remove subStr from
     * @param subStr  the string that you want to remove
     * @return  main string without subStr
     */
    public static String cutOut(String mainStr,String subStr)
    {
        String hold; //hold and hold2 is here to store different parts of mainStr in case the subStr is identified in the middle//
        String hold2;
        if(mainStr.contains(subStr) && mainStr.indexOf(subStr)==0) //Removes subStr when it appears in the beginning of mainStr//
        {
            mainStr = mainStr.substring(mainStr.indexOf(subStr)+subStr.length());
        }
        else //if subStr appears first in the middle, then it removes subStr and adds the remaining string together//
        {
            hold = mainStr.substring(0,mainStr.indexOf(subStr));
            hold2= mainStr.substring(mainStr.indexOf(subStr)+subStr.length()+1);
            mainStr = hold+hold2;
        }
        return mainStr;
    }

    /**
     * Changes "/" to "-" and switches month with day
     * For example, 05/21/01 becomes 21-05-01
     *
     * @param str date in the form of mm/dd/yyyy
     * @return date in the form of dd-mm-yyyy
     */

    public static String dateStr(String str)
    {
        if (str.substring(2,3).equals("/") && str.substring(5,6).equals("/"))
        {
            str = str.substring(3, 5) + "-" + str.substring(0, 2) + "-" + str.substring(6, 10);
        }
        return str;
    }
    /**
     * Checks to see if the number is in the fibonacci sequence or not
     * @param num1 A number
     * @return True or false depending on num1.
     */
    public static boolean isFibonacci(int num1)
    {
        int a = 1;
        int b = 1;
        for(int i=0;i<Integer.MAX_VALUE;i++)
        {
            if(num1 == a || num1 == b) //Stops the code immediately if num is equal to either a or b//
            {
                break;
            }
            else if(a>num1 || b>num1) //Required to avoid looping if num is not part of the sequence//
            {
                return false;
            }
            else                   //Fibonacci sequence's formula//
                a = a + b;
                b = a + b;
        }
        return(num1 == a || num1 == b);
    }
    /**
     * Prints out the multiplicative results of the base
     * @param base multiples of the number
     * @param range How many multiples
     */
    public static void multiplicationTable(int base, int range)
    {
        int i = 0;
        while(i<=range)
        {
            System.out.print(base*i + ",");
            i++;
        }
    }
    /**
     * Gets the least common multiple
     * @param a the first number
     * @param b the second number
     * @param c the third number
     * @return  the first least common multiple.
     */
    public static int leastCommonMultiple(int a, int b, int c)
    {
        int i = Math.min(a,Math.min(b,c)); //i starts at the lowest value-efficiency//
        while(i<Integer.MAX_VALUE)
        {
            if(i%a==0 && i%b==0 && i%c==0)//stops the loop if i is equal to a,b, or c//
            {
                break;
            }
            else if(i>=Integer.MAX_VALUE-1)//Makes sure that the max value isn't printed out, if the LCM of a,b and c are greater than max value//
            {
                System.out.println("No LCM was found");
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