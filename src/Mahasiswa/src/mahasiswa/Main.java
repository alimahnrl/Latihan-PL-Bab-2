package mahasiswa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int jumlah_mahasiswa, panjang, lebar;
        String nama, nim;
        int jumlah_putaran, jumlah_waktu;
        
            System.out.print("Masukkan jumlah mahasiswa= ");
            jumlah_mahasiswa = in.nextInt();
            Mahasiswa[] mhs = new Mahasiswa[jumlah_mahasiswa];
            System.out.print("panjang lapangan= ");
            panjang = in.nextInt();
            Lapangan[] lap = new Lapangan[jumlah_mahasiswa];
            System.out.print("lebar lapangan= ");
            lebar = in.nextInt();
            
            for (int i=0; i<jumlah_mahasiswa; i++){
                mhs[i]= new Mahasiswa();
                lap[i] = new Lapangan();
                System.out.print("Masukkan NIM: ");
                nim = in.next();
                System.out.print("Masukkan Nama: ");
                nama = in.next();
                System.out.print("Masukkan jumlah putaran: ");
                jumlah_putaran = in.nextInt();
                System.out.print("Masukkan jumlah waktu: ");
                jumlah_waktu = in.nextInt();
                
           mhs[i].nama(nama);
           mhs[i].nim(nim);
           lap[i].jumlahPutaran(jumlah_putaran);
           lap[i].jumlah_waktu(jumlah_waktu);
            }
            for (int i=0; i<jumlah_mahasiswa; i++){
                System.out.println("Nama: "+mhs[i].getNama());
                System.out.println("Jarak: "+lap[i].getJarak(panjang, lebar));
            }
            double max = 0;
            int terbesar=0;
            String namakuganteng="";
            for (int i=1; i<jumlah_mahasiswa;i++){
                if (lap[i].jarakku() >max){
                    max=lap[i].jarakku();
                    terbesar=i;
                }
            }
            
            
            System.out.println("max "+mhs[terbesar].getNama());
        }
    }
    