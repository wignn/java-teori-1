
public class BankBeraksi {
    public static void main(String[] args) {
        Bank rekening = new Bank(100000);
        rekening.simpanUang(500000);
        rekening.ambilUang(150000);
    }
}
