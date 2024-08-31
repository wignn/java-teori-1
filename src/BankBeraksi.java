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

public class Main {
    public static void main(String[] args) {
        Bank rekening = new Bank(100000);
        rekening.tampilkanSaldo();
        rekening.simpanUang(500000);
        rekening.ambilUang(150000);
    }
}
