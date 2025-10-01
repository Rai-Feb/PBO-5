import java.util.Scanner;

public class NilaiMahasiswa {

    public static void main(String[] args) {
        // Objek Scanner untuk menerima input
        Scanner input = new Scanner(System.in);

        // --- Tampilan Input ---
        System.out.println("-------------------------------------");
        System.out.println("        INPUT DATA NILAI MAHASISWA   ");
        System.out.println("-------------------------------------");

        // 1. Input Data Mahasiswa (Teks)
        // Menghilangkan teks ": <input>"
        System.out.print("NPM             : "); 
        String npm = input.nextLine(); 

        System.out.print("Nama Mahasiswa  : ");
        String nama = input.nextLine(); 

        // 2. Input Nilai (Angka/Double)
        System.out.print("Nilai Kehadiran : ");
        double nilaiKehadiran = input.nextDouble();

        System.out.print("Nilai Tugas     : ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Nilai UTS       : ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Nilai UAS       : ");
        double nilaiUAS = input.nextDouble();
        
        // Membersihkan buffer Scanner
        input.nextLine(); 

        // --- Proses Perhitungan ---

        // Hitung Nilai Akhir
        double nilaiAkhir = (0.10 * nilaiKehadiran) + 
                            (0.20 * nilaiTugas) + 
                            (0.30 * nilaiUTS) + 
                            (0.40 * nilaiUAS);

        String grade;
        String keterangan;

        // Tentukan Grade dan Keterangan
        if (nilaiAkhir >= 76) {
            grade = "A";
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66) {
            grade = "B";
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46) {
            grade = "D";
            keterangan = "KURANG";
        } else { // 0 - 45
            grade = "E";
            keterangan = "KURANG SEKALI";
        }

        // --- Tampilan Output ---
        // Menghilangkan teks "<tampil otomatis>" dan menggantinya dengan nilai saja.
        System.out.println("\n-------------------------------------");
        System.out.println("        TAMPILAN HASIL OUTPUT        ");
        System.out.println("-------------------------------------");
        
        System.out.printf("NPM Mahasiswa   : %s\n", npm);
        System.out.printf("Nama Mahasiswa  : %s\n", nama);
        System.out.printf("Nilai Rata-rata : %.2f\n", nilaiAkhir); 
        System.out.printf("Grade           : %s\n", grade);
        System.out.printf("Keterangan      : %s\n", keterangan);
        System.out.println("-------------------------------------");

        // Tutup Scanner
        input.close();
    }
}