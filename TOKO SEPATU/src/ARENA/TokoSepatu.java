package Toko_Sepatu;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class NewClass {
    public static void main(String[] args) {
        login();
    }
    static void login(){
        Scanner login = new Scanner(System.in);
        String data[] = {"kasir","1234"};
        String username, password;
        
        System.out.println("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>");
        System.out.println("                 Login                 ");
        System.out.print(" Username : ");
        username = login.next(); 
        System.out.print(" Password : ");
        password = login.next();
        System.out.println("");
 
        if (username.equals(data[0]) && password.equals(data[1])) {
            System.out.println("           Login Berhasil!!!           ");
            System.out.println("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>");
            System.out.println(" SELAMAT DATANG!! SELAMAT BERBELANJA!! ");
            menu();
        }else if (username.equals(data[0])) {
            System.out.println("  Password Salah! Silahkan coba lagi!  ");
            System.out.println("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>");
            login();
        } else if (password.equals(data[1])) {
            System.out.println("  Username Salah! Silahkan coba lagi!  ");
            System.out.println("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>");
            login();
        } else {
            System.out.println("   Login Salah! Silahkan coba lagi!    ");
            System.out.println("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>");
            login();
        }
    }
    static void menu(){
        Scanner in = new Scanner(System.in);
        int menu;
        
        System.out.println("===========================================================================================");
        System.out.println("Silahkan Pilih Menu di bawah ini!!");
        System.out.println("   [1]. Cek Harga dan Promo Diskon Sepatu");
        System.out.println("   [2]. Pemesanan & Pembayaran");
        System.out.println("   [3]. Keluar");
        System.out.print("Pilih Menu          : ");
        menu = in.nextInt();
        
        switch (menu) {
            case 1:
                daftarSepatu();
            case 2:
                pemesanan();
            case 3:
                System.exit(0);
        }
    }
    static void daftarSepatu(){
        Scanner in = new Scanner(System.in);
        int menu;
        System.out.println("===========================================================================================");
        System.out.println("                               HARGA dan PROMO DISKON SEPATU                               ");
        System.out.println("===========================================================================================");
        System.out.println("|Kode| No |        Jenis Sepatu        |    Warna Sepatu    | Ukuran Sepatu |    Harga    |");
        System.out.println("===========================================================================================");
        System.out.println("|1. Ardiles ( Merk Sepatu )                                                               |");
        System.out.println("| a. |    | Ardiles Aza 6.9            |                    |               | Rp. 599.000 |");
        System.out.println("|    | 1  |                            | Putih              | 42,43,44      |             |");
        System.out.println("|    | 2  |                            | Hitam-Orange       | 43,44,45      |             |");
        System.out.println("| b. |    | Ardiles Frodo              |                    |               | Rp. 194.900 |");
        System.out.println("|    | 1  |                            | Biru-Putih         | 42,43         |             |");
        System.out.println("|    | 2  |                            | Hijau-Putih        | 38            |             |");
        System.out.println("| c. |    | Ardiles Fujitora           |                    |               | Rp. 189.000 |");
        System.out.println("|    | 1  |                            | Hitam              | 43,44         |             |");
        System.out.println("|    | 2  |                            | Hitam-Putih        | 42,44         |             |");
        System.out.println("===========================================================================================");
        System.out.println("2. Eagle ( Merk Sepatu )                                                                   ");
        System.out.println("| a. |    | Eagle Bellagio             |                    |               | Rp. 249.000 |");
        System.out.println("|    | 1  |                            | Hitam-Putih        | 40,42,43      |             |");
        System.out.println("| b. |    | Eagle Monza                |                    |               | Rp. 239.000 |");
        System.out.println("|    | 1  |                            | Hitam-Putih        | 38,40,44      |             |");
        System.out.println("|    | 2  |                            | Biru Tua-Putih     | 37,39,42      |             |");
        System.out.println("|    | 3  |                            | Maroon-Putih       | 39,43         |             |");
        System.out.println("| c. |    | Eagle Revor                |                    |               | Rp. 278.000 |");
        System.out.println("|    | 1  |                            | Hitam              | 40,41         |             |");
        System.out.println("|    | 2  |                            | Hitam-Putih        | 37,38         |             |");
        System.out.println("|    | 3  |                            | Biru Tua-Putih     | 38,39         |             |");
        System.out.println("===========================================================================================");
        System.out.println("3. Johnson ( Merk Sepatu )                                                                 ");
        System.out.println("| a. |    | Johnson Galaxy Pro Lowcut  |                    |               | Rp. 379.800 |");
        System.out.println("|    | 1  |                            | Abu-Merah-Putih    | 42,43,44      |             |");
        System.out.println("===========================================================================================");
        System.out.println("4. Piero ( Merk Sepatu )                                                                   ");
        System.out.println("| a. |    | Piero City Core B          |                    |               | Rp. 329.800 |");
        System.out.println("|    | 1. |                            | Hitam-Putih        | 37,41,42,44   |             |");
        System.out.println("| b. |    | Piero Cruzher              |                    |               | Rp. 429.800 |");
        System.out.println("|    | 1. |                            | Asphalt Black      | 42,43         |             |");
        System.out.println("|    | 2. |                            | Royal Purple       | 39,42         |             |");
        System.out.println("===========================================================================================");
        System.out.println("5. Spotec ( Merk Sepatu )                                                                  ");
        System.out.println("| a. |    | Spotec Alpha               |                    |               | Rp. 250.000 |");
        System.out.println("|    | 1. |                            | Hitam-Biru-Putih   | 41,42         |             |");
        System.out.println("|    | 2. |                            | Hitam-Merah-Putih  | 38,39,43      |             |");
        System.out.println("|    | 3. |                            | Abu-Putih          | 38,41,42      |             |");
        System.out.println("===========================================================================================");
        System.out.println("Promo Diskon :");
        System.out.println("Jika total pembelian lebih dari Rp. 600.000");
        System.out.println("maka akan mendapatkan diskon sebesar 20%");
        System.out.println("===========================================================================================");
        System.out.println("");
        System.out.println("1. Kembali Ke Menu");
        System.out.println("2. Keluar");
        System.out.print("Pilih menu yang anda inginkan [1/2]? ");
        menu = in.nextInt();
        
        if(menu==1){
            menu();        
        }else if (menu==2){
            System.exit(0);
        }
    }
    static void pemesanan(){
        Scanner in = new Scanner(System.in);
        int mS, ws, beli, i=0, jumlah=0;
        double total_pembelian=0, bayar, diskon=0, pajak=0, jum_bay=0;
        char js;
        String pilihan;
        
        int [] us = new int[10];
        int [] jum = new int[10];
        String [] jS = new String[10];
        String [] warna = new String[10];
        String [] merk = new String[10];
        double [] hg = new double[10];
        double [] total = new double[10];
        double [] sub_total = new double[10];
        
        System.out.println("===========================================================================================");
        System.out.println("Silahkan Pilih Merk Sepatu di bawah ini!!");
        System.out.println("   [1]. Ardiles");
        System.out.println("   [2]. Eagle");
        System.out.println("   [3]. Johnson");
        System.out.println("   [4]. Piero");
        System.out.println("   [5]. Spotec");
        
        for (pilihan ="Y"; pilihan.equals("Y")||pilihan.equals("y");){
        System.out.print("Pilih Merk Sepatu                 : ");
        mS = in.nextInt();
        System.out.print("Jumlah sepatu yang dibeli         : ");
        jumlah = in.nextInt();
        
        switch (mS) {
            case 1:
                merk[i]="Ardiles";
                break;
            case 2:
                merk[i]="Eagle";
                break;
            case 3:
                merk[i]="Johnson";
                break;
            case 4:   
                merk[i]="Piero";
                break;
            case 5:
                merk[i]="Spotec";
                break;
            default:
                System.out.println("Merk Tidak Tersedia");
                 break;
        }
        if (mS==1){
            merk[i] = "Ardiles";
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("                             DAFTAR HARGA JENIS SEPATU ARDILES                             ");
            System.out.println("===========================================================================================");
            System.out.println("|Kode| No |        Jenis Sepatu        |    Warna Sepatu    | Ukuran Sepatu |    Harga    |");
            System.out.println("===========================================================================================");
            System.out.println("| a. |    | Ardiles Aza 6.9            |                    |               | Rp. 599.000 |");
            System.out.println("|    | 1  |                            | Putih              | 42,43,44      |             |");
            System.out.println("|    | 2  |                            | Hitam-Orange       | 43,44,45      |             |");
            System.out.println("| b. |    | Ardiles Frodo              |                    |               | Rp. 194.900 |");
            System.out.println("|    | 1  |                            | Biru-Putih         | 42,43         |             |");
            System.out.println("|    | 2  |                            | Hijau-Putih        | 38            |             |");
            System.out.println("| c. |    | Ardiles Fujitora           |                    |               | Rp. 189.000 |");
            System.out.println("|    | 1  |                            | Hitam              | 43,44         |             |");
            System.out.println("|    | 2  |                            | Hitam-Putih        | 42,44         |             |");
            System.out.println("===========================================================================================");
            for (i=0; i<jumlah;i++){
            System.out.println("Sepatu Ke-"+(i+1)+"");
            System.out.println("Merk Sepatu                     : "+merk[i]);
            System.out.print("Pilih Jenis Sepatu                : ");
            js = in.next().charAt(0);
            System.out.print("Pilih Warna Sepatu                : ");
            ws = in.next().charAt(0);
            System.out.print("Berapa Ukuran Sepatu              : ");
            us[i] = in.nextInt();
            System.out.print("Berapa jumlah Sepatu yang dibeli  : ");
            jum[i] = in.nextInt();
            System.out.println("===========================================================================================");
                    
            switch (js){
                case 'a':
                    jS[i] = "Ardiles Aza 6.9";               
                    if (ws=='1'){
                        warna[i] = "Putih";
                        hg[i] = 599000;
                    }else if (ws=='2'){
                        warna[i] = "Hitam-Orange";
                        hg[i] = 599000;
                    }break;
                case 'b':
                    jS[i] = "Ardiles Frodo";
                    if (ws=='1'){
                        warna[i] = "Biru-Putih";
                        hg[i] = 194900;
                    }else if (ws=='2'){
                        warna[i] = "Hijau-Putih";
                        hg[i] = 194900;
                    }break;
                case 'c':
                    jS[i] = "Ardiles Fujitora";
                    if (ws=='1'){
                        warna[i] = "Hitam";
                        hg[i] = 189000;
                    }else if (ws=='2'){
                        warna[i] = "Hitam-Putih";
                        hg[i] = 189000;
                    }break;
            }
            }
        }
        if (mS==2){
            merk[i] = "Eagle";
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("                              DAFTAR HARGA JENIS SEPATU EAGLE                              ");
            System.out.println("===========================================================================================");
            System.out.println("|Kode| No |        Jenis Sepatu        |    Warna Sepatu    | Ukuran Sepatu |    Harga    |");
            System.out.println("===========================================================================================");
            System.out.println("| a. |    | Eagle Bellagio             |                    |               | Rp. 249.000 |");
            System.out.println("|    | 1  |                            | Hitam-Putih        | 40,42,43      |             |");
            System.out.println("| b. |    | Eagle Monza                |                    |               | Rp. 239.000 |");
            System.out.println("|    | 1  |                            | Hitam-Putih        | 38,40,44      |             |");
            System.out.println("|    | 2  |                            | Biru Tua-Putih     | 37,39,42      |             |");
            System.out.println("|    | 3  |                            | Maroon-Putih       | 39,43         |             |");
            System.out.println("| c. |    | Eagle Revor                |                    |               | Rp. 278.000 |");
            System.out.println("|    | 1  |                            | Hitam              | 40,41         |             |");
            System.out.println("|    | 2  |                            | Hitam-Putih        | 37,38         |             |");
            System.out.println("|    | 3  |                            | Biru Tua-Putih     | 38,39         |             |");
            System.out.println("===========================================================================================");
            for (i=0; i<jumlah;i++){
            System.out.println("Sepatu Ke-"+(i+1)+"");
            System.out.println("Merk Sepatu                     : "+merk[i]);
            System.out.print("Pilih Jenis Sepatu                : ");
            js = in.next().charAt(0);
            System.out.print("Pilih Warna Sepatu                : ");
            ws = in.next().charAt(0);
            System.out.print("Berapa Ukuran Sepatu              : ");
            us[i] = in.nextInt();
            System.out.print("Berapa jumlah Sepatu yang dibeli  : ");
            jum[i] = in.nextInt();
            System.out.println("===========================================================================================");
                
            switch (js){
                case 'a':
                    jS[i] = "Eagle Bellagio";
                    if (ws=='1'){
                        warna[i] = "Hitam-Putih";
                        hg[i] = 249000;
                    }break;
                case 'b':
                    jS[i] = "Eagle Monza";
                    if (ws=='1'){
                        warna[i] = "Hitam-Putih";
                        hg[i] = 239000;
                    }else if (ws=='2'){
                        warna[i] = "BiruTua-Putih";
                        hg[i] = 239000;
                    }else if (ws=='3'){
                        warna[i] = "Maroon-Putih";
                        hg[i] = 239000;
                    }break;
                case 'c':
                    jS[i] = "Eagle Revor";
                    if (ws=='1'){
                        warna[i] = "Hitam";
                        hg[i] = 278000;
                    }else if (ws=='2'){
                        warna[i] = "Hitam-Putih";
                        hg[i] = 278000;
                    }else if (ws=='3'){
                        warna[i] = "BiruTua-Putih";
                        hg[i] = 278000;
                    }break;
            }
            }
        }
        if(mS==3){
            merk[i] = "Johnson";
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("                             DAFTAR HARGA JENIS SEPATU JOHNSON                             ");
            System.out.println("===========================================================================================");
            System.out.println("|Kode| No |        Jenis Sepatu        |    Warna Sepatu    | Ukuran Sepatu |    Harga    |");
            System.out.println("===========================================================================================");
            System.out.println("| a. |    | Johnson Galaxy Pro Lowcut  |                    |               | Rp. 379.800 |");
            System.out.println("|    | 1  |                            | Abu-Merah-Putih    | 42,43,44      |             |");
            System.out.println("===========================================================================================");
            for (i=0; i<jumlah;i++){
            System.out.println("Sepatu Ke-"+(i+1)+"");
            System.out.println("Merk Sepatu                     : "+merk[i]);
            System.out.print("Pilih Jenis Sepatu                : ");
            js = in.next().charAt(0);
            System.out.print("Pilih Warna Sepatu                : ");
            ws = in.next().charAt(0);
            System.out.print("Berapa Ukuran Sepatu              : ");
            us[i] = in.nextInt();
            System.out.print("Berapa jumlah Sepatu yang dibeli  : ");
            jum[i] = in.nextInt();
            System.out.println("===========================================================================================");
            
            switch (js){
                case 'a':
                    jS[i] = "Johnson Galaxy Pro Lowcut";
                    if (ws=='1'){
                        warna[i] = "Abu-Merah-Putih";
                        hg[i] = 379800;
                    }break;
            }
            }
        }
        if(mS==4){
            merk[i] = "Piero";
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("                              DAFTAR HARGA JENIS SEPATU PIERO                              ");
            System.out.println("===========================================================================================");
            System.out.println("|Kode| No |        Jenis Sepatu        |    Warna Sepatu    | Ukuran Sepatu |    Harga    |");
            System.out.println("===========================================================================================");
            System.out.println("| a. |    | Piero City Core B          |                    |               | Rp. 329.800 |");
            System.out.println("|    | 1. |                            | Hitam-Putih        | 37,41,42,44   |             |");
            System.out.println("| b. |    | Piero Cruzher              |                    |               | Rp. 429.800 |");
            System.out.println("|    | 1. |                            | Asphalt Black      | 42,43         |             |");
            System.out.println("|    | 2. |                            | Royal Purple       | 39,42         |             |");
            System.out.println("===========================================================================================");
            for (i=0; i<jumlah;i++){
            System.out.println("Sepatu Ke-"+(i+1)+"");
            System.out.println("Merk Sepatu                     : "+merk[i]);
            System.out.print("Pilih Jenis Sepatu                : ");
            js = in.next().charAt(0);
            System.out.print("Pilih Warna Sepatu                : ");
            ws = in.next().charAt(0);
            System.out.print("Berapa Ukuran Sepatu              : ");
            us[i] = in.nextInt();
            System.out.print("Berapa jumlah Sepatu yang dibeli  : ");
            jum[i] = in.nextInt();
            System.out.println("===========================================================================================");
                
            switch (js){
                case 'a':
                    jS[i] = "Piero City Core B";
                    if (ws=='1'){
                        warna[i] = "Hitam-Putih";
                        hg[i] = 329800;
                    }break;    
                case 'b':
                    jS[i] = "Piero Cruzher";
                    if (ws=='1'){
                        warna[i] = "Asphalt Black";
                        hg[i] = 429800;
                    }else if (ws=='2'){
                        warna[i] = "Royal Purple";
                        hg[i] = 429800;
                    }break;
            }
            }
        }
        if(mS==5){
            merk[i] = "Spotec";
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("|                            DAFTAR HARGA JENIS SEPATU SPOTEC                             |");
            System.out.println("===========================================================================================");
            System.out.println("|Kode| No |        Jenis Sepatu        |    Warna Sepatu    | Ukuran Sepatu |    Harga    |");
            System.out.println("===========================================================================================");
            System.out.println("| a. |    | Spotec Alpha               |                    |               | Rp. 250.000 |");
            System.out.println("|    | 1. |                            | Hitam-Biru-Putih   | 41,42         |             |");
            System.out.println("|    | 2. |                            | Hitam-Merah-Putih  | 38,39,43      |             |");
            System.out.println("|    | 3. |                            | Abu-Putih          | 38,41,42      |             |");
            System.out.println("===========================================================================================");
            for (i=0; i<jumlah;i++){
            System.out.println("Sepatu Ke-"+(i+1)+"");
            System.out.println("Merk Sepatu                     : "+merk[i]);
            System.out.print("Pilih Jenis Sepatu                : ");
            js = in.next().charAt(0);
            System.out.print("Pilih Warna Sepatu                : ");
            ws = in.next().charAt(0);
            System.out.print("Berapa Ukuran Sepatu              : ");
            us[i] = in.nextInt();
            System.out.print("Berapa jumlah Sepatu yang dibeli  : ");
            jum[i] = in.nextInt();
            System.out.println("===========================================================================================");
                
            switch (js){
                case 'a':
                    jS[i] = "Spotec Alpha";
                    if (ws=='1'){
                        warna[i]="Hitam-Biru-Putih";
                        hg[i]=250000;
                    }else if (ws=='2'){
                        warna[i]="Hitam-Merah-Putih";
                        hg[i]=250000;
                    }else if (ws=='3'){
                        warna[i]="Abu-Putih";
                        hg[i]=250000;
                    }break;
            }
            }
        }
        System.out.print("Apakah ada transaksi lagi? [y/t] : ");
        pilihan = in.next();
        System.out.println("===========================================================================================");
            i++;
        }
        System.out.println("                                                   ARENA TOKO SEPATU                                                    ");
        System.out.println("                                     Jl. Raya Banjaran, No. 180, Kabupaten Bandung                                      ");
        System.out.println("                                                   Telp. 022-5943251                                                    "); 
        System.out.println("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>");
        LocalDateTime tanggalDanWaktuSekarang = LocalDateTime.now();
        System.out.println("User    : kasir");
        System.out.println(tanggalDanWaktuSekarang.format(DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss")));        
        System.out.println("========================================================================================================================");
        System.out.println("| No | Merk Sepatu |        Jenis Sepatu        |    Warna Sepatu    | Ukuran |    Harga    |  Jumlah  |   Sub Total   |");
        System.out.println("========================================================================================================================");
        for (i=0; i<jumlah;i++){
        total_pembelian+= (hg[i]*jum[i]);
        sub_total[i] = sub_total[i] + total[i];
        pajak = total_pembelian*0.1;    
    
        System.out.println("| "+(i+1)+"  | "+merk[i]+"\t| "+jS[i]+"\t| "+warna[i]+"\t| "+us[i]+"\t| "+hg[i]+"\t| "+jum[i]+"\t| "+(hg[i]*jum[i])+"\t|");        
        }           
        System.out.println("========================================================================================================================");
        
        System.out.println("                                                           Total                       : Rp. "+total_pembelian);
        System.out.println("                                                           Pajak 10%                   : Rp. "+pajak);
        if (total_pembelian>=600000){
            diskon = total_pembelian*20/100;
            System.out.println("                                                           Diskon 20%                  : Rp. "+diskon);
        }
            
        System.out.println("========================================================================================================================");   
        System.out.println("                                                           Total yang harus dibayar    : Rp. "+(total_pembelian+pajak-diskon));
        System.out.print("                                                           Bayar                       : Rp. ");
        bayar = in.nextInt();
        System.out.println("                                                           Kembalian                   : Rp. "+(bayar - (total_pembelian+pajak-diskon)));
        System.out.println("========================================================================================================================");
        System.out.println("                                       Terima Kasih Telah Berbelanja di Toko Kami                                       ");  
        System.out.println("========================================================================================================================");    }
}
