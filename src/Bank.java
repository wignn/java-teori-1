class Bank {
    int Saldo;

    public Bank(int Saldo) {
        this.Saldo = Saldo;
        System.out.println("selamat datang");
    }
    public void tampilkanSaldo() {
        System.out.println("Saldo saat ini: " + Saldo + "\n");
    }
    void simpanUang(int Simpan) {
        this.Saldo += Simpan;
        System.out.println("Simpan uang: " + Simpan);
        tampilkanSaldo();
    }
    void ambilUang(int Ambil) {
        this.Saldo -= Ambil;
        System.out.println("Ambil uang: " + Saldo);
        tampilkanSaldo();
    }
}
