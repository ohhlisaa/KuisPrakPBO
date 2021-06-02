/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;
import java.util.Scanner;
import kuis1.Hasil.Android;
import kuis1.Hasil.Web;
/**
 *
 * @author Shofiya Khalisa
 */
public class Main {
    int pilihan;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main main = new Main();
        
        boolean exit = false;
        
        do{
            Scanner menu = new Scanner(System.in);
            System.out.println("FORM PENDAFTARAN");
            System.out.println("1. Android Development");
            System.out.println("2. Web Development");
            System.out.print("Pilih Jenis Form : ");
            main.pilihan = menu.nextInt();
            
            switch(main.pilihan){
                case 1:
                    main.android(input);
                    break;
                case 2:
                    main.web(input);
                    break;
                case 3:
                    exit=true;
                    break;
            }
            System.out.print("\n");
        } while(!exit);
    }
    
    public void android(Scanner input) {
        int tulis, coding, wawancara;
        String nik, nama;
        
        System.out.print("Input NIK : ");
        nik = input.nextLine();
        System.out.print("Input Nama : ");
        nama = input.nextLine();
        System.out.print("Input Nilai Tes Tulis   : ");
        tulis = input.nextInt();
        System.out.print("Input Nilai Tes Coding  : ");
        coding = input.nextInt();
        System.out.print("Input Nilai Tes Wawancara  : ");
        wawancara = input.nextInt();
        
        Android android = new Android(nik,nama,tulis,coding,wawancara);
        
        do{
            System.out.println("\n======= Menu =======\n");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Edit Data");
            System.out.println("3. Keluar");
            System.out.println("Pilih : ");
            pilihan = input.nextInt();

            switch (pilihan){
                case 1 :
                        System.out.println("Nilai akhir : "+ android.NilaiAkhir());
                        System.out.println("Keterangan : "+ android.Keterangan());
                      
                        break;

                case 2 :
                        System.out.println("===== Input Data =====\n");
                        
                        input = new Scanner(System.in);
                        
                        System.out.print("Input NIK : ");
                        nik = input.nextLine();
                        System.out.print("Input Nama : ");
                        nama = input.nextLine();
                        System.out.print("Input Nilai Tes Tulis   : ");
                        tulis = input.nextInt();
                        System.out.print("Input Nilai Tes Coding  : ");
                        coding = input.nextInt();
                        System.out.print("Input Nilai Tes Wawancara  : ");
                        wawancara = input.nextInt();
                        android.setNik(nik);
                        android.setNama(nama);
                        android.setTulis(tulis);
                        android.setCoding(coding);
                        android.setWawancara(wawancara);
                        break;

                case 3 :
                        break;
            }  
        } while (pilihan != 3);
    } 

    public void web(Scanner input) {
        int tulis, coding, wawancara;
        String nik, nama;
        
        System.out.print("Input NIK : ");
        nik = input.nextLine();
        System.out.print("Input Nama : ");
        nama = input.nextLine();
        System.out.print("Input Nilai Tes Tulis   : ");
        tulis = input.nextInt();
        System.out.print("Input Nilai Tes Coding  : ");
        coding = input.nextInt();
        System.out.print("Input Nilai Tes Wawancara  : ");
        wawancara = input.nextInt();
        
        Web web = new Web(nik,nama,tulis,coding,wawancara);
        
        do{
            System.out.println("\n======= Menu =======\n");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Edit Data");
            System.out.println("3. Keluar");
            System.out.println("Pilih : ");
            pilihan = input.nextInt();

            switch (pilihan){
                case 1 :
                        System.out.println("Nilai akhir : "+ web.NilaiAkhir());
                        System.out.println("Keterangan : "+ web.Keterangan());
                        break;

                case 2 :
                        System.out.println("===== Input Data =====\n");
                        
                        input = new Scanner(System.in);
                        
                        System.out.print("Input NIK : ");
                        nik = input.nextLine();
                        System.out.print("Input Nama : ");
                        nama = input.nextLine();
                        System.out.print("Input Nilai Tes Tulis   : ");
                        tulis = input.nextInt();
                        System.out.print("Input Nilai Tes Coding  : ");
                        coding = input.nextInt();
                        System.out.print("Input Nilai Tes Wawancara  : ");
                        wawancara = input.nextInt();
                        
                        web.setNik(nik);
                        web.setNama(nama);
                        web.setTulis(tulis);
                        web.setCoding(coding);
                        web.setWawancara(wawancara);
                        
                        break;

                case 3 :
                        break;
            }  
        } while (pilihan != 3);
    }     
}
