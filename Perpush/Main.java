package Perpush;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Main {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       ListBuku listBuku = new ListBuku();
       ListSiswa listSiswa = new ListSiswa();
        
        System.out.println("=== Menu Utama ===");
        System.out.println("1. Pinjam Buku");
        System.out.println("2. Kembalikan buku");
        System.out.println("======");
        System.out.println("Pilih Menu : ");
        
        menu();
        
        System.out.println("Lakukan peminjaman/Pengembalian lagi?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.println("======");
        System.out.println("Pilih Menu : ");
        
        
        
        int Input = input.nextInt();
        if (Input == 1) {
            System.out.println("Masukkan ID : ");
        int InputId = input.nextInt();
            
        
        System.out.println("=== Menu Utama ===");
        System.out.println("1. Pinjam Buku");
        System.out.println("2. Kembalikan buku");
        System.out.println("======");
        System.out.println("Pilih Menu : ");
        
           
        }else{
            System.out.println("Terimakasih Telah mengunjungi perpustakaan");
        
        }
    }
    
    
    
    
    
    
    
    static void menu(){
        Scanner input = new Scanner(System.in);
        int Input = input.nextInt();
    if (Input==1) {
        
            ListBuku listBuku = new ListBuku();
            ListSiswa listSiswa = new ListSiswa();
            
            listSiswa.viewSiswa();
        listBuku.TampilBuku();
        
        System.out.println("Masukkan ID siswa :   ");
         
        System.out.println("");
        
        int inputId=input.nextInt();
        
        int IndexCari = listSiswa.cariSiswa(inputId);
        Siswa Siswa = listSiswa.listSiswa[IndexCari];
        
         if (Siswa.cekStatus()) {
                    //proses perubahan status siswa
                    listSiswa.listSiswa[IndexCari].UbahStatus();

                    System.out.println("Pilih ID buku yang dipinjam: ");
                    inputId = input.nextInt();
                    IndexCari = listBuku.cariBuku(inputId);

                    Buku selectedBuku = listBuku.listBuku[IndexCari];

                    System.out.println("--- List Peminjaman ---");
                    System.out.println("Judul Buku: " + selectedBuku.getJudulBuku());
                    System.out.println("Peminjam: " + Siswa.getNamaSiswa());

                    //proses pengurangan stok
                    listBuku.listBuku[IndexCari].kurangiStok();
                    
                    
                    listBuku.TampilBuku();
                } else {
                 System.out.println("Mohon kembalikan buku yang dipinjam ");
         }
            
        }else  {
            ListBuku listBuku = new ListBuku();
            ListSiswa listSiswa = new ListSiswa();
         System.out.println("Masukkan id Siswa : ");
         int inputId=input.nextInt();
         int IndexCari = listSiswa.cariSiswa(inputId);
         
         listSiswa.listSiswa[IndexCari].UbahStatus();
         listBuku.listBuku[IndexCari].TambahStok();
         
         System.out.println("Buku Telah dikembalikan");
         System.out.println("");
        }
    
    }
    static void lagi(){
     Scanner input = new Scanner(System.in);
    int Input = input.nextInt();
        
    }
}
