import java.util.*;

public class Solution {
    private static String PAPER_VAL = "P";
    private static String ROCK_VAL = "R";
    private static String SCISSORS_VAL = "S";
    private static String TIE_VAL = "-";

    enum Rules {
        PAPER(PAPER_VAL, SCISSORS_VAL),
        ROCK(ROCK_VAL, PAPER_VAL),
        SCISSORS(SCISSORS_VAL, ROCK_VAL);

        private final String key;
        private final String value;

        Rules(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String is() {
            return key;
        }

        public String looseWith() {
            return value;
        }
    }

    private String solve(Integer testId, Scanner scanner) {
        scanner.useDelimiter("\n");
        String items = scanner.next().replace(" ", "");
        char[] chars = items.toCharArray();

        return buildAnswer(testId, getAnswer(String.valueOf(chars[0]), String.valueOf(chars[1])));
    }

    private String getAnswer(String player1, String player2) {
        if (player1.equals(player2)) return TIE_VAL;

        if (Rules.PAPER.is().equals(player1)) {
            if (Rules.PAPER.looseWith().equals(player2)) return player2;

            return player1;

        } else if (Rules.SCISSORS.is().equals(player1)) {
            if (Rules.SCISSORS.looseWith().equals(player2)) return player2;

            return player1;

        } else if (Rules.ROCK.is().equals(player1)) {
            if (Rules.ROCK.looseWith().equals(player2)) return player2;

            return player1;
        }

        return TIE_VAL;
    }

    private String buildAnswer(Integer testId, String solution) {
        return String.format("Case #%d: %s", testId, solution);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int t = 1; t <= testCases; t++) {
            System.out.println(new Solution().solve(t, scanner));
        }
    }
}
