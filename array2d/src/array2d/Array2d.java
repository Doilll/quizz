
package array2d;


public class Array2d {

   
    public static void main(String[] args) {
        String[][] barang = {{"motor","mobil","truck","monitor","komputer"},{"1000","2000","3000","4000","6000"}};
        int a = 0;
        int b = 1;
        System.out.print("Barang: ");
        for (int i = 0;i < 5;i++){
            System.out.print(barang[a][i]+" ");
        }
        System.out.println("");
        System.out.print("Harga: ");
        for (int i = 0;i < 5;i++){
            System.out.print(barang[b][i]+" ");
        }
    }
    
}
