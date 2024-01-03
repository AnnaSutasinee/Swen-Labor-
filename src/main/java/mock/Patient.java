package mock;

public class Patient {
    private int id;
    private String name;
    // Weitere Attribute und Methoden

    public Patient (int id, String name) {

        this.id = id;
        this.name = name;

        if(name.isEmpty()) {
            throw new IllegalArgumentException("Name darf nicht leer sein");
        } else if (name.length() > 50) {
            throw new IllegalArgumentException("Name darf nicht mehr als 50 Zeichen lang sein");
        } else if (name.length() < 2) {
            throw new IllegalArgumentException("Name muss mindestens 2 Zeichen lang sein");
        } else if (id < 0) {
            throw new IllegalArgumentException("ID darf nicht negativ sein");
        } else if (id == 0) {
            throw new IllegalArgumentException("ID darf nicht 0 sein");
        } else if (id > 999999999) {
            throw new IllegalArgumentException("ID darf nicht mehr als 999999999 sein");
        }
    }

    public Patient () {

    }
}
