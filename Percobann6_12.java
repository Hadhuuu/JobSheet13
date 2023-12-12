import java.util.Scanner;

public class Percobann6_12 {

    static int hitungLuas (int panjang, int lebar) {
        int luas=panjang*lebar;
        return luas;
    }

    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a, b)*tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,Vol;

        System.out.println("Masukkan panjang");
        p=input.nextInt();
        System.out.println("Masukkan lebar");
        l=input.nextInt();
        System.out.println("Masukkan tinggi");
        t=input.nextInt();

        L=hitungLuas(p, l);
        System.out.println("Luas Persegi panjang adalah " +L);

        Vol=hitungVolume(t, p, l);
        System.out.println("Volume balok adalah " + Vol);
    }
}