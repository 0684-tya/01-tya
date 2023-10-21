import java.util.Scanner;

class Salon {
    String nama;
    String noTelepon;
    Perawatan perawatan = new Perawatan();
    Sewa sewa = new Sewa();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Salon salon = new Salon();

        char pilihan2;
        do {
            System.out.println("Selamat datang di Salon!");
            System.out.println("Masukkan nama Anda: ");
            salon.nama = input.nextLine();
            System.out.print("Masukkan nomor telepon Anda: ");
            salon.noTelepon = input.nextLine();
            System.out.print("Lakukan Transaksi: (Y/T): ");
            pilihan2 = input.next().charAt(0);

            if (pilihan2 == 'T' || pilihan2 == 't') {
                input.nextLine(); // Membuang karakter newline yang tersisa
                continue; // Kembali ke awal loop untuk mengisi nama dan nomor telepon kembali
            }

            char pilihanMenu;
            do {
                System.out.println("Pilihan Menu (Ketik 1/2)");
                System.out.println("1. Perawatan");
                System.out.println("2. Penyewaan");
                System.out.print("Pilih menu: ");
                int menu = input.nextInt();

                if (menu == 1) {
                    salon.menuPerawatan(input);
                } else if (menu == 2) {
                    salon.menuSewa(input);
                } else {
                    System.out.println("Pilihan tidak valid.");
                }

                System.out.print("Ingin melakukan pilihan lain? (Y/T): ");
                pilihanMenu = input.next().charAt(0);
            } while (pilihanMenu == 'Y' || pilihanMenu == 'y');

            int totalHarga = salon.perawatan.hitungHargaPerawatan() + salon.sewa.hitungHargaSewa();

            System.out.println("Terima kasih, " + salon.nama + "!");
            System.out.println("Total yang harus dibayar: " + totalHarga);
        } while (pilihan2 == 'Y' || pilihan2 == 'y');
        
        input.close();
    }

    public void menuPerawatan(Scanner input) {
        System.out.println("Jenis Perawatan");
        System.out.println("1. Fasial Wajah");
        System.out.println("2. Masker");
        System.out.println("3. Potong Rambut");
        System.out.print("Pilihan Anda : ");
        int jenisPerawatan = input.nextInt();

        if (jenisPerawatan == 1) {
            System.out.println("1. Fasial Biasa (Rp 50,000)");
            System.out.println("2. Fasial Emas (Rp 100,000)");
            System.out.print("Pilih jenis Fasial Wajah (1/2): ");
            int pilihan = input.nextInt();
            perawatan.setHargaPerawatan(pilihan == 1 ? 50000 : 100000);
        } else if (jenisPerawatan == 2) {
            System.out.println("1. Masker Buat (Rp 40,000)");
            System.out.println("2. Masker Lumpur (Rp 75,000)");
            System.out.print("Pilih jenis Masker (1/2): ");
            int pilihan = input.nextInt();
            perawatan.setHargaPerawatan(pilihan == 1 ? 40000 : 75000);
        } else if (jenisPerawatan == 3) {
            System.out.println("1. Potong Rambut Tidak Keramas (Rp 20,000)");
            System.out.println("2. Potong Rambut Keramas (Rp 35,000)");
            System.out.print("Pilih jenis Potong Rambut (1/2): ");
            int pilihan = input.nextInt();
            perawatan.setHargaPerawatan(pilihan == 1 ? 20000 : 35000);
        }

        System.out.print("Jumlah orang: ");
        perawatan.setJumlahOrang(input.nextInt());
    }
   

    public void menuSewa(Scanner input) {
        System.out.println("Jenis Penyewaan");
        System.out.println("1. Rias Wajah");
        System.out.println("2. Baju Pengantin");
        System.out.println("3. Aksesoris");
        System.out.print("Pilih jenis penyewaan (1/2/3): ");
        int jenisSewa = input.nextInt();

        if (jenisSewa == 1) {
            System.out.println("1. Rias Wajah Biasa (Rp 100,000)");
            System.out.println("2. Rias Wajah Artis (Rp 250,000)");
            System.out.print("Pilih jenis Rias Wajah (1/2): ");
            int pilihan = input.nextInt();
            sewa.setHargaSewa(pilihan == 1 ? 100000 : 250000);
        } else if (jenisSewa == 2) {
            System.out.println("1. Baju Pengantin Adat (Rp 150,000)");
            System.out.println("2. Baju Pengantin Internasional (Rp 350,000)");
            System.out.print("Pilih jenis Baju Pengantin (1/2): ");
            int pilihan = input.nextInt();
            sewa.setHargaSewa(pilihan == 1 ? 150000 : 350000);
        } else if (jenisSewa == 3) {
            System.out.println("1. Aksesoris Anak (Rp 20,000)");
            System.out.println("2. Aksesoris Dewasa (Rp 50,000)");
            System.out.print("Pilih jenis Aksesoris (1/2): ");
            int pilihan = input.nextInt();
            sewa.setHargaSewa(pilihan == 1 ? 20000 : 50000);
        }

        System.out.print("Jumlah jam sewa: ");
        sewa.setJumlahJamSewa(input.nextInt());
    }
}
