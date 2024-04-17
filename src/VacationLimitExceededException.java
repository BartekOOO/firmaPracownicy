public class VacationLimitExceededException extends Exception{

    public String imie;
    public String nazwisko;
    public String pesel;
    public VacationLimitExceededException(String napis,String imie,String nazwisko,String pesel){
        super(napis);
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public String danePracownika(){
        return this.imie+" "+this.nazwisko+" PESEL: "+this.pesel;
    }
}
