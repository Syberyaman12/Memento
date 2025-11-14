public class Main {
    public static void main(String[] args) {
        person osoba = new person("Jakub", "Panek", "04.04.2006", "Santok", "email@wp.pl", 668616106);
        Caretaker caretaker = new Caretaker();

        caretaker.addMemento(osoba.saveStateToMemento());

        osoba.setImie("Wojciech");
        osoba.setNazwisko("Błajda");
        osoba.setDataUrodzenia("05.11.2000");
        osoba.setMiejsceUrodzenia("kraków");
        osoba.setEmail("wojciechblajda@gmail.com");
        osoba.setPhoneNumber(123456789);

        caretaker.addMemento(osoba.saveStateToMemento());

        osoba.setImie("Adam");
        osoba.setNazwisko("Małysz");
        osoba.setDataUrodzenia("03.09.2001");
        osoba.setMiejsceUrodzenia("Gorzów");
        osoba.setEmail("adammalysz@wp.com");
        osoba.setPhoneNumber(123123123);


        System.out.println("aktualny stan: " + osoba.getImie() + " "
                + osoba.getNazwisko() + " "
                + osoba.getDataUrodzenia() + " "
                + osoba.getMiejsceUrodzenia() + " "
                + osoba.getEmail() + " "
                + osoba.getPhoneNumber() + " ");


        osoba.getStateFromMemento(caretaker.getMemento(0));
        System.out.println("przywrócony stan: " + osoba.getImie() + " "
                + osoba.getNazwisko() + " "
                + osoba.getDataUrodzenia() + " "
                + osoba.getMiejsceUrodzenia() + " "
                + osoba.getEmail() + " "
                + osoba.getPhoneNumber() + " ");

        osoba.getStateFromMemento(caretaker.getMemento(1));
        System.out.println("przywrócony stan: " + osoba.getImie() + " "
                + osoba.getNazwisko() + " "
                + osoba.getDataUrodzenia() + " "
                + osoba.getMiejsceUrodzenia() + " "
                + osoba.getEmail() + " "
                + osoba.getPhoneNumber() + " ");

    }
}