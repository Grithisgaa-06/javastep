public class week1s5 {

    static void classifyWordLengths(String review) {
        String[] words = review.split(" ");

        int shortWord = 0;
        int medium = 0;
        int longWord = 0;

        for (String word : words) {
            int len = word.length();

            if (len <= 4) {
                shortWord++;
            } else if (len <= 8) {
                medium++;
            } else {
                longWord++;
            }
        }

        System.out.println(
            "Short: " + shortWord +
            " | Medium: " + medium +
            " | Long: " + longWord
        );
    }

    public static void main(String[] args) {
        String review =
            "This movie was absolutely fantastic and thrilling";

        classifyWordLengths(review);
    }
}