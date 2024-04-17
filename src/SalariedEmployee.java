public class SalariedEmployee extends Employee{
    protected double etat;
    protected double godzinyPracy;
    public  SalariedEmployee(String imie,String nazwisko,String pesel,double etat){
        super(pesel,imie,nazwisko);
        this.dniUrlopuRangi = 20;
        this.etat = etat;
        this.godzinyPracy = 0;
    }

    @Override
    public String getEmployeeInformation(){
        return "Pracownik etatowy "+super.getEmployeeInformation();
    }

    @Override
    public String obliczPlace(){
        return super.obliczPlace()+" Wynagrodzenie: "+Math.floor((this.godzinyPracy*90)*this.etat)+" zł";
    }

    @Override
    public void pracuj(double liczbaGodzin){
        this.godzinyPracy = this.godzinyPracy + liczbaGodzin;
    }

}
