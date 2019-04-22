package pbo8;

public class Pbo8 {

    public static void main(String[] args) {
        float sisi, luas, keliling, a, t;
        Persegi psg = new Persegi();
        Segitiga segi3 = new Segitiga();
        
        sisi = psg.inputAngka("sisi");
        luas = psg.hitungLuas(sisi);
        keliling = psg.hitungKeliling(sisi);
        
        psg.tampilLuas(luas);
        psg.tampilKeliling(keliling);
        
        a = segi3.inputAngka("alas");
        t = segi3.inputAngka("tinggi");
        luas = segi3.hitungLuas(a,t);
        segi3.tampilLuas(luas);
    }
}
