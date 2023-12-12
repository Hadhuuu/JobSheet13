import java.util.Scanner;

public class NilaiMahasiswaa12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = scanner.nextInt();

        int[][] nilaiMahasiswa = new int[jumlahMahasiswa][jumlahTugas];
        String[] namaMahasiswa = new String[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.next();
            System.out.println("Masukkan nilai untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Tugas " + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }

        tampilkanNilaiMahasiswa(nilaiMahasiswa, namaMahasiswa, jumlahMahasiswa, jumlahTugas);
        int hariTerbaik = hariTerbaik(nilaiMahasiswa, jumlahMahasiswa, jumlahTugas);
        System.out.println("Hari terbaik: Tugas ke-" + hariTerbaik);
        mahasiswaTerbaik(nilaiMahasiswa, namaMahasiswa, jumlahMahasiswa, jumlahTugas);
    }

    public static void tampilkanNilaiMahasiswa(int[][] nilaiMahasiswa, String[] namaMahasiswa, int jumlahMahasiswa, int jumlahTugas) {
        System.out.println("Nilai Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print(namaMahasiswa[i] + ": ");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int hariTerbaik(int[][] nilaiMahasiswa, int jumlahMahasiswa, int jumlahTugas) {
        int[] totalPerTugas = new int[jumlahTugas];       
        for (int i = 0; i < jumlahTugas; i++) {
            for (int j = 0; j < jumlahMahasiswa; j++) {
                totalPerTugas[i] += nilaiMahasiswa[j][i];
            }
        }
        int tugasTerbaik = 0;
        for (int i = 1; i < jumlahTugas; i++) {
            if (totalPerTugas[i] > totalPerTugas[tugasTerbaik]) {
                tugasTerbaik = i;
            }
        }
        return tugasTerbaik + 1;
    }

    public static void mahasiswaTerbaik(int[][] nilaiMahasiswa, String[] namaMahasiswa, int jumlahMahasiswa, int jumlahTugas) {
        int mahasiswaTerbaik = 0;
        int tugasTerbaik = 0;
        int nilaiTerbaik = nilaiMahasiswa[0][0];
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahTugas; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTerbaik) {
                    nilaiTerbaik = nilaiMahasiswa[i][j];
                    mahasiswaTerbaik = i;
                    tugasTerbaik = j + 1;
                }
            }
        }
        System.out.println("Mahasiswa terbaik: " + namaMahasiswa[mahasiswaTerbaik]);
        System.out.println("Nilai tertinggi: " + nilaiTerbaik);
        System.out.println("Tugas ke-" + tugasTerbaik);
    }
}
