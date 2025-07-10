// Import: Library untuk menulis file
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Class: Showroom
// Konsep: Class, Object, Array, Constructor, Polymorphism, Encapsulation, Accessor, Mutator, Error Handling, Perulangan, Seleksi, File Handling
public class Showroom { // Membuat class Showroom (OOP - Class)

    // Atribut (Encapsulation): menyimpan array objek Mobil (superclass dari MobilListrik)
    private Mobil[] daftarMobil; // Array sebagai struktur data
    private int jumlahMobil;     // Menyimpan jumlah mobil yang telah ditambahkan

    // Constructor: Inisialisasi kapasitas array mobil
    public Showroom(int kapasitas) {
        daftarMobil = new Mobil[kapasitas]; // Membuat array objek mobil
        jumlahMobil = 0;                    // Awalnya belum ada mobil
    }

    // Mutator: Menambahkan mobil ke dalam showroom
    public void tambahMobilObjek(Mobil m) {
        if (jumlahMobil < daftarMobil.length) {            // Validasi kapasitas
            daftarMobil[jumlahMobil++] = m;                // Polymorphism: m bisa Mobil biasa atau MobilListrik
            System.out.println("Mobil berhasil ditambahkan!");
        } else {
            System.out.println("Showroom sudah penuh!");   // Error Handling
        }
    }

    // Accessor: Menampilkan seluruh daftar mobil
    public void tampilkanMobil() {
        if (jumlahMobil == 0) {
            System.out.println("Belum ada mobil di showroom."); // Validasi kosong
        } else {
            for (int i = 0; i < jumlahMobil; i++) {             // Perulangan
                Mobil m = daftarMobil[i];                       // Akses elemen array

                // Informasi dasar
                System.out.println("[" + i + "] " + m.getModel() + " - " + m.getMerk());
                System.out.println("   Tahun: " + m.getTahun());
                System.out.println("   Harga: " + m.getHargaFormatRupiah());
                System.out.println("   Transmisi: " + m.getTransmisi());
                System.out.println("   Plat: " + m.getPlatDaerah() + " (" + m.getTahunPlat() + ")");
                System.out.println("   Pajak: " + m.getBulanPajak() + " " + m.getTahunPajak());
                System.out.println("   Biaya Pajak Tahunan: Rp" + String.format("%,.0f", m.getBiayaPajak()));

                // Seleksi + Polymorphism: jika MobilListrik, tampilkan baterai
                if (m instanceof MobilListrik) {
                    MobilListrik ml = (MobilListrik) m; // Downcasting
                    System.out.println("   Jenis: Mobil Listrik");
                    System.out.println("   Kapasitas Baterai: " + ml.getKapasitasBaterai() + " kWh");
                } else {
                    System.out.println("   Jenis: Mobil Biasa");
                    System.out.println("   Bahan Bakar: " + m.getJenisBahanBakar());
                }

                System.out.println("----------------------------------");
            }
        }
    }

    // Accessor: Mencari mobil berdasarkan model
    public void cariMobil(String modelCari) {
        boolean ditemukan = false; // Flag penanda

        for (int i = 0; i < jumlahMobil; i++) { // Perulangan mencari
            Mobil m = daftarMobil[i];

            if (m.getModel().equalsIgnoreCase(modelCari)) { // Pencocokan
                System.out.println("Ditemukan: " + m.getModel() + " - " + m.getMerk());
                System.out.println("   Tahun: " + m.getTahun());
                System.out.println("   Harga: " + m.getHargaFormatRupiah());
                System.out.println("   Transmisi: " + m.getTransmisi());
                System.out.println("   Pajak: " + m.getBulanPajak() + " " + m.getTahunPajak());

                if (m instanceof MobilListrik) {
                    System.out.println("   Jenis: Mobil Listrik");
                    System.out.println("   Baterai: " + ((MobilListrik) m).getKapasitasBaterai() + " kWh");
                } else {
                    System.out.println("   Jenis: Mobil Biasa");
                    System.out.println("   BBM: " + m.getJenisBahanBakar());
                }

                ditemukan = true;
                break; // Stop setelah ditemukan
            }
        }

        if (!ditemukan) {
            System.out.println("Mobil tidak ditemukan."); // Error Handling
        }
    }

    // Mutator: Mengedit mobil berdasarkan index
    public void editMobil(int index, Mobil mBaru) {
        if (index >= 0 && index < jumlahMobil) {     // Validasi index
            daftarMobil[index] = mBaru;              // Ganti objek mobil di index tersebut
            System.out.println("Data mobil berhasil diperbarui.");
        } else {
            System.out.println("Index tidak valid."); // Error Handling
        }
    }

    // Mutator: Menghapus mobil berdasarkan index
    public void hapusMobil(int index) {
        if (index >= 0 && index < jumlahMobil) {
            for (int i = index; i < jumlahMobil - 1; i++) {
                daftarMobil[i] = daftarMobil[i + 1]; // Geser ke kiri
            }
            daftarMobil[--jumlahMobil] = null;       // Kurangi jumlah & hapus terakhir
            System.out.println("Mobil berhasil dihapus.");
        } else {
            System.out.println("Index tidak valid."); // Error Handling
        }
    }

    // Method: Simulasi penyimpanan ke file (bukan database)
    public void simpanData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data_mobil.txt"))) {
            for (int i = 0; i < jumlahMobil; i++) {
                Mobil m = daftarMobil[i];
                writer.write("Mobil ke-" + (i + 1)); writer.newLine();
                writer.write("Model: " + m.getModel()); writer.newLine();
                writer.write("Merk: " + m.getMerk()); writer.newLine();
                writer.write("Tahun: " + m.getTahun()); writer.newLine();
                writer.write("Harga: " + m.getHargaFormatRupiah()); writer.newLine();
                writer.write("Transmisi: " + m.getTransmisi()); writer.newLine();
                writer.write("Plat: " + m.getPlatDaerah()); writer.newLine();
                writer.write("Tahun Plat: " + m.getTahunPlat()); writer.newLine();
                writer.write("Pajak: " + m.getBulanPajak() + " " + m.getTahunPajak()); writer.newLine();
                writer.write("Biaya Pajak: Rp" + String.format("%,.0f", m.getBiayaPajak())); writer.newLine();

                if (m instanceof MobilListrik) {
                    writer.write("Jenis: Mobil Listrik"); writer.newLine();
                    writer.write("Kapasitas Baterai: " + ((MobilListrik) m).getKapasitasBaterai() + " kWh"); writer.newLine();
                } else {
                    writer.write("Jenis: Mobil Biasa"); writer.newLine();
                    writer.write("Bahan Bakar: " + m.getJenisBahanBakar()); writer.newLine();
                }

                writer.write("====================================="); writer.newLine();
            }

            System.out.println("Data berhasil disimpan ke file 'data_mobil.txt'");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data: " + e.getMessage()); // Error Handling
        }
    }

    // Accessor: Mengambil objek mobil berdasarkan index
    public Mobil getMobil(int index) {
        if (index >= 0 && index < jumlahMobil) {
            return daftarMobil[index]; // Mengembalikan objek
        }
        return null; // Jika invalid
    }

    // Accessor: Mendapatkan jumlah total mobil
    public int getJumlahMobil() {
        return jumlahMobil;
    }
}
