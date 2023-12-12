import java.util.Scanner;

public class Ucapantrimakasih_12 {


    public static String PenerimaUcapan () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " +nama+ " for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void UcapanTambahan(String tambahan) {
        System.out.println(tambahan);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UcapanTerimakasih();
        System.out.println("Apakah ingin menambahkan ucapan ? (y/t)");
        String Pilihan = sc.nextLine();
        if (Pilihan.equalsIgnoreCase("y")) {
            System.out.println("Masukkan pesan tambahan");
            String tmbahan = sc.nextLine();
            UcapanTambahan(tmbahan);
        }
    }
    
}