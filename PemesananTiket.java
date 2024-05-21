public class PemesananTiket {
	public static void main(String[] args) {
        KeretaApiCepat keretaCepat = new KeretaApiCepat("123", "Argo Wilis", "Jakarta - Surabaya");
        KeretaApiLokal keretaLokal = new KeretaApiLokal("456", "Prambanan Ekspres", "Yogyakarta - Solo");

        System.out.println("=== Kereta Api Cepat ===");
        System.out.println("Nomor Kereta: " + keretaCepat.nomorKereta);
        System.out.println("Jenis Kereta: " + keretaCepat.jenisKereta);
        System.out.println("Rute: " + keretaCepat.rute);
        System.out.println("Jadwal: " + keretaCepat.getJadwal());

        System.out.println("n=== Kereta Api Lokal ===");
        System.out.println("Nomor Kereta: " + keretaLokal.nomorKereta);
        System.out.println("Jenis Kereta: " + keretaLokal.jenisKereta);
        System.out.println("Rute: " + keretaLokal.rute);
        System.out.println("Jadwal: " + keretaLokal.getJadwal());

        System.out.println("n=== Pemesanan Tiket ===");
        // Menampilkan menu pemesanan tiket
        // Meminta input dari user
        // Memproses pemesanan tiket
    }
}
