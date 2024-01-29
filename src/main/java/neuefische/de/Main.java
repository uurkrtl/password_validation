package neuefische.de;

public class Main {
    public static void main(String[] args) {
        hasLowercaseLetters("asdflkjasdf");
        sayHelloWorld();
    }

    public static void sayHelloWorld() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello world!\n");
        sb.append("in this recap lecture we will ignore the fact that REGEX exists!\n");
        System.out.println(sb);
    }

    public static Boolean hasAtLeast8Characters(String pw) {
        return pw.length() > 7;
    }

    public static Boolean hasLowercaseLetters(String pw) {
        char[] allowedCharacters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(char c : allowedCharacters){
            if (pw.contains("" + c)) return true;
        }
        return false;
    }

    public static Boolean hasUppercaseLetters(String pw) {
        char[] allowedCharacters = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
        for(char c : allowedCharacters){
            if (pw.contains("" + c)) return true;
        }
        return false;
    }

    public static Boolean containsDigits(String pw) {
        return !pw.isEmpty();
    }

    public static Boolean containsSpecialCharacters(String pw) {
        return !pw.isEmpty();
    }
}