public class StringMethodDemo{
    public static void main(String args[]){
    // length()
    String s = "welcome";
    int len = s.length();
    System.out.println(len);

    // concat() - Join the Strings
    String s1 = "Welcome";
    String s2 = "to selenium";

    System.out.println(s1+" "+s2);
    System.out.println(s1.concat(s2));

    //trim()
    s="                   java programming     ";
    System.out.println(s.trim());

    //charAt() --index will start from 0

    s="welcome";
    System.out.println(s.charAt(5));

    //contains()--> ture/false

    System.out.println(s.contains("come"));//ture
    System.out.println(s.contains("abc"));//false
    System.out.println(s.contains("Come"));//false #CASE SENSATIVE

    // equals() & equalsIgnoreCase()

    s="welcome";

    System.out.println(s.equalsIgnoreCase("Welcome"));

    //replace

    s="Welcome to java - selenium";

    System.out.println(s.replace("e","a"));
    System.out.println(s.replace("Welcome","xyz"));

    //SubString 
    s="Welcome";
    System.out.println(s.substring(1,3));
    }
}