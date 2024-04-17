import java.util.ArrayList;

public class Dzial {

    private ArrayList<Employee> employees;
    private Employee menadzer;
    private String name;
    public Dzial(String nazwaDzialu){
        this.name = nazwaDzialu;
        this.menadzer = null;
        this.employees = new ArrayList<Employee>();
    }

    public void dodajDoDzialu(Employee pracownik){
        if(pracownik instanceof Manager){
            this.menadzer = (Manager) pracownik;
        }else{
            try {
                if(czyPracownikIstnieje(pracownik)){
                    throw new EmployeeAlreadyExistsException("§§§Pracownik którego póbujesz dodać do działu już tam jest",pracownik.imie,pracownik.nazwisko, pracownik.pesel);
                }
                this.employees.add(pracownik);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
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

    public String getName(){
        return this.name;
    }

    public String getManager(){
        if(menadzer == null){
            return "Dzial nie ma przypisanego menadzera";
        }
        return this.menadzer.getEmployeeInformation();
    }

    public void getPracownicyDzialu(){
        int index = 0;
        for(Employee pracownik:this.employees){
            index++;
            System.out.println(index+". "+pracownik.getEmployeeInformation());
        }
        if(index==0){
            System.out.println("Dzial nie posiada pracownikow");
        }
    }

}
