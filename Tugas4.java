import java.util.Scanner;

class Atlet {
}

public class Tugas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahCabang = 4;
        int jumlahAtletPerCabang = 5;

        String[][] daftarAtlet = new String[jumlahCabang][jumlahAtletPerCabang];

        inputAtlet(daftarAtlet, scanner, "Badminton", 0);
        inputAtlet(daftarAtlet, scanner, "Tenis Meja", 1);
        inputAtlet(daftarAtlet, scanner, "Basket", 2);
        inputAtlet(daftarAtlet, scanner, "Voli", 3);

    
        System.out.println("Daftar Atlet Porseni 2024 (diurutkan secara ascending):");
        tampilkanDaftarAtlet(daftarAtlet);
    }

    static void inputAtlet(String[][] daftarAtlet, Scanner scanner, String cabor, int indexCabang) {
        for (int i = 0; i < daftarAtlet[indexCabang].length; i++) {
            System.out.print("Masukkan nama atlet " + cabor + " ke-" + (i + 1) + ": ");
            String namaAtlet = scanner.nextLine();
            daftarAtlet[indexCabang][i] = namaAtlet;
        }
    }

    static void tampilkanDaftarAtlet(String[][] daftarAtlet) {
        for (int i = 0; i < daftarAtlet.length; i++) {
            for (int j = 0; j < daftarAtlet[i].length; j++) {
                System.out.println("Cabang " + (i + 1) + ": " + daftarAtlet[i][j]);
            }
        }
    }
}
