abstract class KeretaApi {
    String nomorKereta;
    String jenisKereta;
    String rute;

    public KeretaApi(String nomorKereta, String jenisKereta, String rute) {
        this.nomorKereta = nomorKereta;
        this.jenisKereta = jenisKereta;
        this.rute = rute;
    }

    abstract String getJadwal();
}
