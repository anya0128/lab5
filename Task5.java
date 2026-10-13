public class Task5 {
    public static int binaryStringToInt(String s) {
        if (s == null) {
            throw new NullPointerException("Рядок не може бути null");
        }
        if (s.isEmpty()) {
            throw new IllegalArgumentException("Рядок не може бути порожнім");
        }
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException(
                    "Дозволено лише символи 0 та 1"
                );
            }
            result = result * 2 + (c - '0');
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(binaryStringToInt("10101"));
        System.out.println(binaryStringToInt("111"));
        System.out.println(binaryStringToInt("0"));
        try {
            System.out.println(binaryStringToInt("102"));
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        try {
            System.out.println(binaryStringToInt(""));
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}


