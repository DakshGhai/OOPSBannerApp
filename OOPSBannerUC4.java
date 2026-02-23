public class OOPSBannerUC4 {

    public static String[] createBanner() {

        String[] banner = {
            String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*     *", "*      "),
            String.join("   ", "*     *", "*     *", " ***** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*      ", "      *"),
            String.join("   ", " ***** ", " ***** ", "*      ", " ***** ")
        };

        return banner;
    }

        public static void printBanner(String[] banner) {
        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

       
        String[] banner = createBanner();

       
        printBanner(banner);
    }
}