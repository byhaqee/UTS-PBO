import java.util.Scanner;

class biayaPulsa {
    private int jamAwal;
    private int menitAwal;
    private int detikAwal;
    private int jamSelesai;
    private int menitSelesai;
    private int detikSelesai;

    public biayaPulsa(int jamAwal, int menitAwal, int detikAwal, int jamSelesai, int menitSelesai, int detikSelesai) {
        this.jamAwal = jamAwal;
        this.menitAwal = menitAwal;
        this.detikAwal = detikAwal;
        this.jamSelesai = jamSelesai;
        this.menitSelesai = menitSelesai;
        this.detikSelesai = detikSelesai;
    }

    public int rumusWaktuTlp() {
        int waktuAwalDetik = jamAwal * 3600 + menitAwal * 60 + detikAwal;
        int waktuSelesaiDetik = jamSelesai * 3600 + menitSelesai * 60 + detikSelesai;
        return waktuSelesaiDetik - waktuAwalDetik;
    }

    public int rumusBiayaTlp() {
        int lamaTlp = rumusWaktuTlp();
        int jumlahPulsa = lamaTlp / 5;
        int biayaTlp = jumlahPulsa * 150;
        return biayaTlp;
    }

    public void tampilBiaya() {
        int lamaTelepon = rumusWaktuTlp();
        int biayaTelepon = rumusBiayaTlp();

        System.out.println("Lama Percakapan: " + lamaTelepon + " detik");
        System.out.println("Biaya Percakapan: Rp. " + biayaTelepon);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                           =================================
                                    SELAMAT DATANG
                                BAIHAQI WARUNG TELEPON
                           =================================""");

        System.out.print("Masukkan jam awal: ");
        int jamAwal = input.nextInt();
        System.out.print("Masukkan menit awal: ");
        int menitAwal = input.nextInt();
        System.out.print("Masukkan detik awal: ");
        int detikAwal = input.nextInt();

        System.out.println("=================================");

        System.out.print("Masukkan jam selesai: ");
        int jamSelesai = input.nextInt();
        System.out.print("Masukkan menit selesai: ");
        int menitSelesai = input.nextInt();
        System.out.print("Masukkan detik selesai: ");
        int detikSelesai = input.nextInt();

        System.out.println("=================================");

        biayaPulsa telepon = new biayaPulsa(jamAwal, menitAwal, detikAwal, jamSelesai, menitSelesai, detikSelesai);

        telepon.tampilBiaya();
    }
}