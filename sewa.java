class Sewa {
    int hargaSewa;
    int jumlahJamSewa;

    public int hitungHargaSewa() {
        return hargaSewa * jumlahJamSewa;
    }

    public int setHargaSewa(int hargaSewa) {
    this.hargaSewa = hargaSewa;
    return this.hargaSewa;
    }

    public int setJumlahJamSewa(int jumlahJamSewa) {
    this.jumlahJamSewa = jumlahJamSewa;
    return this.jumlahJamSewa;
    }
}
