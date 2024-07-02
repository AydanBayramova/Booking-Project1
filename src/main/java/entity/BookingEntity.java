package entity;

import java.util.List;
import java.util.Objects;

public class BookingEntity {
    private Long bookingId;
    private Long flightId;
    private List<Passengers> passengersList;

    public BookingEntity(long bookingId, long flightId, List<Passengers> passengersList) {
        this.bookingId = bookingId;
        this.flightId = flightId;
        this.passengersList = passengersList;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public List<Passengers> getPassengersList() {
        return passengersList;
    }

    public void setPassengersList(List<Passengers> passengersList) {
        this.passengersList = passengersList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingEntity that = (BookingEntity) o;
        return bookingId == that.bookingId && flightId == that.flightId && Objects.equals(passengersList, that.passengersList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, flightId, passengersList);
    }

    @Override
    public String toString() {
        return "BookingEntity{" +
                "bookingId=" + bookingId +
                ", flightId=" + flightId +
                ", passengersList=" + passengersList +
                '}';
    }
}
