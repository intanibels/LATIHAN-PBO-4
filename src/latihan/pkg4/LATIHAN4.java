/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg4;
import java.util.Scanner; //supaya program dapat menggunakan Scanner
/**
 *
 * @author Intan
 */
public class LATIHAN4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in); //membuat scanner
        int bil, hasil; //deklarasi variabel
        System.out.print("Masukkan suatu bilangan : "); //memberi instruksi kepada user untuk menginputkan suatu bilangan
        bil = masukan.nextInt(); //untuk menerima inputan bilangan dari keyboard 
        hasil = faktorial(bil); //progra variabel hasil dilanjutkan ke fungsi faktorial
        System.out.println("Nilai faktorial "+bil+" adalah "+hasil); //menampilkan hasil ouput
    }private static int faktorial(int a){ //membuat method faktorial
        if(a==1){ //perulangan jika bilangan adalah 1
            return 1; //agar dapat menampilkan output
        }else{ //perulangan jika bilangan adalah selain bilangan 1
            return(a*faktorial(a-1)); //untuk menghitung faktorial dan dapat menampilkan output
        }
    }
}
