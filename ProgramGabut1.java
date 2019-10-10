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
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProgramGabut1 {
    public static void main(String[] args) {
        String pilihan;
        DataMahasiswa prosedur = new DataMahasiswa();
        Scanner input = new Scanner(System.in);
        do {
            pilihan = JOptionPane.showInputDialog(null, "Data Mahasiswa \n"
                                                         +"\n"
                                                         +"1. Tambah Data \n"
                                                         +"2. Lihat Data\n"
                                                         +"3. Hapus Data\n"
                                                         +"4. Hapus Semua Data\n"
                                                         +"5. Keluar\n"
                                                         +" \n");
            switch(pilihan){
                case "1" : prosedur.inputdata();
                    break;
                case "2" : prosedur.lihatdata();
                    break;
                case "3" : prosedur.hapusdata();
                    break;
                case "4" : prosedur.hapussemuadata();
                    break;
                case "5" : prosedur.keluar();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Inputan Salah");
            }
        } while (!"99".equals(pilihan));
    }
}
