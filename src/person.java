public class person {
    private String imie, nazwisko, dataUrodzenia, miejsceUrodzenia, email;
    private Integer phoneNumber;

    public person(String imie, String nazwisko, String dataUrodzenia, String miejsceUrodzenia, String email, Integer phoneNumber) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.miejsceUrodzenia = miejsceUrodzenia;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getMiejsceUrodzenia() {
        return miejsceUrodzenia;
    }

    public void setMiejsceUrodzenia(String miejsceUrodzenia) {
        this.miejsceUrodzenia = miejsceUrodzenia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Memento saveStateToMemento() {
        return new Memento(imie, nazwisko, dataUrodzenia, miejsceUrodzenia, email, phoneNumber);
    }

    public void getStateFromMemento(Memento memento) {
        imie = memento.getImie();
        nazwisko = memento.getNazwisko();
        dataUrodzenia = memento.getDataUrodzenia();
        miejsceUrodzenia= memento.getMiejsceUrodzenia();
        email = memento.getEmail();
        phoneNumber = memento.getPhoneNumber();
    }

    public static class Memento {
        private final String imie, nazwisko, dataUrodzenia, miejsceUrodzenia, email;
        private final Integer phoneNumber;
        public Memento(String imie, String nazwisko, String dataUrodzenia, String miejsceUrodzenia, String email, Integer phoneNumber) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.dataUrodzenia = dataUrodzenia;
            this.miejsceUrodzenia = miejsceUrodzenia;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        public String getImie() {
            return imie;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        public String getDataUrodzenia() {
            return dataUrodzenia;
        }

        public String getMiejsceUrodzenia() {
            return miejsceUrodzenia;
        }

        public String getEmail() {
            return email;
        }

        public Integer getPhoneNumber() {
            return phoneNumber;
        }
    }


}
