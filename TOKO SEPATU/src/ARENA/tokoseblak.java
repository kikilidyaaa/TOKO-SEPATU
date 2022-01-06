package ARENA;
import java.util.Scanner;
public class tokoseblak {
    public static void main(String[] args) {
        //Saya mengubah beberapa VARIABEL (jenis,level,porsi, harga=0. harga1=0) menjadi ARRAY.
        //Saya menambahkan VARIABEL (bayar,jum=0,i=0) dan mengubah total=0 menjadi total_pembelian=0.
        //Deklarasi Variabel
        int bayar, jum=0, i=0;
        int total_pembelian=0;
        String pengulangan;
        
        //Berikut yang dibawah ini yang awalnya VARIABEL diubah menjadi ARRAY.
        //Saya menambahkan ARRAY (sub_total, jenis_seblak, dan level_pedas).
        //Deklarasi Array
        int [] jenis = new int[4];
        int [] level = new int[4];
        int [] porsi = new int[4];
        int [] harga = new int[4];
        int [] harga1 = new int[4];
        double [] sub_total = new double[4];
        String [] jenis_seblak = new String [4];
        String [] level_pedas = new String [4];
        
        Scanner in = new Scanner (System.in);
        System.out.println("========= ANEKA SEBLAK BANDUNG =========");
        System.out.println("|             Jenis Seblak             |");
        System.out.println("|1.  Seblak Ceker               5.000  |");
        System.out.println("|2.  Seblak Macaroni            6.000  |");
        System.out.println("|3.  Seblak Bakso Ikan          7.000  |");
        System.out.println("|4.  Seblak Tahu Sumedang       8.000  |");
        System.out.println("========================================");
        System.out.println("|         Tingkatan Level Pedas        |");
        System.out.println("|1.  Tidak Pedas                    0  |");
        System.out.println("|2.  Pedas Sedang                 500  |");
        System.out.println("|3.  Sangat Pedas               1.000  |");
        System.out.println("|4.  Gila Pedas                 1.500  |");
        System.out.println("========================================");
        
        do{
        //Saya menambahkan MASUKKAN JUMLAH BELI
        System.out.print("MASUKKAN JUMLAH BELI        :   ");
        jum = in.nextInt();
        System.out.println("========================================");
        
        //Menambahkan for untuk melakukan perulangan (jenis seblak, level pedas dan porsi) jika memilih jumlah beli lebih dari 1
        //Memasukan elemen didalam array
        for (i=0; i<jum;i++){
        System.out.print("Masukan Jenis Seblak Ke-"+(i+1)+" : ");
        jenis[i] = in.nextInt();
        System.out.print("Masukan Level Pedas Ke-"+(i+1)+"  : ");
        level[i] = in.nextInt();
        System.out.print("Masukan Porsi Ke-"+(i+1)+"        : ");
        porsi[i] = in.nextInt();
        System.out.println("========================================");
        
        //Menentukan barang berdasarkan kode yang dimmasukan
        switch (jenis[i]){
            case 1:
                jenis_seblak[i] = "Seblak Ceker";
                harga[i] = 5000;
            break;
            case 2:
                jenis_seblak[i] = "Seblak Macaroni";
                harga[i] = 6000;
            break;
            case 3:
                jenis_seblak[i] = "Seblak Bakso Ikan";
                harga[i] = 7000;
            break;
            case 4:
                jenis_seblak[i] = "Seblak Tahu Sumedang";
                harga[i] = 8000;
            break;
            default : 
                System.out.println("Jenis Seblak Tidak Tersedia");
        }
        switch (level[i]){
            case 1:
                level_pedas[i] = "Tidak Pedas";
                harga1[i] = 0;
            break;
            case 2:
                level_pedas[i] = "Pedas Sedang";
                harga1[i] = 500;
            break;
            case 3:
                level_pedas[i] = "Sangat Pedas";
                harga1[i] = 1000;
            break;
            case 4:
                level_pedas[i] = "Gila Pedas";
                harga1[i] = 1500;
                if (harga1[i]>3000){
                    System.out.println("SELAMAT ANDA MENDAPATKAN 1 TEH BOTOL GRATIS DARI PEMBELIAN 2 LEVEL GILA PEDAS");
                }
            break;
            default : 
                System.out.println("Level Pedas Tidak Tersedia");
            }
        }
        
        //Menambahkan keterangan Nama Seblak dan ucapan selamat datang
        System.out.println("----------------------------------------");
        System.out.println("|            SEBLAK BANDUNG            |");
        System.out.println("|            SELAMAT DATANG            |");
        System.out.println("----------------------------------------");

        //Menambahkan for untuk melakukan perulangan yang akan menampilkan pesanan apa saja yang dipesan, jumlah porsi, dan harga dari setiap menu yang dipesan
        //Menampilkan seluruh elemen di dalam array
        for (i=0; i<jum;i++){
        //Menambahkan perhitungan untuk Harga dari tiap menu dan total pembelian dari keseluruhan menu yang diambil
        sub_total[i] = (harga[i]+harga1[i])*porsi[i];
        total_pembelian+= sub_total[i];
        
        System.out.println("Menu Ke- "+(i+1));
        System.out.println("1. Jenis Seblak = "+jenis_seblak[i]);
        System.out.println("2. Level Pedas  = "+level_pedas[i]);
        System.out.println("3. Jumlah Porsi = "+porsi[i]);
        System.out.println("4. Harga        = "+sub_total[i]);
        }
        //Menambahkan keterangan TOTAL YANG HARUS DI BAYAR, UANG YANG HARUS DI BAYAR, KEMBALIAN, DAN TERIMA KASIH
        //Menampilkan Total Bayar
        System.out.println("========================================");
        System.out.println("TOTAL YANG HARUS DI BAYAR = Rp. "+total_pembelian);
        System.out.print("BAYAR                     = Rp. ");
        bayar = in.nextInt();
        System.out.println("KEMBALIAN                 = Rp. "+(bayar - total_pembelian));
        System.out.println("========================================");
        
        System.out.println("              TERIMA KASIH              ");

        System.out.print("Apakah Anda Ingin Mengulangi Kembali (Y/T)   :  ");
        pengulangan = in.next();
        System.out.println("========================================");
        
        }while(pengulangan.equalsIgnoreCase("Y"));
    }
}