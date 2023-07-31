public class Demotask_b {
    
    public static void main(String[] args) {
        final String header = "%s|%s %s%s %s%-14s%s|%s%s%5s %s%s|%s \n";
        final String record2 = "%s|%s %s %-13s%s|%s%5d %s|%s \n";
        final String record3 = "%s|%s %s %-15s%s|%s%5d %s|%s \n";

        final int age1 = 24;
        final int age2 = 30;

        String name1 = "Alice";
        String name2 = "Bob";

        final String colorBlue = "\033[34m";
        final String colorBrown = "\033[38;5;214m";
        final String colorLightCyan = "\033[1;36m";
        final String colorReset = "\033[0m";

        String line = "+--------------------+------+";

        System.out.printf("%s%s%s\n", colorBrown, line, colorReset);
        System.out.printf(header, colorBrown, colorReset, colorBlue, "NAME", colorReset, "", colorBrown, colorReset, colorBlue, "AGE", colorReset, colorBrown, colorReset);
        System.out.printf("%s%s%s\n", colorBrown, line, colorReset);
        System.out.printf(record2, colorBrown, colorReset, name1, "", colorBrown, colorReset, age1, colorBrown, colorReset);
        System.out.printf(record3, colorBrown, colorReset, name2, "", colorBrown, colorReset, age2, colorBrown, colorReset);
        System.out.printf("%s%s%s\n", colorBrown, line, colorReset);





        
        

    }
}
