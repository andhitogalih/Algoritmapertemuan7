public class T3Main {
    public static void main(String[] args) {
        int angka[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};

        T3 arr = new T3(angka);

        int sum = 10, maks=0;
        System.out.println("=========================================");
        System.out.println("                TAMPILAN DATA            ");
        System.out.println("=========================================");
        System.out.println("Sebelum di sorting");
        arr.tampil();
        arr.bubbleSort();
        System.out.println("=========================================");
        System.out.println("Setelah di sorting");
        arr.tampil();
        arr.nilaiTerbesar();
        arr.binarySearch(maks, 0, sum-1);
        arr.tampilPosisi(maks);
    }
}

