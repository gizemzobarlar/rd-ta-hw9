package org.example;

public class KarekokHesaplayici {

    public static double hesaplaKarekok(double sayi) throws IllegalArgumentException, ArithmeticException {
        if (sayi < 0) {
            throw new IllegalArgumentException("Negatif sayılar için karekök hesaplanamaz.");
        } else if (sayi == 0) {
            throw new ArithmeticException("Sıfır için karekök hesaplanamaz.");
        }

        return Math.sqrt(sayi);
    }

    public static void main(String[] args) {
        // Test
        try {
            double karekok = hesaplaKarekok(-7); // Negatif sayı
            System.out.println("Karekök: " + karekok);
        } catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
        }

        try {
            double karekok = hesaplaKarekok(0); // Sıfır
            System.out.println("Karekök: " + karekok);
        } catch (ArithmeticException e) {
            System.out.println("Hata: " + e.getMessage());
        }

        try {
            double karekok = hesaplaKarekok(256); // Geçerli bir sayı
            System.out.println("Karekök: " + karekok);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}


