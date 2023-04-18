package RestoPBO;
import java.util.ArrayList;
import java.util.Scanner;

public class Restoran {
    private static ArrayList<Restoran> daftarRestoran = new ArrayList<>();
    private static ArrayList<Menu> menuu = new ArrayList<>();
    private String namaRestoran;
    private String alamatRestoran;
    private ArrayList<String> daftarMenu;
    private ArrayList<Double> harga;

    public Restoran(String namaRestoran, String alamatRestoran, ArrayList<String> daftarMenu, ArrayList<Double> harga) {
        this.namaRestoran = namaRestoran;
        this.alamatRestoran = alamatRestoran;
        this.daftarMenu = daftarMenu;
        this.harga = harga;
    }

    public Restoran() {

    }

    public String getNama() {
        setNama(namaRestoran);
        return namaRestoran;
    }

    public String getAlamat() {
        return alamatRestoran;
    }

    public ArrayList<String> getDaftarMenu() {
        return daftarMenu;
    }

    public ArrayList<Double> getHarga() {
        return harga;
    }

    public void setNama(String nama) {
        this.namaRestoran = nama;
    }

    public void setAlamat(String alamat) {
        this.alamatRestoran = alamat;
    }

    public void setDaftarMenu(ArrayList<String> daftarMenu) {
        this.daftarMenu = daftarMenu;
    }

    public void setHarga(ArrayList<Double> harga) {
        this.harga = harga;
    }

    public static int size() {
        return 0;
    }

    public static Object get(int i) {
        return null;
    }
    public String toString() {
        return "Restoran || " +
                ", nama=" + namaRestoran + ' ' +
                ", alamat=" + alamatRestoran + ' ';
    }

    public static void tambahRestoran() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> daftarMenu = new ArrayList<>();
        ArrayList<Double> harga = new ArrayList<>();
        System.out.print("Nama Restoran: ");
        String namaRestoran = scanner.nextLine();
        System.out.print("Alamat Restoran: ");
        String alamatRestoran = scanner.nextLine();

        int kembali;
        do {
            System.out.print("Jumlah Menu: ");
            int jumlahMenu = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < jumlahMenu; i++) {
                System.out.print("Nama Menu " + (i + 1) + ": ");
                String menu = scanner.nextLine();
                System.out.print("Harga Menu " + (i + 1) + ": ");
                Double hrg = Double.parseDouble(scanner.nextLine());
                daftarMenu.add(menu);
                harga.add(hrg);
                Menu menubaru = new Menu(daftarMenu, harga);
                menuu.add(menubaru);
            }
            Restoran restoranTambah = new Restoran(namaRestoran, alamatRestoran, daftarMenu, harga);
            daftarRestoran.add(restoranTambah);
            System.out.print("Apakah anda ingin menambah menu lagi? (1 = ya, 2 = tidak) : ");
            kembali = scanner.nextInt();
        }while (kembali == 1);
    }


    public static void hapusRestoran() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama restoran yang ingin dihapus : ");
        String namaRestoran = scanner.next();
        boolean found = false;
        int index = 0;
        for (int i = 0; i < daftarRestoran.size(); i++) {
            if (daftarRestoran.get(i).getNama().equalsIgnoreCase(namaRestoran)) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            daftarRestoran.remove(index);
            System.out.println("Restoran dengan nama " + namaRestoran + " berhasil dihapus");
        }
        else {
            System.out.println("Restoran dengan nama " + namaRestoran + " tidak ditemukan");
        }
    }

    public static void lihatRestoran() {
        if (daftarRestoran.size() > 0) {
            for (int i = 0; i < daftarRestoran.size(); i++) {
                System.out.println(i + 1 + ". " + daftarRestoran.get(i).toString());
            }
        } else {
            System.out.println("Tidak ada restoran yang tersedia!");
        }
    }

    public static void lihatMenu(){
        Scanner scanner = new Scanner(System.in);
        lihatRestoran();
        System.out.print("Masukkan nama restoran yang ingin dilihat menunya :");
        String namaRestoran = scanner.next();
        System.out.println("Daftar Menu di " + namaRestoran + ":");
        for (int i = 0; i < menuu.size(); i++) {
            Menu menu = menuu.get(i);
            System.out.println((i+1) + ". " + menu.getNamaMenu() + "\tRp " + menu.getHargaMenu());
        }
    }
}
