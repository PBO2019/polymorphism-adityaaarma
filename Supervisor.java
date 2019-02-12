public class Supervisor extends Pegawai {
    private int tarif;
    private int hasil;

    public Supervisor() {
        this.tarifGaji(30);
        System.out.println("Gaji Supervisor adalah");
    }

    public void tarifGaji(int tarif){
        hasil = tarif * 30;
        System.out.println(hasil);
    }
}
