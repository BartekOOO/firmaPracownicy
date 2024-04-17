public class Manager extends Employee{
    protected double przepracowaneDni;
    public  Manager(String imie,String nazwisko,String pesel){
        super(pesel,imie,nazwisko);
        this.dniUrlopuRangi = 50;
        this.przepracowaneDni = 0;
    }

    @Override
    public String obliczPlace(){
        return super.obliczPlace()+" Wynagrodzenie: "+Math.floor(this.przepracowaneDni*640)+" zł";
    }

    @Override
    public String getEmployeeInformation(){
        return "Menadżer "+super.getEmployeeInformation();
    }

    @Override
    public void pracuj(double liczbaGodzin){
        this.przepracowaneDni = this.przepracowaneDni + (liczbaGodzin/24);
    }
}
