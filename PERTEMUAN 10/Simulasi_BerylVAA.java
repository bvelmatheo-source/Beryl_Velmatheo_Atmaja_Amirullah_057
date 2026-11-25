package com.main.simulasi_berylvaa;

import java.util.Scanner;
public class Simulasi_BerylVAA {
    
    public static boolean CekKabisat(int Tahun){
        return (Tahun %4==0 && Tahun %100 !=0) || (Tahun % 400==0);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("masukkan banyak tahun yang akan diinputkan= ");
        int n = input.nextInt();
                
        int[] Tahun= new int[n];
        
        System.out.print("Masukkan masing-masing tahun= ");
        for (int i=0;i<n;i++){
            Tahun[i]= input.nextInt();
            
         for ( i=0;i<n;i++){
             int x=Tahun[i];
         
         if(CekKabisat(x)){
             System.out.println("Tahun " +x+ " adalah tahun kabisat");
         }
            else {
             int TahunDepan=x +1;
             while (!CekKabisat(TahunDepan));
             TahunDepan++;}
             
             int TahunMundur=x-1;
             while (!CekKabisat(TahunMundur));
             TahunMundur--;}
         
         int JarakTahunDepan=TahunDepan-x;
         int JarakTahunMundur=TahunMundur-x;
         
         if(JarakTahunDepan<=JarakTahunMundur){
             System.out.println("Tahun " +TahunDepan+ "adalah tahun kabisat terdekat dari" +x );
         }
         else(JarakTahunMundur<=JarakTahunDepan);{
             System.out.println("Tahun " +TahunMundur+ " adalah tahun kabisat terdekat dari" +x);
         }
         input.close();
        }
    }
}
