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
        int login1;
        String data[] = {"kasir","1234"};
        String username, password;
        
        System.out.println("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>");
        System.out.println("                 LOGIN                 ");
        System.out.print(" Username : ");
        username = login.next(); 
        System.out.print(" Password : ");
        password = login.next();
        System.out.println("");
        System.out.println("        1. Submit     2. Cancel        ");
        System.out.print("Apakah anda akan login [1/2]? ");
        login1 = login.nextInt();
        
        switch (login1){
            case 1:
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
            case 2:
                login();               
            default:
                System.out.println("Pilihan tidak tersedia");
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
            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }
    static void daftarSepatu(){
        Scanner in = new Scanner(System.in);
        int menu;
        System.out.println("「=========================================================================================﹁");
        System.out.println("                               HARGA dan PROMO DISKON SEPATU                               |");
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
        }else{
            System.out.println("Pilihan menu tidak tersedia");
        }
    }
    static void pemesanan(){
        Scanner in = new Scanner(System.in);
        int mS, ws, i=0, jumlah=0;
        double total_pembelian=0, bayar, diskon=0, pajak=0, jum_bay=0, kembalian;
        char js;
        String pilihan;
        
        int [] us = new int[10];
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
        
        System.out.print("Jumlah sepatu yang dibeli         : ");
        jumlah = in.nextInt();
        for (pilihan ="Y"; pilihan.equals("Y")||pilihan.equals("y");){
        System.out.print("Pilih Merk Sepatu                 : ");
        mS = in.nextInt();
        
        switch (mS) {
            case 1:
                merk[i]="Ardiles \t";
                break;
            case 2:
                merk[i]="Eagle \t";
                break;
            case 3:
                merk[i]="Johnson \t";
                break;
            case 4:   
                merk[i]="Piero \t";
                break;
            case 5:
                merk[i]="Spotec \t";
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
            System.out.println("Merk Sepatu                       : Ardiles");
            System.out.print("Pilih Jenis Sepatu                : ");
            js = in.next().charAt(0);
            System.out.print("Pilih Warna Sepatu                : ");
            ws = in.next().charAt(0);
            System.out.print("Berapa Ukuran Sepatu              : ");
            us[i] = in.nextInt();
            System.out.println("===========================================================================================");
                    
            switch (js){
                case 'a':
                    jS[i] = "Ardiles Aza 6.9 \t";               
                    if (ws=='1'){
                        warna[i] = "Putih \t";
                        hg[i] = 599000;
                    }else if (ws=='2'){
                        warna[i] = "Hitam-Orange \t";
                        hg[i] = 599000;
                    }break;
                case 'b':
                    jS[i] = "Ardiles Frodo \t";
                    if (ws=='1'){
                        warna[i] = "Biru-Putih \t";
                        hg[i] = 194900;
                    }else if (ws=='2'){
                        warna[i] = "Hijau-Putih \t";
                        hg[i] = 194900;
                    }break;
                case 'c':
                    jS[i] = "Ardiles Fujitora \t";
                    if (ws=='1'){
                        warna[i] = "Hitam \t\t";
                        hg[i] = 189000;
                    }else if (ws=='2'){
                        warna[i] = "Hitam-Putih \t";
                        hg[i] = 189000;
                    }break;
                default:
                    System.out.println("Pilihan tidak tersedia");
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
            System.out.println("Merk Sepatu                       : Eagle");
            System.out.print("Pilih Jenis Sepatu                : ");
            js = in.next().charAt(0);
            System.out.print("Pilih Warna Sepatu                : ");
            ws = in.next().charAt(0);
            System.out.print("Berapa Ukuran Sepatu              : ");
            us[i] = in.nextInt();
            System.out.println("===========================================================================================");
                
            switch (js){
                case 'a':
                    jS[i] = "Eagle Bellagio \t\t";
                    if (ws=='1'){
                        warna[i] = "Hitam-Putih \t";
                        hg[i] = 249000;
                    }break;
                case 'b':
                    jS[i] = "Eagle Monza \t\t";
                    if (ws=='1'){
                        warna[i] = "Hitam-Putih \t";
                        hg[i] = 239000;
                    }else if (ws=='2'){
                        warna[i] = "BiruTua-Putih \t";
                        hg[i] = 239000;
                    }else if (ws=='3'){
                        warna[i] = "Maroon-Putih \t";
                        hg[i] = 239000;
                    }break;
                case 'c':
                    jS[i] = "Eagle Revor \t\t";
                    if (ws=='1'){
                        warna[i] = "Hitam \t\t";
                        hg[i] = 278000;
                    }else if (ws=='2'){
                        warna[i] = "Hitam-Putih \t";
                        hg[i] = 278000;
                    }else if (ws=='3'){
                        warna[i] = "BiruTua-Putih \t";
                        hg[i] = 278000;
                    }else{
                        System.out.println("Pilihan tidak tersedia");
                    }break;
                default:
                    System.out.println("Pilihan tidak tersedia");
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
            System.out.println("Merk Sepatu                       : Johnson");
            System.out.print("Pilih Jenis Sepatu                : ");
            js = in.next().charAt(0);
            System.out.print("Pilih Warna Sepatu                : ");
            ws = in.next().charAt(0);
            System.out.print("Berapa Ukuran Sepatu              : ");
            us[i] = in.nextInt();
            System.out.println("===========================================================================================");
            
            switch (js){
                case 'a':
                    jS[i] = "Johnson Galaxy Pro Lowcut";
                    if (ws=='1'){
                        warna[i] = "Abu-Merah-Putih";
                        hg[i] = 379800;
                    }break;
                default:
                    System.out.println("Pilihan tidak tersedia");
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
            System.out.println("Merk Sepatu                       : Piero");
            System.out.print("Pilih Jenis Sepatu                : ");
            js = in.next().charAt(0);
            System.out.print("Pilih Warna Sepatu                : ");
            ws = in.next().charAt(0);
            System.out.print("Berapa Ukuran Sepatu              : ");
            us[i] = in.nextInt();
            System.out.println("===========================================================================================");
                
            switch (js){
                case 'a':
                    jS[i] = "Piero City Core B";
                    if (ws=='1'){
                        warna[i] = "Hitam-Putih \t";
                        hg[i] = 329800;
                    }break;    
                case 'b':
                    jS[i] = "Piero Cruzher \t";
                    if (ws=='1'){
                        warna[i] = "Asphalt Black \t";
                        hg[i] = 429800;
                    }else if (ws=='2'){
                        warna[i] = "Royal Purple \t";
                        hg[i] = 429800;
                    }break;                
                default:
                    System.out.println("Pilihan tidak tersedia");
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
            System.out.println("Merk Sepatu                       : Spotec");
            System.out.print("Pilih Jenis Sepatu                : ");
            js = in.next().charAt(0);
            System.out.print("Pilih Warna Sepatu                : ");
            ws = in.next().charAt(0);
            System.out.print("Berapa Ukuran Sepatu              : ");
            us[i] = in.nextInt();
            System.out.println("===========================================================================================");
                
            switch (js){
                case 'a':
                    jS[i] = "Spotec Alpha \t\t";
                    if (ws=='1'){
                        warna[i]="Hitam-Biru-Putih";
                        hg[i]=250000;
                    }else if (ws=='2'){
                        warna[i]="Hitam-Merah-Putih";
                        hg[i]=250000;
                    }else if (ws=='3'){
                        warna[i]="Abu-Putih \t";
                        hg[i]=250000;
                    }break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        }
        
        System.out.println("Pesanan Ke-"+(i+1)+"  dengan merk  "+merk[i]+"  jenis sepatu  "+jS[i]+"  warna  "+warna[i]+"  ukuran  "+us[i]+" harganya yaitu Rp. "+hg[i]+"");
        
        System.out.print("Apakah ada transaksi lagi? [y/t] : ");
        pilihan = in.next();
        System.out.println("=============================================================================================");
            i++;
        }
        System.out.println("┌───────────────────────────────────────────────────────┐");
        System.out.println("│                                     ARENA TOKO SEPATU                                   │");
        System.out.println("│                       Jl. Raya Banjaran, No. 180, Kabupaten Bandung                     │");
        System.out.println("│                                     Telp. 022-5943251                                   │"); 
        System.out.println("└───────────────────────────────────────────────────────┘");
        LocalDateTime tanggalDanWaktuSekarang = LocalDateTime.now();
        System.out.println("User    : kasir");
        System.out.println(tanggalDanWaktuSekarang.format(DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss")));

        System.out.println("+----+-------------+----------------------------+--------------------+--------+-------------+");
        System.out.println("| No | Merk Sepatu |        Jenis Sepatu        |    Warna Sepatu    | Ukuran |    Harga    |");
        System.out.println("+----+-------------+----------------------------+--------------------+--------+-------------+");

        for (i=0; i<jumlah; i++) {
        total_pembelian+= hg[i];
        sub_total[i] = sub_total[i] + total[i];
        pajak = total_pembelian*0.1; 
        jum_bay = total_pembelian+pajak-diskon;
        System.out.println("| "+(i+1)+"  |  "+merk[i]+"  |  "+jS[i]+"\t  |  "+warna[i]+"\t  |  "+us[i]+"\t  |  "+hg[i]+"\t  |");
        }
        System.out.println("+----+-------------+----------------------------+--------------------+--------+-------------+");        
        
        System.out.println("                                               Total                       : Rp. "+total_pembelian);
        System.out.println("                                               Pajak 10%                   : Rp. "+pajak);
        if (total_pembelian>=600000){
            diskon = total_pembelian*20/100;
            System.out.println("                                               Diskon 20%                  : Rp. "+diskon);
        }
            
        System.out.println("============================================================================================");   
        System.out.println("                                               Total yang harus dibayar    : Rp. "+jum_bay);
        do{
        System.out.print("                                               Bayar                       : Rp. ");
        bayar = in.nextInt();
        if (bayar == jum_bay){
            System.out.println("                                               Uang yang Anda bayarkan pas");
        } else if (bayar > jum_bay) {
            kembalian = bayar - jum_bay;
            System.out.println("                                               Uang yang Anda bayarkan lebih");
            System.out.println("                                               Berikut kembalian Anda       : Rp.  " + kembalian);
        } else {
            System.out.println("                                            Uang yang Anda bayarkan kurang, silakan bayar sesuai harga yang tertera");
        }
        } while (bayar < jum_bay);
        System.out.println("========================================================================================================================");
        System.out.println("                                       Terima Kasih Telah Berbelanja di Toko Kami                                       ");  
        System.out.println("========================================================================================================================");
    }
}
