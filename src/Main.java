public class Main {
    public static void main(String[] args) {

    Company firma = new Company("Śmiecioland");

    firma.dodajDzial("Wywozka smieci");
    firma.dodajDzial("Kierowcy smieciarek");
    firma.dodajDzial("Krematorzy");

    Employee menadzer1 = new Manager("Arnold","Boczek","123456789");
    Employee menadzer2 = new Manager("Tomisław","Bahleta-Faryl","234567890");
    Employee menadzer3 = new Manager("Domino","Jachas","345678901");


    Employee pracownik1 = new SalariedEmployee("Waldemar","Walo","567890123",0.75);
    Employee pracownik2 = new SalariedEmployee("Jakub","Polak","678901234",0.5);
    Employee pracownik3 = new HourlyEmployee("Ambrozy","Kleks","789012345");
    Employee pracownik4 = new HourlyEmployee("Mariusz","Pudzianowski","890123456");
    Employee pracownik5 = new SalariedEmployee("Tytus","Bomba","456789012",1);
    Employee pracownik6 = new HourlyEmployee("Gabriel","Narutowicz","567880123");
    Employee pracownik7 = new SalariedEmployee("Adrian","Buczyński","674901234",2);

    firma.dodajDoDzialu(1,menadzer1);
    firma.dodajDoDzialu(1,pracownik1);
    firma.dodajDoDzialu(1,pracownik2);
    firma.dodajDoDzialu(1,pracownik3);

    firma.dodajDoDzialu(2,menadzer2);
    firma.dodajDoDzialu(2,pracownik4);
    firma.dodajDoDzialu(2,pracownik5);

    firma.dodajDoDzialu(3,menadzer3);
    firma.dodajDoDzialu(3,pracownik5);
    firma.dodajDoDzialu(3,pracownik6);
    firma.dodajDoDzialu(3,pracownik7);
    firma.dodajDoDzialu(3,pracownik7);


    firma.pracuj(8,40);
    firma.pracuj(7,50);
    firma.pracuj(3,98);
    firma.pracuj(5,30);




    firma.dodajPracownika(pracownik1);


    firma.dzialyListaZPracownikami();


    firma.listaPracownikow();

    firma.dodajDniUrlopu(6,8);
    firma.dodajDniUrlopu(2,7);
    firma.dodajDniUrlopu(14,3);
    firma.dodajDniUrlopu(6,5);

    firma.obliczPlace(8);
    firma.obliczPlace(7);
    firma.obliczPlace(3);
    firma.obliczPlace(5);

    firma.historiaWyplat();

    firma.usunPracownika(9);

    firma.listaPracownikow();

    firma.dodajDniUrlopu(1000,8);
    }
}