class KeretaApiLokal extends KeretaApi implements TiketInterface {
    public KeretaApiLokal(String nomorKereta, String jenisKereta, String rute) {
        super(nomorKereta, jenisKereta, rute);
    }

    @Override
    public String getJadwal() {
        return "Jadwal Kereta Api Lokal";
    }

    @Override
    public String getKodeTiket() {
        return "KRL" + nomorKereta;
    }

    @Override
    public double getHarga() {
        return 50000;
    }

    @Override
    public String getTujuan() {
        return "Yogyakarta - Solo";
    }

    @Override
    public String getTanggal() {
        return "2023-12-26";
    }

    @Override
    public String getKelas() {
        return "Bisnis";
    }
}
