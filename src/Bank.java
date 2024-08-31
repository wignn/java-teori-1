class Bank {
    int Saldo;

    public Bank(int Saldo) {
        this.Saldo = Saldo;
        System.out.println("selamat datang");
        GetSaldo();
    }
    public void GetSaldo() {
        System.out.println("Saldo saat ini: RP." + Saldo + "\n");
    }
    void simpanUang(int Simpan) {
        this.Saldo += Simpan;
        System.out.println("Simpan uang: RP." + Simpan);
        GetSaldo();
    }
    void ambilUang(int Ambil) {
        this.Saldo -= Ambil;
        System.out.println("Ambil uang: RP." + Saldo);
        GetSaldo();
    }
}
