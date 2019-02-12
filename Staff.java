public class Staff extends Pegawai {
    protected int tarif;
    protected int hasil;

    public Staff() {
        this.tarifGaji(30);
        System.out.println("Gaji Staff adalah");
    }

    public void tarifGaji(int tarif){
        hasil = tarif * 30;
    }
}
