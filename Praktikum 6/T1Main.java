import java.util.Scanner;
public class T1Main {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            Scanner s1 = new Scanner(System.in);
            
            Tu1 data = new Tu1();
            int jumMhs = 5;
            
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
                Double ipk = s.nextDouble();
                
                T1 m = new T1(nim, nama, umur, ipk);
                data.tambah(m);
            }    
                System.out.println("-------------------------------------------");
                System.out.println("Data keseluruhan Mahasiswa sebelum sorting");
                data.tampil();
                
                System.out.println("Data keseluruhan Mahasiswa setelah sorting");
                data.bubbleSort();
                data.tampil();
    
                System.out.println("-------------------------------------------");
                System.out.println("-------------------------------------------");
                System.out.println("Pencarian data : ");
                System.out.println("Masukkan Nim Mahasiswa yang dicari : ");
                System.out.print("NIM : ");
                int cari = s.nextInt();
                System.out.println("menggunakan sequential search : ");
                int posisi = data.FindSeqSearch(cari);
                
                data.TampilPosisi(cari, posisi);
                data.TampilData(cari, posisi);
    
                // Binary Search
                System.out.println("===========================================");
                System.out.println("menggunakan binary search");
                posisi = data.FindBinarySearch(cari, 0, jumMhs-1);
                data.TampilPosisi(cari, posisi);
                data.TampilData(cari, posisi);
            }
    }
