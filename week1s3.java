public class week1s3 {

    static void findLongestStreak(String signalLog) {
        char best = signalLog.charAt(0);
        int max = 1;
        int count = 1;

        for (int i = 1; i < signalLog.length(); i++) {

            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count > max) {
                max = count;
                best = signalLog.charAt(i);
            }
        }

        System.out.println(
            "Longest Streak: '" + best +
            "' repeated " + max + " times"
        );
    }

    public static void main(String[] args) {
        String signalLog = "RRGGGYRR";

        findLongestStreak(signalLog);
    }
}
