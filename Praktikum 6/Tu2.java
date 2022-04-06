public class Tu2 {
        T2 listMhs[];
        int idx;
        
        void tambah(T2 m){
            if(idx < listMhs.length){
                listMhs[idx] = m;
                idx++;
            }else{
                System.out.println("Data sudah penuh !!");
            }
        }
        
        void tampil(){
            for(T2 m : listMhs){
                m.tampil();
                System.out.println("-------------------------------------------");
            }
        }
        
        public int FindSeqSearch(int cari){
            int posisi = -1;
            for(int j=0; j<listMhs.length; j++){
                if(listMhs[j].nim == cari){
                    posisi = j;
                    break;
                }
            }
            return posisi;
        }
        
        public int FindSequentialSearch(T2 listMHS[], String cari){
            int posisi = -1;
            for(int i=0; i<listMHS.length; i++){
                if(cari.equalsIgnoreCase(listMHS[i].nama)){
                    posisi = i;
                    TampilPosisi(cari, posisi);
                    TampilData(cari, posisi);
                }
            }
            return posisi;
        }
    
        public void TampilPosisi(String x, int pos){
            if(pos != -1){
                System.out.println("data\t : "+ x + " ditemukan pada indeks "+pos+"\n");
            }else{
                System.out.println("data\t : "+ x + "tidak ditemukan");
            }
        }
        
        public void TampilData(String x, int pos){
            if(pos != -1){
                System.out.println("Nim\t : "+listMhs[pos].nim);
                System.out.println("Nama\t : "+x);
                System.out.println("Umur\t : "+listMhs[pos].umur);
                System.out.println("IPK\t : "+listMhs[pos].ipk);
            }else{
                System.out.println("data "+x+"tidak ditemukan");
            }
        }
    }

