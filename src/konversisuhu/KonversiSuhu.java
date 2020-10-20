/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class KonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- KONVERSI NILAI SUHU ---\n");
        System.out.print("Masukkan nilai Suhu(Celcius) : ");
        float celcius = input.nextFloat();
        
        System.out.println("Konversikan menjadi : ");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.println("3. Reamur");
        System.out.print("Masukkan no pilihan anda : ");
        int konversi = input.nextInt();
        
        switch (konversi) {
            case 1:
                float fahrenheit = (celcius * 9/5) + 32;
                System.out.println("\nCelcius -> Fahrenheit = "+ fahrenheit);
                break;
            case 2:
                float kelvin = celcius + 273;
                System.out.println("\nCelcius -> Kelvin = "+ kelvin);
                break;
            case 3:
                float reamur = celcius * 4/5;
                System.out.println("\nCelcius -> Reamur = "+ reamur);
                break;
            default:
                System.out.println("\nMohon Maaf, Pilihan tidak ditemukan");
                break;
        }
    }
    
}
