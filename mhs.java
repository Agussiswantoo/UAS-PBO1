/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mhs;

/**
 *
 * @author ASUS VIVOBOOK
 */
class Mahasiswa {

    private String nama;
    private int umur;
    private int angkatan;
    
    public Mahasiswa(String nama, int umur) {
       this.nama = nama;
       this.umur = umur;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public void displayInfo() {
        System.out.println("Saya " + getNama() + " umur " + getUmur());
    }
    
    class MahasiswaBaru extends Mahasiswa {
        private final int nim;
        
        public MahasiswaBaru(String nama, int umur, int nim) {
            super(nama, umur);
            this.nim = nim;
        }
        
        public int getNim() {
            return nim;
        }
        
        @Override
        public void displayInfo() {
            System.out.println("Saya " + getNama() + " umur " + getUmur() + " dengan nim " + nim);
        }
    }
    
    class MahasiswaLama extends Mahasiswa {
        
        public MahasiswaLama(String nama, int umur, int angkatan) {
            super(nama, umur);
    }
    }
    
    public int getAngkatan() {
        return 0;
    }
    
    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }
    
    public void displayinfo() {
        System.out.println("Saya " + getNama() + " umur " + getUmur() + " saya angkatan " + angkatan);
    }
     }

 public class mhs {
   public static void main(String[] args) {
// Instantiate Mahasiswa object
        Mahasiswa mahasiswa;
       mahasiswa = new Mahasiswa("Agus", 21);

        // Instantiate MahasiswaBaru using the Mahasiswa object
        Mahasiswa.MahasiswaBaru mahasiswaBaru = mahasiswa.new MahasiswaBaru("Agus", 21, 22166038);
        mahasiswaBaru.displayInfo();  // Call displayInfo on mahasiswaBaru instance

        // Instantiate MahasiswaLama using the Mahasiswa object
        Mahasiswa.MahasiswaLama mahasiswaLama = mahasiswa.new MahasiswaLama("Naruto", 25, 2018);
        mahasiswaLama.displayInfo();  // Call displayInfo on mahasiswaLama instance
    }
}