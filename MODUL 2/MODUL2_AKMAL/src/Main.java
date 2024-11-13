public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputer = new Komputer(30, "Ajinomoto", 5000);
        // To do: Panggillah Method Informasi dari class Komputer
        komputer.Informasi();

        System.out.println("=====================================");
        System.out.println(" ");


        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP komputerVIP = new KomputerVIP(10, "Ajinomoto", 20000, true);
        // To do: Panggillah Method Informasi dari class KomputerVIP
        komputerVIP.Informasi();
        // To do: Panggillah Method Login
        komputerVIP.Login("Akmal");
        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        komputerVIP.Bermain(3);
        komputerVIP.Bermain(3, 25);

        System.out.println("=====================================");
        System.out.println(" ");


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium komputerPremium = new KomputerPremium(5, "Ajinomoto", 25000, false);
        // To do: Panggillah Method Informasi dari class KomputerPremium
        komputerPremium.Informasi();
        // To do: Panggillah Method Pesan
        komputerPremium.Pesan(21);
        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
        komputerPremium.TambahLayanan("Mie Goreng Rebus");
        komputerPremium.TambahLayanan("Indomie Goreng Rebus", " Es Jeruk");
       
    }
}