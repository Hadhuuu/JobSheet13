import java.util.Scanner;

public class Kubus_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("silahkan masukkan panjang rusuk kubus : ");
        int rusuk = sc .nextInt();
        HitungVolume(rusuk);
        HitungLuasP(rusuk);
    }

    static void HitungVolume (int rusuk) {
        int hasil = rusuk*rusuk*rusuk;
        System.out.println("Volume dari kubus dengan panjang rusuk " + rusuk + " adalah " + hasil);
    }

    static void HitungLuasP (int rusuk) {
        int luasP = rusuk*rusuk*6;
        System.out.println("Luas permukaan dari kubus dengan panjang rusuk " + rusuk + " adalah " + luasP);
    }
}