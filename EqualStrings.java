public class EqualStrings {
    public static void main(String[] args) {

        // string declaration
        String str1 = "Meghana";
        String str2 = "Meghana";

        // str1.equals(str2) method returns true if str1 has same characters as that of str2
        boolean areTwoStringsEqual = str1.equals(str2);
         
        System.out.println("Are two strings equal : "+areTwoStringsEqual);
    }
}