/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan56.umurbarangantik;

/**
 *
 * @author Asus
 * NAMA         : Muhammad Khatami
 * KELAS        : IF-1
 * NIM          : 10119026
 * Deskripsi Program : program ini untuk menampilkan umur barang antik
 */
public class BarangAntik {
    protected int umur;
    
    public BarangAntik(int umur){
       this.umur = umur; 
    }
    
    public void tampilUmur(){
        System.out.println("Umur barang antik ini adalah : " +umur);
    }
    
}
