package praktika;

public class ReverseLetter {
    public static void main(String[] args) {
        String input = "J@va the be$t!123";
        System.out.println(reverseLetters(input));
    }
        public static String reverseLetters(String s){
            StringBuilder letters = new StringBuilder();
            for (char c : s.toCharArray()){
                if (Character.isLetter(c)){
                    letters.append(c);
                }
            }
            letters.reverse();

            StringBuilder result = new StringBuilder();
            int i = 0;
            for (char c : s.toCharArray()){
                if (Character.isLetter(c)){
                    result.append(letters.charAt(i));
                    i++;
                } else {
                    result.append(c);
                }
            }
            return result.toString();
        }
}
