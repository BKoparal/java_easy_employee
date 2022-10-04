
 package patikafirstcase;

import java.text.DecimalFormat;

/**
 *
 * @author Bülent KOPARAL
 */
 //Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız. 
public class Employee {
    //4 nitelik
    private final String Name;        //Çalışanın adı ve soyadı
    private final double salary;      //Çalışanın maaşı
    private final int workHours;      //Haftalık çalışma saati
    private final int hireYear;       //İşe başlangıç yılı
    
    
    
    //5 metod
    
    //1. Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
    public Employee(String Name, double salary, int workHours, int hireYear) {
        this.Name = Name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    
    
    
    
    
    //2.tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
    public double tax(){
        //Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır. Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
        return this.salary>999?this.salary*0.03:0;
    }
    
    
    
    
    
    //3.bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
    public int bonus(){
        return this.workHours>40?(this.workHours-40)*30:0;
    }
    
    
    
    
    
    //4.raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın. 
    //Not: raiseSalary() hesaplarken vergi ve bonusları dikkate almalısınız.
    public double raiseSalary(){
        final int workYear=2021-hireYear;
        //Not: raiseSalary() hesaplarken vergi ve bonusları dikkate almalısınız.
        double updatedSalary=this.salary-this.tax()+this.bonus();
        //Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        if(workYear<10) return updatedSalary*0.05;
        //Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        if(workYear<20) return updatedSalary*0.10;
        //Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
        return updatedSalary*0.15;
    }
    
    
    
    

    //5. toString() : Çalışana ait bilgileri ekrana bastıracaktır.
    @Override
    public String toString() {
        double raiseSalary=this.raiseSalary();
        DecimalFormat df=new DecimalFormat("#0.00");
        return  "Name\t\t\t\t: " + Name +                                                               //Adı
                "\nSalary\t\t\t\t: " + df.format(salary) + " TL"+                                       //maaşı
                "\nWorkHours\t\t\t: " + workHours + " hours"+                                           //çalışma saati
                "\nHireYear\t\t\t: " + hireYear + " years"+                                              //başlangıç yılı
                "\nTax\t\t\t\t: "+df.format(this.tax())+" TL"+                                          //vergi
                "\nBonus\t\t\t\t: "+df.format(this.bonus())+ " TL"+                                     //bonus
                "\nSalary Inc\t\t\t: "+df.format(raiseSalary)+" TL"+                        //maaş artışı
                "\nSalary with Tax and Bonus\t: "+df.format(this.salary-this.tax()+this.bonus())+ " TL"+        //vergi ve bonuslarla birlikte maaş
                "\nTotal Salary\t\t\t: "+df.format(raiseSalary)+" TL";                                  //toplam maaş
    }
    
}
