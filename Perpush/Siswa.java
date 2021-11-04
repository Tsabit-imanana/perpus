/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpush;

/**
 *
 * @author WINDOWS 10
 */
public class Siswa{
    private int idSiswa;
    private String nama, alamat, telepon;
    boolean status;

    public Siswa(int idSiswa, String nama, String alamat, String telepon, boolean status) {
        this.idSiswa = idSiswa;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.status = status;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idSiswa"
    public int getIdSiswa() {
        return idSiswa;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "nama"
    public String getNamaSiswa() {
        return nama;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "alamat"
    public String getAlamat() {
        return alamat;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "telepon"
    public String getTelepon() {
        return telepon;
    }
    
    //method untuk mengubah status peminjaman siswa
    public void UbahStatus(){
        this.status = !this.status;
    }

    //method untuk mendapatkan status peminjaman
    public String getStatus() {
        if (status) {
            return "Diijinkan meminjam";
        }
        else{
            return "Tidak Diijinkan meminjam";
        }
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "isStatus"
    public boolean cekStatus() {
        return status;
    }
    
}
