public class Demo5 {
    
    public static void main(String[] args) {
        
        int prefix = 978;
        int group1 = 3;
        int group2 = 16;
        int code = 1484100;

        String colorRed = "\u001B[31m";
        String colorGreen = "\u001B[32m";
        String colorYellow = "\u001B[33m";
        String colorReset = "\u001B[0m";

        System.out.printf("%s%d%s-%s%d%s-%s%d%s-%s\n",
                colorGreen, prefix, colorReset,
                colorRed, group1, colorReset,
                colorYellow, group2, colorReset,
                code);
    }
}
