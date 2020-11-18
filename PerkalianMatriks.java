/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dill
 */
public class PerkalianMatriks {
  public static void main (String[] args) {
    int Mat1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int Mat2[][] = {{10}, {11}, {12}};
    //int Mat1[][] = {{1, 2, 3}, {4,0,1}};
    //int Mat2[][] = {{1,2}, {3,1}, {-1,2}};
    
    int Hasil[][];
    int tmp;
    
    if(Mat1.length>0) {
      if(Mat1[0].length != Mat2.length) {
        System.out.println("Error, kolom Mat1 harus sama dengan baris Mat2");
      }
      else {
        //Deklarasi panjang matriks
        //perkalian antara matriks [3x3] [3x1] akan menghasilkan matriks [3x1]
        Hasil = new int[Mat1.length][Mat2[0].length];
        
        
        for(int i=0; i<Hasil.length; i++) { //loop sesuai panjang baris matriks hasil
          for(int k=0; k<Hasil[i].length; k++) { //loop sesuai panjang kolom matriks hasil
            tmp = 0; //variable sementara
            
            for(int j=0; j<Mat1[i].length; j++) { //loop sesuai panjang kolom Mat1
              tmp = tmp + (Mat1[i][j] * Mat2[j][k]); //proses perkalian + penjumlahan hasil
            }
            
            Hasil[i][k] = tmp; //proses tampung hasil matriks
          }
        }
        
        //Proses menampilkan hasil matriks
        for(int i=0; i<Hasil.length; i++) {
          for(int k=0; k<Hasil[i].length; k++) {
            System.out.print(Hasil[i][k] + " ");
          }
          System.out.println();
        }
      }
    }
    else {
      System.out.println("Tidak ada matriks yang dihitung");
    }
  }
}
