public class HourlyEmployee extends Employee{

    protected double przepracowaneGodziny;
    public  HourlyEmployee(String imie,String nazwisko,String pesel){
        super(pesel,imie,nazwisko);
        this.dniUrlopuRangi = 25;
    }

    @Override
    public String obliczPlace(){
        return super.obliczPlace()+" Wynagrodzenie: "+Math.floor(this.przepracowaneGodziny*90)+" zł";
    }

    @Override
    public String getEmployeeInformation(){
        return "Pracownik godzinny "+super.getEmployeeInformation();
    }

    @Override
    public void pracuj(double liczbaGodzin){
        this.przepracowaneGodziny = this.przepracowaneGodziny + liczbaGodzin;
    }

}
