package tugaspbo;

public class TugasPBO {

    public static void main(String[] args) {
        String kris;
        RAS ber = new RAS();
        Manusia HA = new Manusia();
        RAS jan = new Manusia();
        Iblis mus = new Iblis();
        
        ber.Berjalan();
        HA.Berjalan();
        jan.Berjalan();
        kris = jan.Makan(" Woy ");
        ber.Goda();
        mus.Goda();
    }

}
