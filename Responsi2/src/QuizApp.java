/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gellen
 */
public class QuizApp {

    static Scanner input = new Scanner(System.in);
    static Scanner kata = new Scanner(System.in);
    static String[] Soal = new String[10];
    static String[][] Jawab = new String[10][4];
    static String[] Jawaban = new String[10];
    static String[] j = new String[10];
    static int[] rand = new int[10];
    static boolean isRunning = true;

    static void showMenu() {
        System.out.println("========== MENU ==========");
        System.out.println("[1] Mulai Quiz");
        System.out.println("[2] Keluar");
        System.out.print("Pilih Menu > ");
        int p = input.nextInt();

        switch (p) {
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

    static void showQuiz() {
        int f = 0;
        double x = 0;

        dataSoal h = new dataSoal();
        h.soalQuiz();
        
        System.out.print("Masukkan jumlah soal > ");
        int jumlah_soal = input.nextInt();
        if(jumlah_soal > 10){
            System.out.println("\nMaksimal Soal Adalah 10");
        } else {
            int[] soalAcak = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            shuffleArray(soalAcak);

            int benar = 0;
            int salah = 0;

            for (int a = 0; a < jumlah_soal; a++) {
                int no_soal = a + 1;
                System.out.println("Soal ke-" + no_soal);
                System.out.println(Soal[soalAcak[a]]);
                for (int b = 0; b < Jawab[0].length; b++) {
                    System.out.println(Jawab[soalAcak[a]][b]);
                }
                System.out.print("Jawaban > ");
                j[soalAcak[a]] = kata.nextLine();
                j[soalAcak[a]] = j[soalAcak[a]].toUpperCase();
                if (Jawaban[soalAcak[a]].equals(j[soalAcak[a]])) {
                    f += 1;
                    benar = benar + 1;
                    x = x + (double) 10 / jumlah_soal;
                } else {
                    f += 0;
                    salah = salah + 1;
                }
            }

            System.out.println("\nJumlah jawaban benar : " + benar);
            System.out.println("Jumlah jawaban salah : " + salah);
            if (jumlah_soal == f) {
                System.out.println("Skor anda : 10");
            } else {
                DecimalFormat desimal = new DecimalFormat("#.##");
                System.out.println("Skor anda : " + desimal.format((double) x));
            }
        }
    }

    public static void shuffleArray(int[] a) {
        int n = a.length;
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            swap(a, i, change);
        }
    }

    static class dataSoal {
        public void soalQuiz() {
            Soal[0] = "Bila beta mau, beta kan melaju meraih semua yang bunda suka. "
                    + "Beta memiliki arti?";
            Jawab[0][0] = "A. Aku, saya";
            Jawab[0][1] = "B. Bunda";
            Jawab[0][2] = "C. Kamu";
            Jawab[0][3] = "D. Anda";

            Soal[1] = "Percakapan dua orang tokoh dalam suatu pertunjukkan disebut?";
            Jawab[1][0] = "A. Prolog";
            Jawab[1][1] = "B. Dialog";
            Jawab[1][2] = "C. Epilog";
            Jawab[1][3] = "D. Monolog";

            Soal[2] = "Daratan yang menjorok ke laut disebut?";
            Jawab[2][0] = "A. Selat";
            Jawab[2][1] = "B. Tanjung";
            Jawab[2][2] = "C. Teluk";
            Jawab[2][3] = "D. Pantai";

            Soal[3] = "Ibu kota provinsi Sumatera Selatan adalah?";
            Jawab[3][0] = "A. Pekanbaru";
            Jawab[3][1] = "B. Medan";
            Jawab[3][2] = "C. Palembang";
            Jawab[3][3] = "D. Padang";

            Soal[4] = "Bandara juanda terdapat di Kota?";
            Jawab[4][0] = "A. Banjarmasin";
            Jawab[4][1] = "B. Palangkaraya";
            Jawab[4][2] = "C. Semarang";
            Jawab[4][3] = "D. Surabaya";

            Soal[5] = "Pulau yang terdapat di tengah Danau Toba adalah pulau?";
            Jawab[5][0] = "A. Sipadan";
            Jawab[5][1] = "B. Samosir";
            Jawab[5][2] = "C. Batam";
            Jawab[5][3] = "D. Bangka";

            Soal[6] = "Gunung Rinjani berada di provinsi?";
            Jawab[6][0] = "A. Nusa Tenggara Timur";
            Jawab[6][1] = "B. Bali";
            Jawab[6][2] = "C. Nusa Tenggara Barat";
            Jawab[6][3] = "D. Jawa Timur";

            Soal[7] = "Orang yang ahli dalam membuat peta disebut?";
            Jawab[7][0] = "A. Kartografer";
            Jawab[7][1] = "B. Kartografi";
            Jawab[7][2] = "C. Koreografer";
            Jawab[7][3] = "D. Fotografer";

            Soal[8] = "Orang yang melakukan kegiatan distribusi disebut?";
            Jawab[8][0] = "A. Produsen";
            Jawab[8][1] = "B. Distributor";
            Jawab[8][2] = "C. Konsumen";
            Jawab[8][3] = "D. Distribusi";

            Soal[9] = "Sungai terpanjang di Indonesia adalah?";
            Jawab[9][0] = "A. Sungai Mahakam";
            Jawab[9][1] = "B. Sungai Barito";
            Jawab[9][2] = "C. Sungai Kapuas";
            Jawab[9][3] = "D. Sungai Kahayan";

            Jawaban[0] = "A";
            Jawaban[1] = "B";
            Jawaban[2] = "B";
            Jawaban[3] = "C";
            Jawaban[4] = "D";
            Jawaban[5] = "B";
            Jawaban[6] = "C";
            Jawaban[7] = "A";
            Jawaban[8] = "B";
            Jawaban[9] = "C";
        }
    }

    private static void swap(int[] a, int i, int change) {
        int helper = a[i];
        a[i] = a[change];
        a[change] = helper;
    }

    public static void main(String[] args) {
        do {
            showMenu();
        } while (isRunning);
    }
}
