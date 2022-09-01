import java.util.HashMap;

import java.util.Map;

public class Main {
    private static Map<Character, Integer> map = new HashMap<>();
    private static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
            "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit " +
            "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint " +
            "occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        String textLow = text.toLowerCase();
        int count = 1;
        for (char i : textLow.toCharArray()) {
            if (!map.containsKey(i)) {
                map.put(i, count);
            } else {
                int countNew = map.get(i) + 1;
                map.put(i, countNew);
            }
        }
        System.out.println(map);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() < min) {
                min = entry.getValue();
            }
        }
        System.out.println("Минимальное значение " + min);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        System.out.println("Максимальное значение " + max);
    }
}