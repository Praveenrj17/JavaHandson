package string;

public class MergeString {
	public static String merge(String s1, String s2)
    {
        StringBuilder r= new StringBuilder();      
        for (int i = 0; i < s1.length() || i < s2.length(); i++) 
        {
            if (i < s1.length())
                r.append(s1.charAt(i));
            
            if (i < s2.length())
                r.append(s2.charAt(i));
        }
 
        return r.toString();
    }
    public static void main(String[] args)
    {
        String s1 = "Welcome";
        String s2 = "Problems";
        System.out.println(merge(s1, s2));
    }

}
