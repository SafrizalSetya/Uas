package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class CGV {
    private String IDMovie;
    private int JumTicket;
    private String MovieName;

    public String getIDMovie() {
        return IDMovie;
    }

    public void setIDMovie(String IDMovie) {
        this.IDMovie = IDMovie;
    }

    public int getJumTicket() {
        return JumTicket;
    }

    public void setJumTicket(int jumTicket) {
        JumTicket = jumTicket;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public int getMoviePrice() {
        return MoviePrice;
    }

    public void setMoviePrice(int moviePrice) {
        MoviePrice = moviePrice;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    private int MoviePrice;
    private String UserName;

    public static void main(String[] args) {

        CGV Avatar = new CGV();
        int jumUser = 20;
        Scanner sc = new Scanner(System.in);
        ArrayList<CGV> nontonApa = new ArrayList<>();
        System.out.println("Film yang akan ditonton : ");
        String movieSelect = sc.nextLine();
        ArrayList<String> myUser1 = new ArrayList<>();
        CGV pesanan = new CGV();
        for (int index = 0; index < jumUser; index++) {
            System.out.println("Nama User : ");
            String myUser = sc.nextLine();
            myUser1.add(myUser);
            pesanan.setIDMovie("1");
            pesanan.setJumTicket(jumUser);
            pesanan.setMovieName(movieSelect);
            pesanan.setMoviePrice(55000);
            pesanan.setUserName(String.valueOf(myUser1));
            nontonApa.add(pesanan);
            System.out.println("Nama Penonton " + myUser);
            jumUser--;
            System.out.println("Sisa Tiket " + jumUser);
            System.out.println("Ruangan Bioskop " + "1");
            System.out.println("Filem Yang Akan Di Tonton " + movieSelect);
            System.out.println("Harga Tiket " + 55000);
        }
        for (int index = 0; index < jumUser; index++) {
            System.out.println("Data Penonton" + myUser1);
        }
        // Menampilkan Jumlah penonton movie tertentu
        //pesanan.TotalJumlahPenonton(nontonApa,"Avatar");
    }
}
