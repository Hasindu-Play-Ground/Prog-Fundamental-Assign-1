public class Demo4 {
    
    public static void main(String[] args) {
        
        int day = 28;
        int month =12;
        int year = 2023;
        int hour = 23;
        int minute = 59;
        int second = 59;

        String colorRed = "\u001B[31m";
        String colorGreen = "\u001B[32m";
        String colorYellow = "\u001B[33m";
        String colorBlue = "\u001B[34m";
        String colorMagenta = "\u001B[35m";
        String colorCyan = "\u001B[36m";
        String colorReset = "\u001B[0m";

        System.out.printf("%s%02d%s/%s%02d%s/%s%d%s %s%02d%s:%s%02d%s:%s%02d%s\n",
                colorBlue, month, colorReset,
                colorCyan, day, colorReset,
                colorGreen, year, colorReset,
                colorMagenta, hour, colorReset,
                colorRed, minute, colorReset,
                colorYellow, second, colorReset);
    }
}
