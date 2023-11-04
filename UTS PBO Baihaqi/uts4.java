import java.util.Scanner;

class Bentuk {
    double hitungLuas() {
        return 0;
    }

    double hitungKeliling() {
        return 0;
    }
}

class Lingkaran extends Bentuk {
    private double jariJari;

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    double hitungLuas() {
        return 3.14 * jariJari * jariJari;
    }

    
    double hitungKeliling() {
        return 2 * 3.14 * jariJari;
    }
}

public class uts4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        Lingkaran lingkaran = new Lingkaran(jariJari);

        System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());
    }
}