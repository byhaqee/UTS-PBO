class BBIdeal {
    private double beratBadan;
    private double tinggiBadan;

    public BBIdeal(double beratBadan, double tinggiBadan) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    public double hitungBMI() {
        return beratBadan / (tinggiBadan * tinggiBadan);
    }

    public String hasil() {
        double bmi = hitungBMI();
        if (bmi >= 18.5 && bmi <= 22.9) {
            return "Berat badan ideal";
        } else if (bmi > 22.9) {
            return "Overweight";
        } else {
            return "Underweight";
        }
    }

    public static void main(String[] args) {


        //------------------------------------------------//
        // Masukkan berat_badan dan tinggi_badan disini!!!
        double berat_badan = 80.0;  //<------- (Berat Badan dalam Kg)
        double tinggi_badan = 1.75; //<------- (Tinggi Badan dalam Meter)
        //------------------------------------------------//



        BBIdeal beratBadanObj = new BBIdeal(berat_badan, tinggi_badan);
        String status = beratBadanObj.hasil();

        System.out.println("BMI: " + beratBadanObj.hitungBMI());
        System.out.println("Status: " + status);
    }
}