package RestoPBO;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Login user_login = new Login();
        RestoPBO.Restoran restoran = new RestoPBO.Restoran();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        boolean berhasilLogin = false;
            System.out.println("=========LOGIN============");
        do {
            boolean masuk = true;
            System.out.print("UserName : ");
            String user = bf.readLine();
            System.out.print("Password : ");
            String pw = bf.readLine();
            System.out.println("==========================");

            if (user.equals(user_login.getUser()) && pw.equals(user_login.getPw_user()) || user.equals(user_login.getAdmin()) && pw.equals(user_login.getPw_admin())) {
                int loginkembali;
                if (user.equals(user_login.getUser())) {
                    System.out.println("======MENU CUSTOMER======");
                    do{
                        System.out.println("1. Lihat Restaurant");
                        System.out.println("2. Buat Pesanan");
                        System.out.println("3. Lihat Pesanan");
                        System.out.println("4. Kembali ke login");
                        System.out.print("Pilihlah aksi yang Anda inginkan :");
                        String choice = bf.readLine();
                        switch (choice){
                            case"1":
                                restoran.viewMenu();
                                break;
                        }
                        System.out.print("Login lagi? (1 = ya, 2 = tidak) : ");
                        loginkembali = scanner.nextInt();
                    }while(loginkembali==2);

                } else if (user.equals(user_login.getAdmin())) {
                    System.out.println("======MENU ADMIN======");
                    do {
                        System.out.println("1. Lihat daftar restoran");
                        System.out.println("2. Tambah restoran");
                        System.out.println("3. Hapus restoran");
                        System.out.println("4. Kembali ke login");
                        System.out.print("Pilihlah aksi yang Anda inginkan : ");
                        String choice = bf.readLine();
                        switch (choice) {
                            case "1":
                                restoran.viewRestoran();
                                break;

                            case "2":
                                restoran.addRestoran();
                                break;

                            case "3":
                                restoran.delRestoran();
                                break;

                            case "4":
                                masuk = false;
                                break;
                        }
                        System.out.print("Login lagi? (1 = ya, 2 = tidak) : ");
                        loginkembali = scanner.nextInt();
                    } while (loginkembali==2);
                }
            } else {
                System.out.println("Username atau Password Anda salah, coba lagi!");
            }
        } while (!berhasilLogin);
    }
}