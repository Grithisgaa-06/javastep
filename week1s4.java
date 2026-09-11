public class week1s4 {

    static void analyzeInventory(int[] a, int[] b) {
        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < a.length; i++) {
            sumA += a[i];
            sumB += b[i];
        }

        String status;

        if (sumA == sumB) {
            status = "Balanced";
        } else {
            status = "Not Balanced";
        }

        int max = a[0];
        String section = "Section A";
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                section = "Section A";
                index = i;
            }

            if (b[i] > max) {
                max = b[i];
                section = "Section B";
                index = i;
            }
        }

        System.out.println(
            "Section A Total: " + sumA +
            " | Section B Total: " + sumB +
            " | Status: " + status +
            " | Highest Quantity: " + max +
            " (" + section + ", Item " + (index + 1) + ")"
        );
    }

    public static void main(String[] args) {
        int[] a = {20, 15, 30};
        int[] b = {25, 10, 30};

        analyzeInventory(a, b);
    }
}
