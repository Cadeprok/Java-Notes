public class methods {
    public static void main(String[] args) {
        System.out.println(calculate(1, 2));
        printStatement();
    }

    static int calculate(int x, int y) { // int x and int y are parameters
        return x + y;
    }

    static void printStatement() { // void is used when not returning a value
        System.out.println("Hello World");
    }
}
