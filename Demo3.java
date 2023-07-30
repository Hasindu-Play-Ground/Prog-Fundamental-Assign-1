public class Demo3 {
    
    public static void main(String[] args) {
        
        int areCode = 123;
        int prefix = 456;
        int lineNumber = 7890;

        String colorReset = "\u001B[0m]";
        String areaCodeColor = "\u001B[33m"; //yellow color

        System.out.printf("(%s%03d%s) %03d-%04d%n",areaCodeColor, areCode, colorReset, prefix, lineNumber);
    }
}
