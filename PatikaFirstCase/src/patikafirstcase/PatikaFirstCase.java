
package patikafirstcase;

/**
 *z
 * @author Bülent KOPARAL
 */
public class PatikaFirstCase {

  //konsol çıktısı halinde Adı, maaşı, çalışma saati, başlangıç yılı, vergi, bonus, maaş artışı, vergi ve bonuslarla birlikte maaş, toplam maaş değerlerini konsola yazdırma 
    public static void main(String[] args) {
        printTitle("1000 tl den az, 40 saatten az, 10 yıldan az olan");
        printEmployee(new Employee("Bülent", 800, 2, 2));
        
        printTitle("1000 tl den fazla, 40 saatten az, 10 yıldan az olan");
        printEmployee(new Employee("Mehmet", 2200, 39, 9));
        
        printTitle("1000 tl den fazla, 40 saatten az, 10 yıldan fazla olan");
        printEmployee(new Employee("Nihat", 2800, 32, 20));
        
        printTitle("1000 tl den fazla, 40 saatten fazla, 10 yıldan fazla olan");
        printEmployee(new Employee("Abuzer", 1000, 45, 33));
    }
    
    
    private static void printTitle(String title){
        System.out.println("\n\n"+title);
        System.out.println("----------------------------------------------------------");
    }    
    
    
    private static void printEmployee(Employee employe){
        System.out.println(employe);
    }
}
