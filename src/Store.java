import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Store {

    private List<Brand> brandList;
    private List<Phone> phoneList;
    private List<NoteBook> noteBookList;
    Scanner scanner;


    // const.
    public Store() {
        this.brandList = new ArrayList<>();
        this.phoneList = new ArrayList<>();
        this.noteBookList = new ArrayList<>();
        scanner = new Scanner(System.in);

        brandList.add(new Brand(1, "-\tSamsung"));
        brandList.add(new Brand(2, "-\tLenova"));
        brandList.add(new Brand(3, "-\tApple"));
        brandList.add(new Brand(4, "-\tHuawei"));
        brandList.add(new Brand(5, "-\tCasper"));
        brandList.add(new Brand(6, "-\tAsus"));
        brandList.add(new Brand(7, "-\tHP"));
        brandList.add(new Brand(8, "-\tXiaomi"));
        brandList.add(new Brand(9, "-\tMonster"));
        System.out.println();
        Collections.sort(brandList); // sıralama

    }

    public boolean showMenu() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("----------------------PatikaStore Ürün Yönetim Paneli-------------------- ");
        System.out.println("------------------------------------------------------------------------");
        while (true) {
            System.out.println();
            System.out.println("1-Notebook Ekleme İşlemleri");
            System.out.println("2-Cep Telefonu Ekleme İşlemleri");
            System.out.println("3-Ürün Silme İşlemleri");
            System.out.println("4-Marka Listeleme İşlemleri");
            System.out.println("0-Çıkış Yap !");
            System.out.print("---------------> Lütfen bir işlem seçiniz : ");
            int choise = scanner.nextInt();

            switch (choise) {
                case 0:
                    System.out.print("Çıkış yapılıyor...");
                    return false;
                case 1:
                    System.out.println("Notebook Ekleme");
                    addProduct(1);
                    listProductNoteBook();
                    break;
                case 2:
                    System.out.println("Cep Telefonu Ekleme");
                    addProduct(2);
                    listProductsPhone();
                    break;
                case 3:
                    System.out.println("Ürün siliniyor !");
                    System.out.print("Lütfen silmek istediğiniz ürünü seçiniz : ");
                    int removeID = scanner.nextInt();
                    deleteProduct(removeID);
                    listProductNoteBook();
                    listProductsPhone();
                    break;
                case 4:
                    System.out.println("----------MARKALAR----------");
                    listBrands();  // markalar
                    break;
                default:
                    System.out.println("Geçersiz Giriş !");
                    break;
            }
        }
    }

    public void listBrands() {
        for (Brand brand : brandList) {
            System.out.println(brand.getBrandName());
        }
    }

    public void addProduct(int choice) {
        System.out.print("Ürün adı giriniz :");
        String name = scanner.next();
        scanner.nextLine();


        System.out.print("Ürün adet fiyatını giriniz :");
        double unitPrice = scanner.nextDouble();
        System.out.print("Stok adetini giriniz :");
        int stockAmount = scanner.nextInt();
        System.out.print("İndirim oranını giriniz : ");
        double discountRate = scanner.nextDouble();
        scanner.nextLine();


        System.out.print("Rengini giriniz :");
        String color = scanner.next();
        System.out.print("Marka ID giriniz : ");
        int brandID = scanner.nextInt();
        Brand brand = getBrandID(brandID);

        if (brand != null) {
            if (choice == 1) {
                System.out.print("Ekran boyutu");
                double screenSize = scanner.nextDouble();
                System.out.print("RAM : ");
                int ram = scanner.nextInt();
                System.out.print("Depolama : ");
                int storage = scanner.nextInt();


                NoteBook noteBook = new NoteBook(name, unitPrice, discountRate, stockAmount, brand, color, screenSize, ram, storage);
                addNotebook(noteBook);
            } else if (choice == 2) {
                System.out.print("Hafıza : ");
                int memory = scanner.nextInt();
                System.out.print("Ekran Boyutu : ");
                double screenSize = scanner.nextDouble();
                System.out.print("Pil gücü : ");
                int battery = scanner.nextInt();
                System.out.print("RAM : ");
                int ram = scanner.nextInt();

                Phone phone = new Phone(name, unitPrice, discountRate, stockAmount, brand, memory, screenSize, battery, ram, color);
                addMobilePhone(phone);

            } else {
                System.out.println("Geçersiz seçim !");
            }
        }
    }

    public Brand getBrandID(int id) {
        for (Brand brand : brandList) {
            if (brand.getBrandID() == id) {
                return brand;
            }
        }
        return null;
    }

    public void addNotebook(NoteBook noteBook) {
        if (noteBook != null) {
            noteBookList.add(noteBook);
        }
    }

    public void addMobilePhone(Phone phone) {
        if (phone != null) {
            phoneList.add(phone);
        }
    }

    public void deleteProduct(int productID) {
        noteBookList.removeIf(noteBook -> noteBook.getId() == productID);
        phoneList.removeIf(phone -> phone.getId() == productID);
    }

    public void listProductNoteBook() {
        System.out.println("------Notebook Listesi---------");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("| %-3s | %-20s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |%n",
                "ID", "Ürün Adı", "Fiyat", "İndirim", "Stok",
                "Marka", "Renk", "Ekran", "RAM", "Depolama");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        for (NoteBook noteBook : noteBookList) {
            System.out.format("| %-3d | %-20s | %-10.1f | %-10.1f | %-10d | %-10s | %-10s | %-10.1f | %-10d | %-10d |%n",
                    noteBook.getId(), noteBook.getName(), noteBook.getUnitPrice(), noteBook.getDiscountRate(), noteBook.getStockAmount(),
                    noteBook.getBrand().getBrandName(), noteBook.getColor(), noteBook.getScreenSize(), noteBook.getRam(), noteBook.getStorage());
            System.out.println("---------------------------------------------------------------------------------------------------------------");
        }

    }

    public void listProductsPhone() {
        System.out.println("-------Cep Telefonu Listesi--------");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("| %-3s | %-20s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |%n",
                "ID", "Ürün Adı", "Fiyat", "İndirim", "Stok",
                "Marka", "Renk", "Ekran", "RAM", "Batarya");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        for (Phone phone : phoneList) {
            System.out.format("| %-3d | %-20s | %-10.1f | %-10.1f | %-10d | %-10s | %-10s | %-10.1f | %-10d | %-10d |%n",
                    phone.getId(), phone.getName(), phone.getUnitPrice(), phone.getDiscountRate(), phone.getStockAmount(),
                    phone.getBrand().getBrandName(), phone.getColor(), phone.getScreenSize(), phone.getRam(), phone.getBattery());
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        }

    }



}























