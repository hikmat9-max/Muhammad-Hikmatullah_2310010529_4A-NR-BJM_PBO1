// Class: MobilListrik (Inheritance dari Mobil)
// Konsep: Inheritance, Constructor Chaining, Overriding, Polymorphism, Encapsulation
public class MobilListrik extends Mobil { // Subclass

    // Atribut tambahan
    private double kapasitasBaterai; // Khusus mobil listrik

    // Constructor dengan super()
    public MobilListrik(String model, String merk, int tahun, double harga,
                        String platDaerah, int tahunPlat, String bulanPajak, int tahunPajak,
                        double biayaPajak, double kapasitasBaterai) {

        // Constructor chaining ke superclass
        super(model, merk, tahun, harga, 
              "Otomatis", // Default: Mobil listrik = transmisi otomatis
              "Listrik",  // Default: bahan bakar listrik
              platDaerah, tahunPlat, bulanPajak, tahunPajak, biayaPajak);

        this.kapasitasBaterai = kapasitasBaterai;
    }

    // Accessor
    public double getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    // Mutator
    public void setKapasitasBaterai(double kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }
}
