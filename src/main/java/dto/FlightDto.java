package dto;

import java.time.LocalDateTime;
import java.util.Objects;

public class FlightDto {
    private Long flightId;
    private String origin;
    private String destination;
    private LocalDateTime departureTime;
    private Integer availableSeats;

    public FlightDto(Long flightId, String origin, String destination, LocalDateTime departureTime, Integer availableSeats) {
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
        FlightDto flightDto = (FlightDto) o;
        return Objects.equals(flightId, flightDto.flightId) && Objects.equals(origin, flightDto.origin) && Objects.equals(destination, flightDto.destination) && Objects.equals(departureTime, flightDto.departureTime) && Objects.equals(availableSeats, flightDto.availableSeats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightId, origin, destination, departureTime, availableSeats);
    }

    @Override
    public String toString() {
        return "FlightDto{" +
                "flightId=" + flightId +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                ", availableSeats=" + availableSeats +
                '}';
    }
}
