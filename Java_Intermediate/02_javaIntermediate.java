public class Main {

    public static void main(String[] args) {
    
        // initialize string
        String s = "buckyrobertsbuckyroberts";
        
        // prints the index of first occurence of "rob"
        System.out.println(s.indexOf("rob", 10));
        
        String a = "BACON ";
        String b = "monster";
        String c = "     flying        ";
        
        // prints a and b combined
        System.out.println(a.concat(b));
        
        // prints replaced string, but doesn't change actual reference
        System.out.println(a.replace('B', 'F'));
        
        // everything all uppcase letters (only affects letters)
        System.out.println(b.toUpperCase());
           
        // lower case version. It will not convert lower to upper
        System.out.println(a.toLowerCase());
        
        // gets rid of unnecessary spaces from left to right
        System.out.println(c.trim());

    }

}
