public abstract class Employee {

    protected  String pesel;
    protected String nazwisko;
    protected String imie;
    protected int dniUrlopu;
    protected int dniUrlopuRangi;
    public Employee(String pesel,String imie,String nazwisko){
        this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dniUrlopu = 0;
        this.dniUrlopuRangi = 0;
        if(this.pesel.length()>9){
            this.pesel.substring(0,8);
        }
    }
    protected String getEmployeeInformation(){
        return this.imie+" "+this.nazwisko+" PESEL: "+this.pesel+" Dni urlopu: "+this.dniUrlopu;
    }
    protected int getDniUrlopu(){
        return this.dniUrlopu;
    }
    protected String getPesel(){
        return this.pesel;
    }
    protected void dodajDniUrlopu(int iloscDni){
        this.dniUrlopu = this.dniUrlopu + iloscDni;
    }

    protected String obliczPlace(){
        return this.imie+" "+this.nazwisko+" "+this.pesel;
    }

    protected void pracuj(double liczbaGodzin){
        System.out.println("Błąd");
    }


}
