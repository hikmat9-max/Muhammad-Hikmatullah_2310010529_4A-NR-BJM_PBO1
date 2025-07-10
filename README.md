
# Proyek Akhir Pemrograman Berbasis Objek 1 - Showroom Mobil

Proyek ini adalah contoh aplikasi pengolahan data showroom mobil menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini dirancang untuk mengelola data mobil di sebuah showroom, termasuk mobil biasa dan mobil listrik. Pengguna dapat menambah, mengedit, mencari, menghapus mobil, dan menyimpan data ke dalam file. Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Fitur Utama

1. **Tambah Mobil Biasa**: Menambahkan mobil biasa ke dalam showroom.
2. **Tambah Mobil Listrik**: Menambahkan mobil listrik dengan kapasitas baterai.
3. **Tampilkan Semua Mobil**: Menampilkan semua mobil yang tersedia di showroom.
4. **Cari Mobil**: Mencari mobil berdasarkan model.
5. **Edit Mobil**: Mengedit data mobil yang sudah ada.
6. **Hapus Mobil**: Menghapus mobil dari showroom.
7. **Simpan Data**: Menyimpan data mobil ke dalam file `data_mobil.txt`.
8. **Keluar**: Keluar dari aplikasi.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Mobil`, `MobilListrik`, dan `Showroom` adalah contoh dari class.

```java
public class Mobil {
    // Kode untuk class Mobil
}

public class MobilListrik extends Mobil {
    // Kode untuk class MobilListrik
}

public class Showroom {
    // Kode untuk class Showroom
}
```

2. **Object** adalah instance dari class. Pada kode ini, `mobilBiasa = new Mobil(...)` dan `mobilListrik = new MobilListrik(...)` adalah contoh pembuatan object.

```java
Mobil mobilBiasa = new Mobil(model, merk, tahun, harga, ...);
MobilListrik mobilListrik = new MobilListrik(modelL, merkL, tahunL, hargaL, ...);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `model`, `merk`, dan `tahun` adalah contoh atribut dalam class `Mobil`.

```java
private final String model; // Final: tidak bisa diubah
private String merk;
private int tahun;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mobil` dan `MobilListrik`.

```java
public Mobil(String model, String merk, int tahun, double harga, ...) {
    // Constructor untuk class Mobil
}

public MobilListrik(String model, String merk, int tahun, double harga, ...) {
    super(model, merk, tahun, harga, ...); // Constructor chaining ke class Mobil
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMerk`, `setTahun`, dan `setHarga` adalah contoh method mutator.

```java
public void setMerk(String merk) { this.merk = merk; }
public void setTahun(int tahun) { this.tahun = tahun; }
public void setHarga(double harga) { this.harga = harga; }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getModel`, `getMerk`, `getTahun`, dan `getHarga` adalah contoh method accessor.

```java
public String getModel() { return model; }
public String getMerk() { return merk; }
public int getTahun() { return tahun; }
public double getHarga() { return harga; }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `model`, `merk`, dan `tahun` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```java
private final String model; // private: tidak bisa diakses langsung
private String merk;
private int tahun;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MobilListrik` mewarisi `Mobil` dengan sintaks `extends`.

```java
public class MobilListrik extends Mobil { ... }
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Pada kode ini, method `tambahMobilObjek` menerima objek bertipe `Mobil`, yang bisa berupa `Mobil` biasa atau `MobilListrik`.

```java
public void tambahMobilObjek(Mobil m) { ... }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `cariMobil` untuk mencari mobil berdasarkan model.

```java
if (mobil.getModel().equalsIgnoreCase(modelCari)) { ... }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk menampilkan seluruh mobil yang ada di showroom.

```java
for (int i = 0; i < jumlahMobil; i++) { ... }
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan `System.out.println` untuk menampilkan output.

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan model mobil: ");
String model = scanner.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Mobil[] daftarMobil = new Mobil[kapasitas];` adalah contoh penggunaan array untuk menyimpan objek mobil.

```java
Mobil[] daftarMobil = new Mobil[10]; // Array untuk 10 mobil
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error saat menyimpan data ke dalam file.

```java
try {
    // code that might throw an exception
} catch (IOException e) {
    System.out.println("Gagal menyimpan data: " + e.getMessage());
}
```

## Usulan Nilai

| No  | Materi           | Nilai |
| --- | ---------------- | ----- |
|  1  | Class            |   6   |
|  2  | Object           |   6   |
|  3  | Atribut          |   6   |
|  4  | Constructor      |   6   |
|  5  | Mutator          |   6   |
|  6  | Accessor         |   6   |
|  7  | Encapsulation    |   7   |
|  8  | Inheritance      |   5   |
|  9  | Polymorphism     |   9   |
| 10  | Seleksi          |   5   |
| 11  | Perulangan       |   5   |
| 12  | IO Sederhana     |   8   |
| 13  | Array            |   6   |
| 14  | Error Handling   |   8   |
|     | **TOTAL**        | **100** |

## Pembuat

Nama: Muhammad Hikmatullah  
NPM: 2310010529  
Kelas: 4A Non Reg Banjarmasin  

