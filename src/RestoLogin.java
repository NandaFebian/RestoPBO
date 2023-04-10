import java.util.Scanner;

public class RestoLogin {
    public static void main(String[] args) {
        String adminUsername = "admin";
        String adminPassword = "admin";
        String customerUsername = "nanda";
        String customerPassword = "nanda";

        Scanner input = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("                   L O G I N                   ");
        System.out.print("Masukkan username: ");
        String inputUsername = input.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = input.nextLine();
        System.out.println("===============================================");


        if (inputUsername.equals(adminUsername) && inputPassword.equals(adminPassword)) {
            System.out.println("Selamat datang, admin!");
            //tampilan ketika berhasil login sebagai admin
        } else if (inputUsername.equals(customerUsername) && inputPassword.equals(customerPassword)) {
            System.out.println("Selamat datang, pelanggan!");
            //tampilan ketika berhasil login sebagai pelanggan
        } else {
            System.out.println("Login gagal. Silahkan coba lagi.");
        }
    }
}