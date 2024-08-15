public class Main {
    public static void main(String[] args) {
        printMegaBytesAndKilobytes(2500);
        printMegaBytesAndKilobytes(-1024);
        printMegaBytesAndKilobytes(5000);
    }

    public static void printMegaBytesAndKilobytes(int kilobytes){
        if () {
            int mega = kilobytes / 1024;
            int kb = kilobytes % 1024;
            System.out.println(kilobytes + " KB = " + mega + " MB and " + kb + " KB ");
            // String result = String.format("%s KB = %s MB and %s KB", kilobytes, mega, kb);
            // System.out.println(result);
        } else {
            System.out.println("Invaild Value");
        }
    }

}
