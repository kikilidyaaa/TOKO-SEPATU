package ARENA;
import java.util.Scanner;
public class TokoSepatu {
    public static void main(String[] args) {
        
        String Username = "kasir1",
               Password = "1234",
               pengulangan,
               tp;
        
        boolean login = false;
        
        int mk,
            i=0, 
            bayar, 
            jum=0, 
            totalPembelian=0;
        
        char js, 
             ws;
        
        int [] ms = new int[10],
               bs = new int [10],
               us = new int[10],
               ps = new int [10],
               hg = new int[10],
               harga = new int[4],
               harga1 = new int[4];
        String [] warna = new String[10],
                  merk = new String[10],
                  jenis_sepatu = new String [4],
                  merk_sepatu = new String [4];
        double [] sub_total = new double[4];
        Scanner in = new Scanner(System.in);
        
        while (login == false) {
            System.out.print("Username : ");
            String username = in.next();
            System.out.print("Password : ");
            String password = in.next();
                if (username.equals(Username) && password.equals(Password)) {
                    System.out.println("                                          Login Berhasil!                                         ");
                    login = true;
                    } else if (username.equals(Username)) {
                        System.out.println("                                        Invalid Password!                                         ");
                        
                    } else if (password.equals(Password)) {
                        System.out.println("                                        Invalid Username!                                         ");
                    } else {
                        System.out.println("                                   Invalid Username & Password!                                   ");
                    }
        }
        
        System.out.println("==================================================================================================");
        System.out.println("                                   WELCOME TO TOKO SEPATU ARENA                                   ");
        System.out.println("==================================================================================================");
        do{
//         System.out.println("");
//         ms[i] = in.nextInt();
//         System.out.println("==================================================================================================");
        System.out.println(" DAFTAR MERK SEPATU :                     ");
        System.out.println(" 1. Ardiles");
        System.out.println(" 2. Eagle");
        System.out.println(" 3. Johnson");
        System.out.println(" 4. Piero");
        System.out.println(" 5. Spotec");
        System.out.print("Pilih Merk Sepatu Ke - [1/2/3/4/5]      :   ");
        mk = in.nextInt();
        System.out.print(" Berapa Merk Sepatu       :   ");
                
            switch (mk) {
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
                    break;
            }
                System.out.print("Berapa Jumlah Sepatu Yang Anda Beli     :   ");
                bs[i] = in.nextInt();
                System.out.println("==================================================================================================");
        
        if (mk==1){
            System.out.println("1. Ardiles (Merk Sepatu)");
            System.out.println("   a. Ardiles Aza 6.9 (Jenis Sepatu)           =  Rp 599.000");
            System.out.println("      1. Putih		//  Size 42,43,44                   ");
            System.out.println("      2. Hitam-Orange	//  Size 43,44,45                   ");
            System.out.println("   b. Ardiles Frodo (Jenis Sepatu)             =  Rp 194.900");
            System.out.println("      1. Biru-Putih	//  Size 42,43                      ");
            System.out.println("      2. Hijau-Putih    //  Size 38                         ");
            System.out.println("   c. Ardiles Fujitora (Jenis Sepatu)          =  Rp 189.000");
            System.out.println("      1. Hitam		//  Size 43,44                      ");
            System.out.println("      2. Hitam-Putih	//  Size 42,44                      ");
            System.out.println("==================================================================================================");
            System.out.print("Pilih Jenis Sepatu Ke-"+(i+1)+"                      :   ");
            js = in.next().charAt(0);
            System.out.print("Pilih Warna Sepatu Ke-"+(i+1)+"                      :   ");
            ws = in.next().charAt(0);
            System.out.print("Berapa Ukuran Sepatu yang Anda Beli Ke-"+(i+1)+"     :   ");
            us[i] = in.nextInt(); 
            System.out.print("Banyak Pasang Sepatu Ke -1 Ke-"+(i+1)+"              :   ");
            ps[i] = in.nextInt();

        switch (js){
            case 'a':
                tp="Ardiles Aza 6.9";
                if (ws=='1'){
                warna[i]="Putih";
                hg[i]=599000;
                } else if (ws=='2'){
                warna[i]="Hitam-Orange";
                hg[i]=599000;
                }
                break;
            case 'b':
                tp="Ardiles Frodo";
                if (ws=='1'){
                warna[i]="Biru-Putih";
                hg[i]=194900;
                } else if (ws=='2'){
                warna[i]="Hijau-Putih";
                hg[i]=194900;
                }
                break;
            case 'c':
                tp="Ardiles Fujitora";
                if (ws=='1'){
                warna[i]="Hitam";
                hg[i]=189000;
                } else if (ws=='2'){
                warna[i]="Hitam-Putih";
                hg[i]=189000;
                }
                break;
        }
        }
        if (mk==2){
                System.out.println("2. Eagle (Merk Sepatu)");
                System.out.println("   a. Eagle Bellagio (Jenis Sepatu)            =  Rp 249.000");
                System.out.println("      1. Hitam-Putih	//  Size 40,42,43               ");
                System.out.println("   b. Eagle Monza (Jenis Sepatu)               =  Rp 239.000");
                System.out.println("      1. Hitam-Putih	//  Size 38,40,44               ");
                System.out.println("      2. BiruTua-Putih	//  Size 37,39,42               ");
                System.out.println("      3. Maroon-Putih	//  Size 39,43                  ");
                System.out.println("   c. Eagle Revor (Jenis Sepatu)               =  Rp 278.000");
                System.out.println("      1. Hitam		//  Size 40,41                  ");
                System.out.println("      2. Hitam-Putih	//  Size 37,38                  ");
                System.out.println("      3. BiruTua-Putih	//  Size 38,39                  ");
                System.out.println("==================================================================================================");
                System.out.print("Pilih Jenis Sepatu Ke-"+(i+1)+"                      :   ");
                js = in.next().charAt(0);
                System.out.print("Pilih Warna Sepatu Ke-"+(i+1)+"                      :   ");
                ws = in.next().charAt(0);
                System.out.print("Berapa Ukuran Sepatu yang Anda Beli Ke-"+(i+1)+"     :   ");
                us[i] = in.nextInt(); 
                System.out.print("Banyak Pasang Sepatu Ke -1 Ke-"+(i+1)+"              :   ");
                ps[i] = in.nextInt();

        switch (js){
            case 'a':
                tp="Eagle Bellagio";
                if (ws=='1'){
                warna[i]="Hitam-Putih";
                hg[i]=249000;
                }
                break;
            case 'b':
                tp="Eagle Monza";
                if (ws=='1'){
                warna[i]="Hitam-Putih";
                hg[i]=239000;
                } else if (ws=='2'){
                warna[i]="BiruTua-Putih";
                hg[i]=239000;
                } else if (ws=='3'){
                warna[i]="Maroon-Putih";
                hg[i]=239000;
                }                
                break;
            case 'c':
                tp="Eagle Revor";
                if (ws=='1'){
                warna[i]="Hitam";
                hg[i]=278000;
                } else if (ws=='2'){
                warna[i]="Hitam-Putih";
                hg[i]=278000;
                } else if (ws=='3'){
                warna[i]="BiruTua-Putih";
                hg[i]=278000;
                }
                break;
        }
        }
        if (mk==3){
                System.out.println("3. Johnson (Merk Sepatu)");
                System.out.println("   a. Johnson Galaxy Pro Lowcut (Jenis Sepatu) =  Rp 379.800");
                System.out.println("      1. Abu-Merah-Putih	//  Size 42,43,44               ");
                System.out.println("==================================================================================================");
                System.out.print("Pilih Jenis Sepatu Ke-"+(i+1)+"                      :   ");
                js = in.next().charAt(0);
                System.out.print("Pilih Warna Sepatu Ke-"+(i+1)+"                      :   ");
                ws = in.next().charAt(0);
                System.out.print("Berapa Ukuran Sepatu yang Anda Beli Ke-"+(i+1)+"     :   ");
                us[i] = in.nextInt(); 
                System.out.print("Banyak Pasang Sepatu Ke -1 Ke-"+(i+1)+"              :   ");
                ps[i] = in.nextInt();

        switch (js){
            case 'a':
                tp="Johnson Galaxy Pro Lowcut";
                if (ws=='1'){
                warna[i]="Abu-Merah-Putih";
                hg[i]=379800;
                }
                break;
        }
        }
        if (mk==4){
                System.out.println("4. Piero (Merk Sepatu)");
                System.out.println("   a. Piero City Core B (Jenis Sepatu)         =  Rp 329.800");
                System.out.println("      1. Hitam-Putih	//  Size 37,41,42,44            ");
                System.out.println("   b. Piero Cruzher (Jenis Sepatu)             =  Rp 429.800");
                System.out.println("      1. Asphalt Black	//  Size 42,43                  ");
                System.out.println("      2. Royal Purple	//  Size 39,42                  ");
                System.out.println("==================================================================================================");
                System.out.print("Pilih Jenis Sepatu Ke-"+(i+1)+"                      :   ");
                js = in.next().charAt(0);
                System.out.print("Pilih Warna Sepatu Ke-"+(i+1)+"                      :   ");
                ws = in.next().charAt(0);
                System.out.print("Berapa Ukuran Sepatu yang Anda Beli Ke-"+(i+1)+"     :   ");
                us[i] = in.nextInt(); 
                System.out.print("Banyak Pasang Sepatu Ke -1 Ke-"+(i+1)+"              :   ");
                ps[i] = in.nextInt();

        switch (js){
            case 'a':
                tp="Piero City Core B";
                if (ws=='1'){
                warna[i]="Hitam-Putih";
                hg[i]=329800;
                }
                break;
            case 'b':
                tp="Piero Cruzher";
                if (ws=='1'){
                warna[i]="Asphalt Black";
                hg[i]=429800;
                } else if (ws=='2'){
                warna[i]="Royal Purple";
                hg[i]=429800;
                }
                break;
        }
        }
        if (mk==5){
                System.out.println("5. Spotec (Merk Sepatu)");
                System.out.println("   a. Spotec Alpha (Jenis Sepatu)              =  Rp 250.000");
                System.out.println("      1. Hitam-Biru-Putih	//  Size 41,42                  ");
                System.out.println("      2. Hitam-Merah-Putih	//  Size 38,39,43               ");
                System.out.println("      3. Abu-Putih		//  Size 38,41,42               ");
                System.out.println("==================================================================================================");
                System.out.print("Pilih Jenis Sepatu Ke-"+(i+1)+"                      :   ");
                js = in.next().charAt(0);
                System.out.print("Pilih Warna Sepatu Ke-"+(i+1)+"                      :   ");
                ws = in.next().charAt(0);
                System.out.print("Berapa Ukuran Sepatu yang Anda Beli Ke-"+(i+1)+"     :   ");
                us[i] = in.nextInt(); 
                System.out.print("Banyak Pasang Sepatu Ke -1 Ke-"+(i+1)+"              :   ");
                ps[i] = in.nextInt();

        switch (js){
            case 'a':
                tp="Spotec Alpha";
                if (ws=='1'){
                warna[i]="Hitam-Biru-Putih";
                hg[i]=250000;
                } else if (ws=='2'){
                warna[i]="Hitam-Merah-Putih";
                hg[i]=250000;
                } else if (ws=='3'){
                warna[i]="Abu-Putih";
                hg[i]=250000;
                }
                break;
        }
        }   
        
    System.out.print("Apakah Anda ingin berbelanja lagi? [Y/T] :   ");
    pengulangan = in.next();   
    }while(pengulangan.equalsIgnoreCase("Y"));
        
            System.out.println("");
            System.out.println("                                  ARENA TOKO SEPATU                                  ");
            System.out.println("                    Jl. Raya Banjaran, No. 180, Kabupaten Bandung                    ");
            System.out.println("                                  Telp. 022-5943251                                  "); 
            System.out.println("=====================================================================================");
            System.out.println("=====================================================================================");
            System.out.println("| No |     Merk Sepatu     |          Jenis Sepatu          |   Warna Sepatu   | Ukuran | Jumlah |    Harga    |");
            System.out.println("=====================================================================================");
            for (i=1; i<jum;i++){
            sub_total[i] = (harga[i]+harga1[i])*porsi[i];
            total_pembelian+= sub_total[i];
        
            System.out.println("Menu Ke- "+(i+1));
            System.out.println("1. Jenis Seblak = "+jenis_seblak[i]);
            System.out.println("2. Level Pedas  = "+level_pedas[i]);
            System.out.println("3. Jumlah Porsi = "+porsi[i]);
            System.out.println("4. Harga        = "+sub_total[i]);
            }
            System.out.println("========================================");
            System.out.println("TOTAL YANG HARUS DI BAYAR = Rp. "+total_pembelian);
            System.out.print("BAYAR                     = Rp. ");
            bayar = in.nextInt();
            System.out.println("KEMBALIAN                 = Rp. "+(bayar - total_pembelian));
            System.out.println("========================================");
            
                
                
                
                
                
                
                System.out.println("|    |                     |                                |                  |        |        |             |");
            }
            
        }
    System.out.println("==================================================================================================");
    System.out.println("                            Terima Kasih Telah Berbelanja di Toko Kami                            ");  
    System.out.println("==================================================================================================");
        }
}
