public class OOPSBannerUC4 {

    // Helper method to return pattern for letter O
    public static String[] getO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Helper method to return pattern for letter P
    public static String[] getP() {
        return new String[]{
            " ***** ",
            "*     *",
            " ***** ",
            "*      ",
            "*      "
        };
    }

    // Helper method to return pattern for letter S
    public static String[] getS() {
        return new String[]{
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        // Get patterns using helper methods
        String[] O1 = getO();
        String[] O2 = getO();
        String[] P = getP();
        String[] S = getS();

        // Build banner using inline initialization and String.join()
        String[] banner = {
            String.join("   ", O1[0], O2[0], P[0], S[0]),
            String.join("   ", O1[1], O2[1], P[1], S[1]),
            String.join("   ", O1[2], O2[2], P[2], S[2]),
            String.join("   ", O1[3], O2[3], P[3], S[3]),
            String.join("   ", O1[4], O2[4], P[4], S[4])
        };

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}