class KeretaApiCepat extends KeretaApi implements TiketInterface {
    public KeretaApiCepat(String nomorKereta, String jenisKereta, String rute) {
        super(nomorKereta, jenisKereta, rute);
    }

    @Override
    public String getJadwal() {
        return "Jadwal Kereta Api Cepat";
    }

    @Override
    public String getKodeTiket() {
        return "KCP" + nomorKereta;
    }

    @Override
    public double getHarga() {
        return 200000;
    }

    @Override
    public String getTujuan() {
        return "Jakarta - Surabaya";
    }

    @Override
    public String getTanggal() {
        return "2023-12-25";
    }

    @Override
    public String getKelas() {
        return "Eksekutif";
    }
}
