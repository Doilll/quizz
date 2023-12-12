
package search;
import java.util.Scanner;
public class Search {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String barang[] = { "kulkas", "mobil", "bus", "komputer", "truck", "motor", "lemari", "Kursi", "Printer" };
        System.out.println("List barang:");
        for (int i = 0; i < 9; i++) {
            System.out.println((i + 1)+"." + barang[i]);

        }
        boolean ketemu = false;
        System.out.print("Cari barang: ");
        String cari = s.next();
        for (int i = 0; i < barang.length; i++) {
            if (cari.equalsIgnoreCase(barang[i])) {
                System.out.println("barang ada di urutan " + (i + 1));
                ketemu = true;
                break;
            }
        }
        if (ketemu==false){
            System.out.println("Barang tidak ditemukan");
        }
    }
    
}
