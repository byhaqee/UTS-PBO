import java.util.Scanner;

class JumlahBilangan {
    private int[] bilangan = new int[10];

    public void inputData() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            bilangan[i] = input.nextInt();
        }

        input.close();
    }

    public int hitungJumlah() {
        int jumlah = 0;
        for (int i = 0; i < 10; i++) {
            jumlah += bilangan[i];
        }
        return jumlah;
    }

    public static void main(String[] args) {
        JumlahBilangan jumlahBilangan = new JumlahBilangan();
        jumlahBilangan.inputData();

        int total = jumlahBilangan.hitungJumlah();

        System.out.println("Hasil penjumlahan 10 bilangan adalah: " + total);
    }
}