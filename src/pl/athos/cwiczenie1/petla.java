package pl.athos.cwiczenie1;

public class petla {
    public static void main(String[] args) {
        for (int i = -20; i <= 20; i++) {
            if (i % 3 ==0) {
                break;
                System.out.println(i + " ");
            }
        }
    }
}