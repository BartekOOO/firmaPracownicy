import java.util.ArrayList;
import java.util.Comparator;

public class Company {

    private ArrayList<Employee> employees;
    private String name;
    private ArrayList<Dzial> dzialy;
    private ArrayList<String> historiaPlac;

    public Company(String name){
        this.name = name;
        this.employees = new ArrayList<Employee>();
        this.dzialy = new ArrayList<Dzial>();
        this.historiaPlac = new ArrayList<String>();
    }

    public String nazwaFirmy(){
        return this.name;
    }
    public void dodajPracownika(Employee pracownik){
        try{
            if(czyPracownikIstnieje(pracownik)){
                throw new EmployeeAlreadyExistsException("Już się znajduje pracownik z tym peselem",pracownik.imie,pracownik.nazwisko,pracownik.pesel);
            }
            this.employees.add(pracownik);
        }
        catch (EmployeeAlreadyExistsException e){
            System.out.println("§§§Błąd: "+e.getMessage()+" Pracownik: "+e.danePracownika());
        }
    }

    private boolean czyPracownikIstnieje(Employee pracownik){
        for(Employee prac:this.employees){
            if(pracownik.pesel.equals(prac.pesel)){
                return true;
            }
        }
        return false;
    }

    public void dodajDzial(String nazwaDzialu){
        this.dzialy.add(new Dzial(nazwaDzialu));
    }

    public void dzialyLista(){
        int index = 1;
        for(Dzial a:this.dzialy){
            System.out.println(index+". "+a.getName());
            index++;
        }
    }

    public void dzialyListaZPracownikami(){
        int index = 1;
        for(Dzial a:this.dzialy){
            try {
                System.out.println(index + ". " + a.getName() + " - " + a.getManager());
                System.out.println("-------------------");
                System.out.println("Pracownicy dzialu:");
                a.getPracownicyDzialu();
                System.out.println("-------------------");
                index++;
            }
            catch (Exception e){
                System.out.println("§§§Pracownik nie istnieje/został usunięty");
            }
        }
    }

    private boolean czyPracownikNalezyDoFirmy(Employee pracownik){
        for(Employee a:this.employees){
            if(a.equals(pracownik)) {
                return true;
            }
        }
        return false;
    }
    public void dodajDoDzialu(int id,Employee pracownik){
        dzialy.get(id - 1).dodajDoDzialu(pracownik);
        if(!czyPracownikNalezyDoFirmy(pracownik)) {
            dodajPracownika(pracownik);
        }
    }
    public void listaPracownikow(){
        int index = 1;
        for(Employee pracownik:this.employees){
            try{
            System.out.println(index+". "+pracownik.getEmployeeInformation());
            index++;
            }
            catch (Exception e){
                System.out.println("§§§Pracownik nie istnieje/został usunięty");
            }
        }
    }

    public void obliczPlace(int idPracownika){
        try {
            String placa = this.employees.get(idPracownika-1).obliczPlace();
            System.out.println(placa);
            this.historiaPlac.add(placa);
        }
        catch (Exception e){
            System.out.println("§§§Błąd, nie można obliczyć płacy dla pracownika");
        }
    }

    public void pracuj(int idPracownika,int liczbaGodzin){
        this.employees.get(idPracownika-1).pracuj(liczbaGodzin);
    }

    public void dodajDniUrlopu(int dni,int idPracownika){
        try {
            if(this.employees.get(idPracownika-1).dniUrlopu+dni>this.employees.get(idPracownika-1).dniUrlopuRangi)
            {
                throw new VacationLimitExceededException("§§§Ten pracownik nie moze miec az tyle dni urlopu",this.employees.get(idPracownika-1).imie,this.employees.get(idPracownika-1).nazwisko,this.employees.get(idPracownika-1).pesel);
            }
            this.employees.get(idPracownika - 1).dodajDniUrlopu(dni);
        }
        catch (VacationLimitExceededException e){
            System.out.println(e.getMessage());
        }
    }

    public void historiaWyplat(){
        int index = 1;
        System.out.println("<-------------------->");
        System.out.println("Historia wyplat");
        for(String log:this.historiaPlac){
            System.out.println(index+". "+log);
            index++;
        }
        System.out.println("<-------------------->");

    }

    public void usunPracownika(int id){
        try {
            this.employees.set(id - 1, null);
        }
        catch (Exception e){
            System.out.println("§§§Id które podajesz jest błędne");
        }
    }
}
