import java.text.NumberFormat;
import java.util.Locale;

// Class: Mobil
// Konsep: Class, Attribute, Constructor, Encapsulation, Accessor, Mutator, Formatter, Inheritance (Super Class)

public class Mobil { // Class (Super Class)

    // Atribut (Encapsulation) — sebagian final agar tidak bisa diubah setelah dibuat
    private final String model;                // Final: tidak bisa diubah
    private String merk;
    private int tahun;
    private double harga;
    private String transmisi;
    private String jenisBahanBakar;
    private String platDaerah;
    private int tahunPlat;
    private String bulanPajak;
    private int tahunPajak;
    private double biayaPajak;

    // Constructor: digunakan untuk inisialisasi data ketika objek dibuat
    public Mobil(String model, String merk, int tahun, double harga,
                 String transmisi, String jenisBahanBakar, String platDaerah,
                 int tahunPlat, String bulanPajak, int tahunPajak, double biayaPajak) {
        this.model = model;
        this.merk = merk;
        this.tahun = tahun;
        this.harga = harga;
        this.transmisi = transmisi;
        this.jenisBahanBakar = jenisBahanBakar;
        this.platDaerah = platDaerah;
        this.tahunPlat = tahunPlat;
        this.bulanPajak = bulanPajak;
        this.tahunPajak = tahunPajak;
        this.biayaPajak = biayaPajak;
    }

    // Accessor: Getter — mengambil nilai atribut (Encapsulation)
    public String getModel() { return model; }
    public String getMerk() { return merk; }
    public int getTahun() { return tahun; }
    public double getHarga() { return harga; }
    public String getTransmisi() { return transmisi; }
    public String getJenisBahanBakar() { return jenisBahanBakar; }
    public String getPlatDaerah() { return platDaerah; }
    public int getTahunPlat() { return tahunPlat; }
    public String getBulanPajak() { return bulanPajak; }
    public int getTahunPajak() { return tahunPajak; }
    public double getBiayaPajak() { return biayaPajak; }

    // Mutator: Setter — mengubah nilai atribut (Encapsulation)
    public void setMerk(String merk) { this.merk = merk; }
    public void setTahun(int tahun) { this.tahun = tahun; }
    public void setHarga(double harga) { this.harga = harga; }
    public void setTransmisi(String transmisi) { this.transmisi = transmisi; }
    public void setJenisBahanBakar(String jenisBahanBakar) { this.jenisBahanBakar = jenisBahanBakar; }
    public void setPlatDaerah(String platDaerah) { this.platDaerah = platDaerah; }
    public void setTahunPlat(int tahunPlat) { this.tahunPlat = tahunPlat; }
    public void setBulanPajak(String bulanPajak) { this.bulanPajak = bulanPajak; }
    public void setTahunPajak(int tahunPajak) { this.tahunPajak = tahunPajak; }
    public void setBiayaPajak(double biayaPajak) { this.biayaPajak = biayaPajak; }

    // Utility Method: Format harga menjadi mata uang Rupiah (Formatter)
    public String getHargaFormatRupiah() {
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
        return formatRupiah.format(harga).split(",")[0]; // Hapus pecahan sen
    }
}
