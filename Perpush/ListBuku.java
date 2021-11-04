/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpush;

/**
 *
 * @author WINDOWS 10
 */
public class ListBuku {
    //pemeberian nilai pada array "listBuku" dengan tipe class Buku
    Buku[] listBuku = {
        new Buku(1, "Fisika", 10),
        new Buku(2, "Bahasa", 10),
        new Buku(3, "Sosial", 10),
        new Buku(4, "Pemrograman Web", 10),
    };
    
    //method untuk menampilkan data list buku
    public void TampilBuku(){
        System.out.println("--- List Buku ---");
        System.out.println("ID \t Judul \t\t Stok");
        for (int i = 0; i < listBuku.length; i++) {
            System.out.println(listBuku[i].getIdBuku() + " \t " +
                    listBuku[i].getJudulBuku() + " \t\t " +
                    listBuku[i].getStok());
        }
    }
    
    public int cariBuku(int id){
        int found = 0;
        //pencarian data berdasarkan id
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].getIdBuku()== id) {
                found = i; 
                //menyimpan nilai index dari data yg ditemukan
            }
        }
        return found;        
    }
    
}
