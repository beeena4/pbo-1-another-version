public class main {
    public static void main(String[] args) {
        // Membuat objek FoodItem
        ListBunga ListBunga = new ListBunga("CalaLily", 5000, 2, 0.1, "FreshFlower");
       
        // Menampilkan informasi item makanan
        ListBunga.displayInfo();
        System.out.println("----------------------------------------");

        // Mengubah nilai menggunakan setter
        ListBunga.kategori = "baru";
        ListBunga.nama = "ganti nama";

        ListBunga.setNama("CalaLily");

        ListBunga.setHarga(5000);
        ListBunga.setJumlahBunga(2);
        ListBunga.setDiskon(0.15);
        ListBunga.setKategori("FreshFlower");

        // Menampilkan informasi item makanan setelah perubahan
        ListBunga.displayInfo();
        System.out.println("----------------------------------------");

        // Mencoba mengatur harga yang tidak valid
        ListBunga.setHarga(-5000);
        System.out.println("----------------------------------------");

        // Mencoba mengatur jumlah yang tidak valid
        ListBunga.setJumlahBunga(-2);
        System.out.println("----------------------------------------");

        // Mencoba mengatur diskon yang tidak valid
        ListBunga.setDiskon(1.2);
        System.out.println("----------------------------------------");

        // Menampilkan informasi item makanan setelah mencoba mengatur nilai yang tidak valid
        ListBunga.setHarga(-9989);
        ListBunga.displayInfo();

    }
}