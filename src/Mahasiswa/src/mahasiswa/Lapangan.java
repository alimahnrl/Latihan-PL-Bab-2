package mahasiswa;

public class Lapangan {
    
    private int jumlahPutaran, jumlah_waktu, jarakTempuh, keliling_lapangan;
    
    public void jumlahPutaran (int jumlahPutaran){
        this.jumlahPutaran = jumlahPutaran;
    }
    public void jumlah_waktu (int jumlah_waktu){
        this.jumlah_waktu = jumlah_waktu;
    }
    public double getJarak(int panjang, int lebar){
        keliling_lapangan = 2*(panjang+lebar);
        System.out.println(keliling_lapangan+" "+this.jumlahPutaran);
        jarakTempuh = keliling_lapangan*this.jumlahPutaran;
        this.jarakTempuh=jarakTempuh;
        return jarakTempuh;
    }
    public double jarakku(){
        return this.jarakTempuh/this.jumlah_waktu;
    }
    
}
