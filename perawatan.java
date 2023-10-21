class Perawatan {
    int hargaPerawatan;
    int jumlahOrang;

    public int hitungHargaPerawatan() {
        return hargaPerawatan * jumlahOrang;
    }

    public int setHargaPerawatan(int hargaPerawatan) {
    this.hargaPerawatan = hargaPerawatan;
    return this.hargaPerawatan; 
    }

    public int setJumlahOrang(int jumlahOrang) {
    this.jumlahOrang = jumlahOrang;
    return this.jumlahOrang;
    }
}
