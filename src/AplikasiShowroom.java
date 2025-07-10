import java.util.Scanner;

// Class: AplikasiShowroom
// Konsep OOP: Class, Object, Method, Constructor, Array, Inheritance, Polymorphism, IO Sederhana, Seleksi, Perulangan, Error Handling
public class AplikasiShowroom {

    public static void main(String[] args) {

        // Object: Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Object: showroom dengan kapasitas maksimum 10 mobil
        Showroom showroom = new Showroom(10);

        // Perulangan: menu utama berulang hingga pengguna keluar
        while (true) {
            // Tampilan menu
            System.out.println("\n=== Sistem Manajemen Showroom ===");
            System.out.println("1. Tambah Mobil Biasa");
            System.out.println("2. Tambah Mobil Listrik");
            System.out.println("3. Tampilkan Semua Mobil");
            System.out.println("4. Cari Mobil");
            System.out.println("5. Edit Mobil");
            System.out.println("6. Hapus Mobil");
            System.out.println("7. Simpan Data (ke TXT)");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // flush newline

            // Seleksi: aksi berdasarkan pilihan menu
            switch (pilihan) {

                case 1: // Tambah Mobil Biasa
                    System.out.println(">> Tambah Mobil Biasa");
                    System.out.print("Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Merk: ");
                    String merk = scanner.nextLine();
                    System.out.print("Tahun: ");
                    int tahun = scanner.nextInt();
                    System.out.print("Harga: ");
                    double harga = scanner.nextDouble();
                    scanner.nextLine(); // flush newline
                    System.out.print("Jenis Bahan Bakar: ");
                    String bbm = scanner.nextLine();
                    System.out.print("Transmisi: ");
                    String transmisi = scanner.nextLine();
                    System.out.print("Plat Daerah: ");
                    String plat = scanner.nextLine();
                    System.out.print("Tahun Pajak: ");
                    int tahunPajak = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Bulan Pajak: ");
                    String bulanPajak = scanner.nextLine();
                    System.out.print("Tahun Plat: ");
                    int tahunPlat = scanner.nextInt();
                    System.out.print("Biaya Pajak Tahunan: ");
                    double biayaPajak = scanner.nextDouble();

                    // Object: instansiasi mobil biasa (superclass)
                    Mobil mobilBiasa = new Mobil(model, merk, tahun, harga, transmisi, bbm, plat, tahunPlat, bulanPajak, tahunPajak, biayaPajak);

                    // Polymorphism: parameter bertipe Mobil
                    showroom.tambahMobilObjek(mobilBiasa);
                    break;

                case 2: // Tambah Mobil Listrik
                    System.out.println(">> Tambah Mobil Listrik");
                    System.out.print("Model: ");
                    String modelL = scanner.nextLine();
                    System.out.print("Merk: ");
                    String merkL = scanner.nextLine();
                    System.out.print("Tahun: ");
                    int tahunL = scanner.nextInt();
                    System.out.print("Harga: ");
                    double hargaL = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Plat Daerah: ");
                    String platL = scanner.nextLine();
                    System.out.print("Tahun Pajak: ");
                    int tahunPajakL = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Bulan Pajak: ");
                    String bulanPajakL = scanner.nextLine();
                    System.out.print("Tahun Plat: ");
                    int tahunPlatL = scanner.nextInt();
                    System.out.print("Biaya Pajak Tahunan: ");
                    double biayaPajakL = scanner.nextDouble();
                    System.out.print("Kapasitas Baterai (kWh): ");
                    double kapasitas = scanner.nextDouble();

                    // Object: instansiasi mobil listrik (subclass)
                    Mobil mobilListrik = new MobilListrik(modelL, merkL, tahunL, hargaL, platL, tahunPlatL, bulanPajakL, tahunPajakL, biayaPajakL, kapasitas);
                    showroom.tambahMobilObjek(mobilListrik);
                    break;

                case 3: // Tampilkan semua mobil
                    showroom.tampilkanMobil();
                    break;

                case 4: // Cari mobil berdasarkan model
                    System.out.print("Model yang dicari: ");
                    String cari = scanner.nextLine();
                    showroom.cariMobil(cari);
                    break;

                case 5: // Edit mobil
                    System.out.print("Masukkan index mobil yang ingin diedit: ");
                    int idxEdit = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println(">> Masukkan data baru");
                    System.out.print("Model: ");
                    String mdlEdit = scanner.nextLine();
                    System.out.print("Merk: ");
                    String merkEdit = scanner.nextLine();
                    System.out.print("Tahun: ");
                    int tahunEdit = scanner.nextInt();
                    System.out.print("Harga: ");
                    double hargaEdit = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Transmisi: ");
                    String transmisiEdit = scanner.nextLine();
                    System.out.print("Jenis BBM: ");
                    String bbmEdit = scanner.nextLine();
                    System.out.print("Plat Daerah: ");
                    String platEdit = scanner.nextLine();
                    System.out.print("Tahun Pajak: ");
                    int tahunPajakEdit = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Bulan Pajak: ");
                    String bulanPajakEdit = scanner.nextLine();
                    System.out.print("Tahun Plat: ");
                    int tahunPlatEdit = scanner.nextInt();
                    System.out.print("Biaya Pajak: ");
                    double biayaPajakEdit = scanner.nextDouble();

                    // Object: mobil baru hasil edit
                    Mobil mobilEdit = new Mobil(mdlEdit, merkEdit, tahunEdit, hargaEdit, transmisiEdit, bbmEdit,
                            platEdit, tahunPlatEdit, bulanPajakEdit, tahunPajakEdit, biayaPajakEdit);

                    showroom.editMobil(idxEdit, mobilEdit);
                    break;

                case 6: // Hapus mobil
                    System.out.print("Masukkan index mobil yang ingin dihapus: ");
                    int idxHapus = scanner.nextInt();
                    showroom.hapusMobil(idxHapus);
                    break;

                case 7: // Simpan data ke file
                    showroom.simpanData();
                    break;

                case 8: // Keluar
                    System.out.println("Terima kasih telah menggunakan sistem showroom!");
                    return;

                default: // Penanganan pilihan tidak valid
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
