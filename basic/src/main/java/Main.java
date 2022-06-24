public class Main {

    public int n = 42; // instance variable -- exists for EVERY instance

    public static long something = 8L; // static or class variable -- exists only once (at class level)

    public static void main(String[] args) {
        Main instance1 = new Main();
        Main instance2 = new Main();

        System.out.println(Main.something);
        System.out.println(Main.something);

        System.out.println("----");
        Main.something = 999;

        System.out.println(Main.something);
        System.out.println(Main.something);
    }

    public void someMethod() {
        System.out.println(this.n);
        System.out.println(something);
    }


}
