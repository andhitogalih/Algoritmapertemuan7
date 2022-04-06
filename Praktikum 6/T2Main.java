import java.util.Scanner;

public class T2Main {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            Scanner s1 = new Scanner(System.in);
            
            Tu2 data = new Tu2();
            System.out.print("Masukkan jumlah Mahasiswa: ");
            int jumMhs = s.nextInt();
            T2[] mhs = new T2[jumMhs];
            data.listMhs = mhs;
    
            System.out.println("-------------------------------------------");
            System.out.println("Masukkan data mahasiswa secara urut dari Nim Terkecil");
            for(int i=0; i<jumMhs; i++){
                System.out.println("-------------------------------------------");
                System.out.print("Nim\t : ");
                int nim = s.nextInt();
                System.out.print("Nama\t : ");
                String nama = s1.nextLine();
                System.out.print("Umur\t : ");
                int umur = s.nextInt();
                System.out.print("IPK\t : ");
                double ipk = s.nextDouble();
                
                T2 m = new T2(nim, nama, umur, ipk);
                data.tambah(m);
            }    
                System.out.println("-------------------------------------------");
                System.out.println("Data keseluruhan Mahasiswa : ");
                data.tampil();
    
                System.out.println("-------------------------------------------");
                System.out.println("-------------------------------------------");
                System.out.println("Pencarian data : ");
                System.out.println("Masukkan Nama Mahasiswa yang dicari : ");
                System.out.print("Nama : ");
                String cari = s1.nextLine();
                System.out.println("\n\nMenggunakan sequential search ");
                data.FindSequentialSearch(data.listMhs, cari);
            }
    }

