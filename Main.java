

import java.util.Scanner;

public class Main {
    public int panjang, lebar;

    // Constructor
    public Main(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method getter
    public int getPanjang(){
        return panjang;
    }

    public int getLebar(){
        return lebar;
    }

    // Method setter
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }

    public void setLebar(int lebar){
        this.lebar = lebar;
    }

    // Method menghitung luas
    public int hitungLuas(){
        return  panjang * lebar;

    }

    // Method getLuas
    public int getLuas(){
        return hitungLuas();
    }

    // Method menghitung keliling
    public int hitungKeliling(){
        return 2 * (panjang + lebar);
    }

    // Method getKeliling
    public int getKeliing(){
        return hitungKeliling();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Main pp = new Main(0,0);

        pp.panjang = input.nextInt();
        pp.lebar = input.nextInt();

        System.out.println("Luas Persegi Panjang (" + pp.panjang + " x " + pp.lebar + ") = " + pp.hitungLuas());
        System.out.println("Keliling Persegi Panjang (" + pp.panjang + " x " + pp.lebar + ") = " + pp.hitungKeliling());
        pp.setPanjang(30);
        pp.setLebar(30);
        System.out.println(pp.hitungLuas());
    }
}
