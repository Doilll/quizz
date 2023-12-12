/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizz;

/**
 *
 * @author Eriko Naufal
 */

public class Quizz {
  public static void bubbleSort(Barang[] arr) {
    for (int i = arr.length - 1; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        if (arr[j].harga > arr[j + 1].harga) {
          Barang temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j].harga < arr[j + 1].harga) {
          Barang temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        } else if (arr[j].harga == arr[j + 1].harga) {
          if (arr[j].nama.compareTo(arr[j + 1].nama) > 0) {
            Barang temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    Barang[] barang = new Barang[3];
    barang[0] = new Barang("Beras", 10000);
    barang[1] = new Barang("Gula", 5000);
    barang[2] = new Barang("Teh", 2000);

    bubbleSort(barang);
    System.out.println("Mengurutkan Barang");
    for (Barang b : barang) {
      System.out.println(b.nama + ", " + b.harga);
    }
  }
}

class Barang {

  String nama;
  int harga;

  public Barang(String nama, int harga) {
    this.nama = nama;
    this.harga = harga;
  }
}

    /**
     * @param args the command line arguments
     */
   

    

