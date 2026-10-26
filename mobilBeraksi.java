class mobil {
    String warna;
    int tahunProduksi;
}

public class mobilBeraksi{
    public static void main(String[] args) {
        mobil mobilku = new mobil();

        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 1998;

        System.out.println("Mobilku berwarna " + mobilku.warna + " dan mobilku keluar pada tahun " + mobilku.tahunProduksi);
    }
}