import java.util.Scanner;

public class NilaiMahasiswa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("-------------------------------------");
        System.out.println("        INPUT DATA NILAI MAHASISWA   ");
        System.out.println("-------------------------------------");

        // Input Data Mahasiswa 

        System.out.print("NPM             : "); 
        String npm = input.nextLine(); 

        System.out.print("Nama Mahasiswa  : ");
        String nama = input.nextLine(); 

        // Input Nilai Mahasiswa 
        System.out.print("Nilai Kehadiran : ");
        double nilaiKehadiran = input.nextDouble();

        System.out.print("Nilai Tugas     : ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Nilai UTS       : ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Nilai UAS       : ");
        double nilaiUAS = input.nextDouble();
       
        input.nextLine(); 

        // Menghitung Nilai Akhir
        double nilaiAkhir = (0.10 * nilaiKehadiran) + 
                            (0.20 * nilaiTugas) + 
                            (0.30 * nilaiUTS) + 
                            (0.40 * nilaiUAS);

        String mutu;
        String keterangan;


        if (nilaiAkhir >= 76) {
            mutu = "A";
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66) {
            mutu = "B";
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56) {
            mutu = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46) {
            mutu = "D";
            keterangan = "KURANG";
        } else { // 0 - 45
            mutu = "E";
            keterangan = "KURANG SEKALI";
        }

        // Display
        System.out.println("\n-------------------------------------");
        System.out.println("        TAMPILAN HASIL OUTPUT        ");
        System.out.println("-------------------------------------");
        
        System.out.printf("NPM Mahasiswa   : %s\n", npm);
        System.out.printf("Nama Mahasiswa  : %s\n", nama);
        System.out.printf("Nilai Rata-rata : %.2f\n", nilaiAkhir); 
        System.out.printf("Mutu          : %s\n", mutu);
        System.out.printf("Keterangan      : %s\n", keterangan);
        System.out.println("-------------------------------------");


        input.close();
    }

}
