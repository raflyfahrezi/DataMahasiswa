/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raflyfahrezi;

/**
 *
 * @author Farhan R
 */
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class DataMahasiswa {
    ArrayList<String> nim = new ArrayList<>();
    ArrayList<String> nama = new ArrayList<>();
    ArrayList<String> jurusan = new ArrayList<>();
    
    public void inputdata(){
        if(nama.size() <= 2){
            Scanner input_inputdata = new Scanner(System.in);  
            String nim_temp;
            String nama_temp;
            String jurusan_temp;
            do {
                nim_temp = JOptionPane.showInputDialog(null, "Masukan NIM Anda \n"
                                                            +" \n");
                    if(nim_temp.length() != 8){
                        JOptionPane.showMessageDialog(null, "NIM harus 8 karakter");
                    }
            } while(nim_temp.length() != 8);
            nim.add(nim_temp);
            do {
                nama_temp = JOptionPane.showInputDialog(null, "Masukan Nama Anda \n"
                                                                    +" \n");
                    if(nama_temp.length() <= 3) {
                        JOptionPane.showMessageDialog(null, "Nama minimal 3 karater");
                    }
            } while(nama_temp.length() <= 3);
            nama.add(nama_temp);
            do {
                jurusan_temp = JOptionPane.showInputDialog(null, "Masukan Jurusan Anda"
                                                                +" \n");
                    if(jurusan_temp.length() <= 2) {
                        JOptionPane.showMessageDialog(null, "Jurusan minimal 2 karakter");
                    }
            } while (jurusan_temp.length() <= 2);
            jurusan.add(jurusan_temp);
            JOptionPane.showMessageDialog(null, "Data Berhasil di Input");
        } else {
            JOptionPane.showMessageDialog(null, "Array penuh");
        }
    }
    
    public void lihatdata(){
        if(nama.isEmpty()){
            JOptionPane.showMessageDialog(null, "Data Kosong");
        } else {
            int a = 1;
            for(int i = 0; i <= nama.size() -1; i++){
                JOptionPane.showMessageDialog(null, "Data ke " + a + " dari " + nama.size() + " data \n"
                                                   +"\n"
                                                   +"NIM     : " + nim.get(i) + "\n"
                                                   +"Nama    : " + nama.get(i) + "\n"
                                                   +"Jurusan : " + jurusan.get(i) + "\n" 
                                                   +" \n");
                a = a + 1;
            }
        }
    }
    
    public void hapusdata(){
        if(nama.isEmpty()){
            JOptionPane.showMessageDialog(null, "Data Kosong");
        } else {
            String a = JOptionPane.showInputDialog(null,"Nama : " + nama + "\n"
                                                       +" \n"
                                                       +"Urutan yang ingin di hapus ? \n"
                                                       +" \n");
            int i = Integer.parseInt(a);
            String pilihan;
            if(i <= nama.size()){
                do {
                pilihan = JOptionPane.showInputDialog(null, "Apakah anda yakin ? (Y/N)");
                pilihan = pilihan.toUpperCase();
                    switch (pilihan) {
                        case "Y":
                            nama.remove(i);
                            nim.remove(i);
                            jurusan.remove(i);
                            JOptionPane.showMessageDialog(null, "Data di urutan " + i + " berhasil di hapus");
                            break;
                        case "N":
                            JOptionPane.showMessageDialog(null, "Data tidak jadi dihapus");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Inputsan Salah");
                            break;
                    }
                } while (!"Y".equals(pilihan) && !"N".equals(pilihan));
            } else {
                JOptionPane.showMessageDialog(null, "Urutan tidak ditemukan");
            }
        }
    }
    
    public void hapussemuadata(){
        String pilihan_hapusdata;
            if(nama.isEmpty()){
                JOptionPane.showMessageDialog(null, "Data Kosong");
            } else {
                do {
                    pilihan_hapusdata = JOptionPane.showInputDialog(null, "Apakah anda yakin ? (Y/N)");
                    pilihan_hapusdata = pilihan_hapusdata.toUpperCase();
                    switch (pilihan_hapusdata) {
                        case "Y":
                                nama.clear();
                                nim.clear();
                                jurusan.clear();
                                JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
                            break;
                        case "N":
                                JOptionPane.showMessageDialog(null, "Data tidak jadi di hapus");
                            break;
                        default:
                                JOptionPane.showMessageDialog(null, "Inputan Salah");
                            break;
                    }
                } while (!"N".equals(pilihan_hapusdata) && !"Y".equals(pilihan_hapusdata)); 
            }
    }
    
    public void keluar(){
        JOptionPane.showMessageDialog(null, "Developer : Farhan Rafly Fahrezi");
        System.exit(0);
    }
    
}
