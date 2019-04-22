package pbo8;
import java.util.Scanner;
public class Bangun {
    
    float inputAngka(String text){
        Scanner baca = new Scanner(System.in);
        System.out.print("Masukkan "+text+" : ");
        float input = baca.nextFloat();
        return input;
    }
    
    void tampilLuas(float l){
        System.out.println("Luas bangun : "+l);
    }
    
    void tampilKeliling(float k){
        System.out.println("Keliling bangun : "+k);
    }
}
