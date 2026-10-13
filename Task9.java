public class Task9 {
    public static int countCombinations(String s) {
        if (s == null) {
            throw new NullPointerException("Рядок не може бути null");
        }
        int count = 0;
        String[] words = s.split(" ");
        for (String word : words) {
            boolean hasLetter = false;
            boolean hasDigit = false;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if ((c >= 'a' && c <= 'z') ||
                    (c >= 'A' && c <= 'Z')) {
                    hasLetter = true;
                }
                if (c >= '0' && c <= '9') {
                    hasDigit = true;
                }
            }
            if (hasLetter && hasDigit) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String text = "The user with the nickname koala757677 " +
            "this month wrote 3 times more comments than the user " +
            "with the nickname croco181dile920 4 months ago";
        System.out.println(countCombinations(text));
        System.out.println(countCombinations("cat dog 123"));
        System.out.println(countCombinations("abc123 test456"));
        try {
            System.out.println(countCombinations(null));
        } catch (NullPointerException e) {
            System.out.println("Помилка: рядок не може бути null");
        }
    }
}
