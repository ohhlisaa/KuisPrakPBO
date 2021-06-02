/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1.Hasil;

/**
 *
 * @author Shofiya Khalisa
 */
public class Web implements Nilai{
    String nama, nik;
    private int tulis, coding, wawancara;

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public Web(String nama, String nik, int tulis, int coding, int wawancara) {
        this.nama = nama;
        this.nik = nik;
        this.tulis = tulis;
        this.coding = coding;
        this.wawancara = wawancara;
    }
 
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
     public Web(int tulis) {
        this.tulis = tulis;
    }

    public int getTulis() {
        return tulis;
    }

    public void setTulis(int tulis) {
        this.tulis = tulis;
    }
    

    public int getcoding() {
        return coding;
    }

    public void setCoding(int coding) {
        this.coding = coding;
    }
    

    public int getWawancara() {
        return wawancara;
    }

    public void setWawancara(int wawancara) {
        this.wawancara = wawancara;
    }
    
    @Override
    public double NilaiAkhir() {   
        return (this.tulis*0.40 + this.coding*0.35 + this.wawancara*0.25);
    }
    
        @Override
    public String Keterangan(){
        if(this.NilaiAkhir() >= 85)
            return "LULUS\n Selamat kepada "+this.nama+"telah diterima pada divisi Web";
        else
            return"GAGAL\n Mohon maaf kepada "+this.nama+"telah ditolak pada divisi Web";
    }
}

