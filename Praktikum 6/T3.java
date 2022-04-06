public class T3 {
    public int[] data;
    public int maks = 0;
    public int posisi;
    public int jml = 0;

    T3(int nilai[]){
        data = nilai;
    }

    void tampil(){
        for(int i=0; i<data.length; i++){
            System.out.println(data[i] + " ");
            System.out.println();
        }
    }

    void bubbleSort(){
        for(int i=0; i<data.length-1; i++){
            for(int j=1; j<data.length; j++){
                if(data[j]> data[j-1]){
                    int temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
    }

    public int binarySearch(int cari, int left, int right){
        int middle;
        if(right >= left){
            middle = (left+right)/2;
            if(cari == data[middle]){
                return (middle);
            }else if(data[middle] > cari){
                return binarySearch(cari, middle+1, right);
            }else{
                return binarySearch(cari, left, middle-1);
            }
        }
        return -1;
    }

    public int nilaiTerbesar(){
        for(int i=0; i<data.length; i++){
            if(data[i] > maks){
                maks = data[i];
            }
        }
        System.out.println("Nilai yang paling besar adalah : "+maks);
        return maks;
    }

    public void tampilPosisi(int pos){
        for(int i=0; i<data.length; i++){
            if(data[i] == maks){
                jml++;
            }
        }
        System.out.print("dengan jumlah "+ jml);
        System.out.println();
        posisi = maks;

        for(int i=0; i<data.length; i++){
            if(posisi == data[i]){
                pos = i;
                System.out.println("Data ditemukan pada indeks ke-"+pos);
            }
        }
    }
}

