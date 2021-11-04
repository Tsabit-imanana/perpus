/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpush;

/**
 *
 * @author WINDOWS 10
 */
public class ListSiswa {
    //pemeberian nilai pada array "listSiswa" dengan tipe class Siswa
    Siswa[] listSiswa = {
        new Siswa(1, "tsabit", "Jombang", "081259744980", true),
        new Siswa(2, "Ricco", "Malang", "082746333847", true),
        new Siswa(3, "Nabila", "Kediri", "081235244365", true),
    };
    
    //method untuk menampilkan data list siswa
    public void viewSiswa(){
        System.out.println("--- List Siswa ---");
        System.out.println("ID \t Nama \t\t Alamat \t\t Status");
        for (int i = 0; i < listSiswa.length; i++) {
            System.out.println(listSiswa[i].getIdSiswa() +" \t "+
                    listSiswa[i].getNamaSiswa()+" \t\t "+
                    listSiswa[i].getAlamat() +" \t\t "+
                    listSiswa[i].getStatus());
        }
    }
    
    public int cariSiswa(int id){
        int cari = 0;
        //pencarian data berdasarkan id
        for (int i = 0; i < listSiswa.length; i++) {
            if (listSiswa[i].getIdSiswa() == id) {
                cari = i; 
                //menyimpan nilai index dari data yg ditemukan
            }
        }
        return cari;
    }
    
    
}
