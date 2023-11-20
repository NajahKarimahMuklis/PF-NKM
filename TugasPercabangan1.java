import java.util.Scanner;

public class TugasPercabangan1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Silakan Input Jumlah Jam Kerja Dalam Sehari");
        int jam = sc.nextInt();
        int JamKerja = jam * 7;
        int Upah = JamKerja * 2000;
        int JamLembur = -(48 - JamKerja);
        int UpahLembur = 48 * 2000 + (JamLembur * 3000);

        if (JamKerja > 48) {
            System.out.println("Jumlah Jam Kerja perminggu = " + JamKerja + " jam");
            System.out.println("Upah perminggu = Rp"+ UpahLembur);
        } else {
            System.out.println("Jumlah Jam Kerja perminggu = " + JamKerja + " jam");
            System.out.println("Upah perminggu = " + Upah);
        }
    }
}
