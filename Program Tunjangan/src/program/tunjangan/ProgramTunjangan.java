/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program.tunjangan;
import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        System.out.println("=====Program Tunjangan=====");
        
        Scanner input = new Scanner(System.in);
        double tunjangan;
        String tanyaStatusMenikah;
        
        System.out.println("Berapa gaji pokok anda perbulan? : ");
        int gajiPokok = input.nextInt();
        input.nextLine();
        
        System.out.println("Status Anda? (Menikah/Belum : )");
        
        tanyaStatusMenikah = input.nextLine();
        
        if(tanyaStatusMenikah.equals("menikah")) {
        tunjangan = gajiPokok * 0.35;
        System.out.println("\n");
        System.out.println("=====Hasil Perhitungan Gaji Anda=====");
        
        System.out.println("Gaji Pokok : " +gajiPokok);
        System.out.println("Tunjangan : " +tunjangan);
        System.out.println("Total Gaji : " +(gajiPokok + tunjangan));
        }
    }
    
}
