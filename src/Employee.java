public class Employee {
    String name;
    int salary;
    int workHours;
    int hierYear;

    Employee(String name,int salary,int workHours,int hierYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hierYear=hierYear;
    }
    double tax(){
        double isTax = 0;
        if (this.salary>=1000){
            isTax =  (salary * 0.03);
        }
        return isTax;
    }

    double bonus() {
        double isBonus=0;
        if (this.workHours>40){
            isBonus=(this.workHours-40)*30;
            return isBonus;
        }
        return isBonus;
    }

    double riceSalary(){
        int year=2021;
        double rice=0.0;
        if (year-this.hierYear<10){
            return rice+=salary*0.05;
        }else if (year-this.hierYear>9 && year-this.hierYear<20){
            return rice+=this.salary*0.1;
        }else
            return rice+=this.salary*0.15;
    }

    public void toPrint(){
        System.out.println("Adi  :"+this.name);
        System.out.println("Maasi  :"+this.salary);
        System.out.println("Haftalik calisma saati  :"+this.workHours);
        System.out.println("Baslangic yili  :"+this.hierYear);
        System.out.println("Vergi    :"+tax());
        System.out.println("Bonus  :"+bonus());
        System.out.println("Maas artisi  :"+riceSalary());
        System.out.println("Vergi ve Bonus ile Toplam maas  :"+(-tax()+bonus()+this.salary));
        System.out.println("Bu Ayki Toplam maas  :"+(-tax()+bonus()+this.salary+riceSalary()));

    }
}
