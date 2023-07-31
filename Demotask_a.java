public class Demotask_a {

    public static void main(String[] args) {

        String colorRed = "\033[41;1m";
        String colorGreen = "\033[42;1m";
        String colorReset = "\033[0m";

        System.out.printf("%s[%6s%s%-6s]%s\n",colorRed, "5", colorGreen, "0%",colorReset);

    }
}