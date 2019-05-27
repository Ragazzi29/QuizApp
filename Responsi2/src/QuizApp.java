/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;


/**
 *
 * @author Gellen
 */
public class QuizApp {
    
    static Scanner input = new Scanner(System.in);
    static String[] Soal = new String[5];
    static String[][] Jawab = new String[5][4];
    static String[] Jawaban = new String[5];
    static String[] j = new String[5];
    static boolean isRunning = true;
    
    static void showMenu(){
        System.out.println("========== MENU ==========");
        System.out.println("[1] Mulai Quiz");
        System.out.println("[2] Keluar");
        System.out.print("Pilih Menu > ");
        int p = input.nextInt();
        
        switch(p){
            case 1:
                showQuiz();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan salah");
            
        }
    }
    
    static void showQuiz(){
        int f = 0;
        Soal[0] = "\n1. Bila beta mau, beta kan melaju meraih semua yang bunda suka. "
                + "Beta memiliki arti?";
        Jawab[0][0] = "A. Aku, saya";
        Jawab[0][1] = "B. Bunda";
        Jawab[0][2] = "C. Kamu";
        Jawab[0][3] = "D. Anda";
        
        Soal[1] = "\n2. Percakapan dua orang tokoh dalam suatu pertunjukkan disebut?";
        Jawab[1][0] = "A. Prolog";
        Jawab[1][1] = "B. Dialog";
        Jawab[1][2] = "C. Epilog";
        Jawab[1][3] = "D. Monolog";
        
        Soal[2] = "\n3. Daratan yang menjorok ke laut disebut?";
        Jawab[2][0] = "A. Selat";
        Jawab[2][1] = "B. Tanjung";
        Jawab[2][2] = "C. Teluk";
        Jawab[2][3] = "D. Pantai";
        
        Soal[3] = "\n4. Ibu kota provinsi Sumatera Selatan adalah?";
        Jawab[3][0] = "A. Pekanbaru";
        Jawab[3][1] = "B. Medan";
        Jawab[3][2] = "C. Palembang";
        Jawab[3][3] = "D. Padang";
        
        Soal[4] = "\n5. Bandara juanda terdapat di Kota?";
        Jawab[4][0] = "A. Banjarmasin";
        Jawab[4][1] = "B. Palangkaraya";
        Jawab[4][2] = "C. Semarang";
        Jawab[4][3] = "D. Surabaya";
        
        Jawaban[0] = "A";
        Jawaban[1] = "B";
        Jawaban[2] = "B";
        Jawaban[3] = "C";
        Jawaban[4] = "D";
        
        for(int a = 0; a < Soal.length; a++){
            System.out.println(Soal[a]);
            for(int b = 0; b < Jawab[0].length; b++){
                System.out.println(Jawab[a][b]);
                
            }
            System.out.print("Jawaban > ");
            j[a] = input.nextLine();
            j[a] = j[a].toUpperCase();
            if(Jawaban[a].equals(j[a])){
                f += 2;
            } else {
                f += 0;
            }
        }
        
        System.out.println("Skor anda : "+f);
    }
    
    static void tambahSoalQuiz(){}
    
    public static void main(String[] args){
        do{
            showMenu();
        } while(isRunning);
    }
}
