package mahasiswa;

public class Mahasiswa {
    
        private int jumlah_mahasiswa;
        private double kecepatan;
        private String nim, nama_mahasiswa;
        
        public void nama(String nama){
            nama_mahasiswa = nama; }   
        public void nim(String nim){
            this.nim = nim; }
        public void jumlah (int jumlah){
            jumlah_mahasiswa = jumlah; }
        
        public String getNama(){
        return nama_mahasiswa;
        }
        public void kecepatan(double kec){
         this.kecepatan = kec;
        }
        
        public double ambilKecepatan(){
            return kecepatan;
        }
}