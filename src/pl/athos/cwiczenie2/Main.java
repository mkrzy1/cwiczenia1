package pl.athos.cwiczenie2;

public class Main {
    public boolean czyPelnoletnia(int wiek) {
        if (wiek >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.czyPelnoletnia(15));
        System.out.println(main.czyPelnoletnia(18));

    }
}
