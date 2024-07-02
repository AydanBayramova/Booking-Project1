package entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class FlightEntity {
    private Long flightId;
    private String origin;
    private String destination;
    private LocalDateTime departureTime;
    private Integer availableSeats;

    public FlightEntity(Long flightId, String origin, String destination, LocalDateTime departureTime, Integer availableSeats) {
        this.flightId = flightId;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.availableSeats = availableSeats;
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightEntity that = (FlightEntity) o;
        return Objects.equals(flightId, that.flightId) && Objects.equals(origin, that.origin) && Objects.equals(destination, that.destination) && Objects.equals(departureTime, that.departureTime) && Objects.equals(availableSeats, that.availableSeats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightId, origin, destination, departureTime, availableSeats);
    }

    @Override
    public String toString() {
        return "FlightEntity{" +
                "flightId=" + flightId +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                ", availableSeats=" + availableSeats +
                '}';
    }
}
