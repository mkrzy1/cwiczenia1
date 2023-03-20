package pl.athos.cwiczenie1;

public class Main {
    public int zwroc5() {
        return 5;
    }

    public static int zwroc5Statycznie() {
        return 5;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int a = zwroc5Statycznie();
        int b = main.zwroc5();


        System.out.println("Hello world!");
        return;
    }
}