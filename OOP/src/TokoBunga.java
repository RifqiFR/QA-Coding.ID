import java.util.ArrayList;


public class TokoBunga {
    private String nama;
    private String lokasi;
    private ArrayList<String> arrCabang;

    public TokoBunga(String nama, String lokasi) {

        //lengkapi code
        this.nama = nama;
        this.lokasi = lokasi;
        this.arrCabang = new ArrayList<String>();
    }

    public String getNama() {
        return this.nama;
    }

    public String getLokasi() {
        return this.lokasi;
    }

    public void setNama(String value) {
        //lengkapi code
        this.nama = value;
    }

    public void addArrCabang(String newCabang) {
        //lengkapi code
        this.arrCabang.add(newCabang);
    }

    public void getinfo() {
        //lengkapi code
        System.out.println(this.nama+" Merupakan toko yang berada di "+ this.lokasi + "\n" + " yang memiliki "+ arrCabang.size() + " Cabang, dengan nama:");

        for(String item : arrCabang){
            System.out.println("* " + item);
        }
    }
    public static void main(String[] args) {
        //Write your code here
        TokoBunga objStore = new TokoBunga("toko Bunga", "bandung");
        objStore.addArrCabang("cabang satu");
        objStore.addArrCabang("cabang dua");
        objStore.getinfo();
    }
}
