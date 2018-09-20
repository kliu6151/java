package KevinLiu;


public class testFile {

    public static void main(String[] args) {
        //isPalindrome test--true & false//
        System.out.println(KLiuLib.isPalindrome("racecar"));
        System.out.println(KLiuLib.isPalindrome("reverse"));
        System.out.println("------------------------------");
        //cutOut test--string in the beginning & string at the middle//
        System.out.println(KLiuLib.cutOut("catatonic cat", "cat"));
        System.out.println(KLiuLib.cutOut("dioasdDOGdioasjdio", "DOG"));
        System.out.println("------------------------------");
        //dateStr test//
        System.out.println(KLiuLib.dateStr("05/21/2001"));
        System.out.println("------------------------------");
        //isFibonacci--number in sequence or not//
        System.out.println(KLiuLib.isFibonacci(5000));
        System.out.println(KLiuLib.isFibonacci(3));
        System.out.println("------------------------------");
        //multiplicationTable--base to range//
        KLiuLib.multiplicationTable(4,5);
        System.out.println("");
        System.out.println("------------------------------");
        //leastCommonMultiple--//
        System.out.println(KLiuLib.leastCommonMultiple(10,50,500));
        System.out.println(KLiuLib.leastCommonMultiple(900,1245,7));
    }
}