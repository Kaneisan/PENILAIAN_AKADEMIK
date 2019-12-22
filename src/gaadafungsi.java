//wildani sulthon mahmudi - 1931710170
import java.util.Scanner;
import java.util.Arrays;
public class gaadafungsi {
    static int p=19;
    static int q=20;
    public static void main(String[]args){
        Scanner ab=new Scanner(System.in);
        boolean t=true;
        int counter = 1;
        String nama[] = {"Agustin","Arba","Aqzal","Balqis","Brian","Deta","Dinda","Dion","Erni","Falih","Fela","Irfan","Irma","Vindo","Luthfi","Bagas","Wildan","Nafhi","Bisma","0","0"};
        int nis[] = {1931710076,1931710084,1931710079,1931710122,1931710095,1931710157,1931710082,1931710092,1931710111,1931710003,1931710176,1931710007,1931710130,1931710027,1931710182,1931710041,1931710078,1931710170,1931710018,0,0};
        int agama[] =  {85,90,78,90,91,90,85,90,85,90,90,90,90,90,91,91,91,91,85,0,0};
        int pkn[] =    {79,90,78,79,80,90,78,76,88,90,92,98,88,70,80,79,82,87,87,0,0};
        int mtk[] =    {85,85,89,82,87,80,92,78,80,79,90,90,88,82,75,92,82,80,90,0,0};
        int bind[] =   {78,80,90,80,82,95,80,78,80,60,85,78,95,88,87,88,78,85,90,0,0};
        int bing[] =   {78,80,85,85,84,82,83,78,90,92,95,90,80,80,78,96,80,77,78,0,0};
        int sejarah[]= {80,79,80,82,78,90,92,95,77,85,88,86,79,84,82,83,79,78,90,0,0};
        int senbud[] = {80,85,88,87,87,89,86,85,77,77,81,80,90,90,92,93,94,95,79,0,0};
        int pkwu[] =   {80,90,92,79,97,97,80,70,80,80,88,85,82,80,92,93,78,94,79,0,0};
        int olahraga[]={90,94,78,92,93,93,80,85,88,78,88,77,90,79,97,79,80,88,87,0,0};
        int bjawa[] =  {88,78,94,90,80,80,82,88,85,98,98,82,85,90,92,96,98,79,87,0,0};
        int rata[] =   {82,77,79,86,85,88,83,83,84,87,89,87,87,83,86,89,88,88,88,0,0};
        //perulangan inputan
        //outputan        4.Mata Pelajaran yang tidak lulus                                                                                                                                                          4.Mata Pelajaran yang tidak lulus
        do{
        System.out.print("========SMKN 2 PROBOLINGGO=========\n1.Tambah data\n2.Rata-Rata Tertinggi\n3.Rata-Rata Terendah\n4.Mata Pelajaran LULUS / Tidak LULUS\n5.Cetak Rapor\n6.Siswa Lulus / Tidak\n7.Nilai per Mapel\n8.Mata Matapelajaran\n9.Exit\n===================================\nPilih Menu = ");
        int plh = ab.nextInt();
        counter--;
        //output plh==1
        if (plh==5){
            System.out.print("\n===================================\n1.Nama Siswa\n2.Seluruh Siswa\n===================================\nPilih Menu = ");
            int plh2 = ab.nextInt();
            if (plh2==1){
                System.out.print("Masukkan Nama Siswa = ");
                String nama1 = ab.next().toLowerCase(); //inputan auto huruf kecil
                System.out.print("No\tNama\tNIS\t\tAgama\tPKN\tMatematika\tBahasa Indonesia\tBahasa Inggris\tSejarah\tSeniBudaya\tPKWU\tOlahraga\tBahasa Jawa\tRata-Rata\n");
                 for(int a=0; a<=q; a++){
                        if(nama1.equalsIgnoreCase(nama[a])){
                             System.out.println((a-a+1) +"\t"+ nama[a]+"\t"+nis[a]+"\t"+agama[a]+"\t"+pkn[a]+"\t"+mtk[a]+"\t\t"+bind[a]+"\t\t\t"+bing[a]+"\t\t"+sejarah[a]+"\t"+senbud[a]+"\t\t"+pkwu[a]+"\t"+olahraga[a]+"\t\t"+bjawa[a]+"\t\t"+rata[a]);
                        } else{
                            System.out.println("Nama Yang Anda Masukkan Salah");
                            break;
                        }
                 }
                    System.out.println();
                }else if(plh2==2){
                    System.out.println("RAPOR SISWA/I SMKN 2 PROBOLINGGO");
                    System.out.print("No\tNama\tNIS\t\tAgama\tPKN\tMatematika\tBahasa Indonesia\tBahasa Inggris\tSejarah\tSeniBudaya\tPKWU\tOlahraga\tBahasa Jawa\tRata-Rata\n");
                        for(int a=0; a<=q; a++){
                            System.out.println((a+1) +"\t"+ nama[a]+"\t"+nis[a]+"\t"+agama[a]+"\t"+pkn[a]+"\t"+mtk[a]+"\t\t"+bind[a]+"\t\t\t"+bing[a]+"\t\t"+sejarah[a]+"\t"+senbud[a]+"\t\t"+pkwu[a]+"\t"+olahraga[a]+"\t\t"+bjawa[a]+"\t\t"+rata[a]);
                            System.out.println();
                        }
                }
        } else if(plh==2){
            max(rata,nama);
        } else if(plh==3){
            min(rata,nama);
        } else if(plh==4){
            System.out.print("Masukkan Nama Siswa = ");
            String siswa1 = ab.next();
                for(int a=0; a<=q; a++){
                        if(siswa1.equals(nama[a])){
                            for(int b=a; b<=a; b++){
                                if(agama[b]<80){
                                    System.out.println("Mapel Agama TIDAK LULUS");
                                } else{
                                    System.out.println("Mapel Agama LULUS");
                                }
                                break;
                            }
                            for(int c=a; c<=a; c++){
                                if(pkn[c]<80){
                                    System.out.println("Mapel PKN Tidak Lulus");
                                } else{
                                    System.out.println("Mapel PKN LULUS");
                                }
                                break;
                            }
                            for(int d=a; d<=a; d++){
                                if(mtk[d]<80){
                                    System.out.println("Mapel Matematika Tidak Lulus");
                                } else{
                                    System.out.println("Mapel Matematika LULUS");
                                }
                            }
                            for(int e=a; e<=a; e++){
                                if(bind[e]<80){
                                    System.out.println("Mapel Bahasa Indonesia Tidak Lulus");
                                } else{
                                    System.out.println("Mapel Bahasa Indonesia LULUS");
                                }
                                break;
                            }
                            for(int f=a; f<=a; f++){
                                if(bing[f]<80){
                                    System.out.println("Mapel Bahasa Inggris Tidak Lulus");
                                } else{
                                    System.out.println("Mapel Bahasa Inggris LULUS");
                                }
                                break;
                            }
                            for(int g=a; g<=a; g++){
                                if(sejarah[g]<80){
                                    System.out.println("Mapel Sejarah Tidak Lulus");
                                }
                                else{
                                    System.out.println("Mapel Sejarah LULUS");
                                }
                                break;
                            }
                            for(int h=a; h<=a; h++){
                                if(senbud[h]<80){
                                    System.out.println("Mapel Seni Budaya Tidak Lulus");
                                } else{
                                    System.out.println("Mapel Seni Budaya LULUS");
                                }
                                break;
                            }
                            for(int i=a; i<=a; i++){
                                if(pkwu[i]<80){
                                    System.out.println("Mapel PKWU Tidak Lulus");
                                } else{
                                    System.out.println("Mapel PKWU LULUS");
                                }
                                break;
                            }
                            for(int j=a; j<=a; j++){
                                if(olahraga[j]<80){
                                    System.out.println("Mapel Olahraga Tidak Lulus");
                                } else{
                                    System.out.println("Mapel Olahraga LULUS");
                                }
                                break;
                            }
                            for(int k=a; k<=a; k++){
                                if(bjawa[k]<80){
                                    System.out.println("Mapel Bahasa Jawa Tidak Lulus");
                                } else{
                                    System.out.println("Mapel Bahasa Jawa LULUS");
                                }
                                break;
                            }
                        }
                }
        } else if(plh==1){
                for(int a=p; a<=q; a++){
                System.out.print("Masukkan Nama Siswa = ");
                nama[a]=ab.next();
                System.out.print("Masukkan Nomor Induk Siswa = ");
                nis[a]=ab.nextInt();
                System.out.print("Masukkan Nilai Mata Pelajaran Agama = ");
                agama[a]=ab.nextInt();
                System.out.print("Masukkan Nilai Mata Pelajaran Pkn = ");
                pkn[a]=ab.nextInt();
                System.out.print("Masukkan Nilai Mata Pelajaran Matematika = ");
                mtk[a]=ab.nextInt();
                System.out.print("Masukkan Nilai Mata Pelajaran Bahasa Indonesia = ");
                bind[a]=ab.nextInt();
                System.out.print("Masukkan Nilai Mata Pelajaran Bahasa Inggris = ");
                bing[a]=ab.nextInt();
                System.out.print("Masukkan Nilai Mata Pelajaran Sejarah = ");
                sejarah[a]=ab.nextInt();
                System.out.print("Masukkan Nilai Mata Pelajaran Senibudaya = ");
                senbud[a]=ab.nextInt();
                System.out.print("Masukkan Nilai Mata Pelajaran PKWU = ");
                pkwu[a]=ab.nextInt();
                System.out.print("Masukkan Nilai Mata Pelajaran Olahraga = ");
                olahraga[a]=ab.nextInt();
                System.out.print("Masukkan Nilai Mata Pelajaran Bahasa Jawa = ");
                bjawa[a]=ab.nextInt();
                rata[a] = (agama[a]+pkn[a]+mtk[a]+bind[a]+bing[a]+sejarah[a]+senbud[a]+pkwu[a]+olahraga[a]+bjawa[a])/10;
                p++;
                break;
            }
        } else if(plh==6){
            System.out.println("No\tNama\t\tRata-Rata\tLulus / Tidak");
            for(int a=0; a<p; a++){
                if(rata[a]>0&&rata[a]<80){
                    System.out.println((a+1)+"\t"+nama[a]+"\t\t"+rata[a]+"\t\t"+"Tidak LULUS");
                } else if(rata[a]>=80&&rata[a]<=100){
                    System.out.println((a+1)+"\t"+nama[a]+"\t\t"+rata[a]+"\t\t"+"LULUS");
                }
            }
        } else if(plh==7){
            System.out.print("\n===================================\n1.Agama\t\t2.PKN\n3.MTK\t\t4.Bahasa Indonnesia\n5.Bahasa Inggris6.Sejarah\n7.Seni Budaya\t8.PKWU\n9.Olahraga\t10.Bahasa Jawa\n===================================\nPilih Matkul = ");
            int plh2=ab.nextInt();
            switch (plh2){
                case 1:
                    System.out.println("\n===================================\nNo\tNama\t\tAgama");
                    for(int a=0; a<p; a++){
                        System.out.println((a+1)+"\t"+nama[a]+"\t\t"+agama[a]);
                    }
                break;
                case 2:
                    System.out.println("\n===================================\nNo\tNama\t\tPKN");
                    for(int a=0; a<p; a++){
                        System.out.println((a+1)+"\t"+nama[a]+"\t\t"+pkn[a]);
                    }
                break;
                case 3:
                    System.out.println("\n===================================\nNo\tNama\t\tMatematika");
                    for(int a=0; a<p; a++){
                        System.out.println((a+1)+"\t"+nama[a]+"\t\t"+mtk[a]);
                    }
                break;
                case 4:
                    System.out.println("\n===================================\nNo\tNama\t\tBahasa Indonesia");
                    for(int a=0; a<p; a++){
                        System.out.println((a+1)+"\t"+nama[a]+"\t\t"+bind[a]);
                    }
                break;
                case 5:
                    System.out.println("\n===================================\nNo\tNama\t\tBahasa Inggris");
                    for(int a=0; a<p; a++){
                        System.out.println((a+1)+"\t"+nama[a]+"\t\t"+bing[a]);
                    }
                break;
                case 6:
                    System.out.println("\n===================================\nNo\tNama\t\tSejarah");
                    for(int a=0; a<p; a++){
                        System.out.println((a+1)+"\t"+nama[a]+"\t\t"+sejarah[a]);
                    }
                break;
                case 7:
                    System.out.println("\n===================================\nNo\tNama\t\tSeni Budaya");
                    for(int a=0; a<p; a++){
                        System.out.println((a+1)+"\t"+nama[a]+"\t\t"+senbud[a]);
                    }
                break;
                case 8: //
                    System.out.println("\n===================================\nNo\tNama\t\tPKWU");
                    for(int a=0; a<p; a++){
                        System.out.println((a+1)+"\t"+nama[a]+"\t\t"+pkwu[a]);
                    }
                break;
                case 9:
                    System.out.println("\n===================================nNo\tNama\t\tOlahraga");
                    for(int a=0; a<p; a++){
                        System.out.println((a+1)+"\t"+nama[a]+"\t\t"+olahraga[a]);
                    }
                break;
                case 10:
                    System.out.println("\n===================================nNo\tNama\t\tBahasa Jawa");
                    for(int a=0; a<p; a++){
                        System.out.println((a+1)+"\t"+nama[a]+"\t\t"+bjawa[a]);
                    }
                break;
                default:
                    System.out.println("=======PILIHAN ANDA SALAH==========");
                break;
            }
        }else if(plh==8){                                       ///
            System.out.print("=========Mata Pelajaran============\n1.Agama\t\t2.PKN\n3.MTK\t\t4.Bahasa Indonnesia\n5.Bahasa Inggris6.Sejarah\n7.Seni Budaya\t8.PKWU\n9.Olahraga\t10.Bahasa Jawa\n");
            
        } else if(plh==9){
            break;
        } else{
            System.out.println("========INPUTAN TIDAK VALID========");
            counter--;
        }
    }while (counter<=0);
    }
    static void max(int[]rata1,String[]nama1){
        int rata2 = rata1[0];
        String nama2 = nama1[0];
        for(int a=0; a<p||a<q; a++){
            if(rata2<rata1[a]){
                nama2=nama1[a];
                rata2=rata1[a];
            }
        }
        System.out.println("===================================\nRanking 1 Jatuh Kepada "+nama2+" Dengan rata-rata "+rata2+"\n===================================");
    }
    static void min(int []rata1,String[]nama1){
        int rata2 = rata1[0];
        String nama2 = nama1[0];
        for(int a=0; a<=p&&a<=q; a++){
            if(rata2>rata1[a]){
                nama2=nama1[a];
                rata2=rata1[a];
            }
        }
        System.out.println("===================================\nRanking Terakhir Jatuh Kepada "+nama2+" Dengan rata-rata "+rata2+"\n===================================");
    }
}