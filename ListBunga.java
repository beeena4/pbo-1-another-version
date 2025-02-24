public class ListBunga {
    // Variabel private
    String nama;
    private double harga;
    private int jumlahBunga;
    private double totalHarga;

    // Variabel protected
    protected double diskon;

    // Variabel default (tanpa modifier)
    String kategori;
    double hargaDiskon;

    // Constructor
    public ListBunga(String nama, double harga, int jumlahBunga, double diskon, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.jumlahBunga = jumlahBunga;
        this.totalHarga = totalHarga;
        this.diskon = diskon;
        this.kategori = kategori;
        this.hargaDiskon = hargaDiskon;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Invalid harga");
        }
    }
    public int getJumlahBunga() {
        return jumlahBunga;
    }
    public void setJumlahBunga(int jumlahBunga) {
        if (jumlahBunga >= 0) {
            this.jumlahBunga = jumlahBunga;
        } else {
            System.out.println("Invalid jumlahBunga");
        }
    }
    protected double getTotalHarga() {
        double totalHarga = harga * jumlahBunga;
       return totalHarga;
    }
    protected void setTotalHarga(double totalHarga) {
        this.totalHarga = harga*jumlahBunga;
    }
    protected double getDiskon() {
        return diskon;
    }
    protected void setDiskon(double diskon) {
        if (diskon >= 0 && diskon <= 1) {
            this.diskon = diskon;
        } else {
            System.out.println("Invalid discount rate");
        }
    }
    public String getKategori() {
        return kategori;
    }
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    private double hargaDiskon(){
        double totalHarga = harga * jumlahBunga;
        return totalHarga - diskon;
    }

    public void displayInfo() {
        System.out.println("=======================================");
        System.out.println("             INFORMASI BUNGA           ");
        System.out.println("=======================================");
        System.out.println("Nama Bunga          : " + getNama());
        System.out.println("Harga pertangkai    : Rp " + String.format("%,.2f", getHarga()));
        System.out.println("Jumlah              : " + getJumlahBunga());
        System.out.println("Kategori            : " + getKategori());
        System.out.println("Total harga         : " + getTotalHarga());
        System.out.println("Diskon              : " + (getDiskon() * 100) + "%");
        System.out.println("Total Pembayaran    : Rp " + String.format("%,.2f", hargaDiskon()));
    }

    // metode kedua : menghitung diskon berdasarkan jumlah order
    double hitungDiskon(int jumlah) {
        if (jumlah >= 10) {
            return 20; // diskon 20% jika order 10 atau lebih
        } else if (jumlah >= 5) {
          return 10; // diskon 10% jika order 5 atau lebih
        } else {
            return 0; // tidak ada diskon jika kurang dari 5
    }
}
}