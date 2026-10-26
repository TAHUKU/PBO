class mobil {
    String warna;
    String bel;
    int tahunProduksi;
}

public class mobilSaya{
    public static void main(String[] args) {
        mobil mobilku = new mobil();

        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 1998;
        mobilku.bel = "tin tin";

        System.out.println("Mobilku berwarna " + mobilku.warna + " dan mobilku keluar pada tahun " + mobilku.tahunProduksi + " untuk belnya berbunyi " + mobilku.bel);
    }
}