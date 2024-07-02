package entity;

import java.util.Objects;

public class Passengers {
    private static Long ID=0L;
    private Long passenger_id;
    private String name;

    public Passengers( String name) {
        this.passenger_id = ++ID;
        this.name = name;
    }

    public static Long getID() {
        return ID;
    }

    public static void setID(Long ID) {
        Passengers.ID = ID;
    }

    public Long getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(Long passenger_id) {
        this.passenger_id = passenger_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Passengers{" +
                "passenger_id=" + passenger_id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passengers that = (Passengers) o;
        return Objects.equals(passenger_id, that.passenger_id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passenger_id, name);
    }
}
