package mapper;

import dto.BookingDto;
import dto.FlightDto;
import entity.FlightEntity;

import java.util.ArrayList;
import java.util.List;

public class FlightMapper {
    public static FlightDto toDto(FlightEntity flightEntity) {
        return new FlightDto(
                flightEntity.getFlightId(),
                flightEntity.getOrigin(),
                flightEntity.getDestination(),
                flightEntity.getDepartureTime(),
                flightEntity.getAvailableSeats());
    }

    public static FlightEntity toEntity(FlightDto flightDto) {
        return new FlightEntity(
                flightDto.getFlightId(),
                flightDto.getOrigin(),
                flightDto.getDestination(),
                flightDto.getDepartureTime(),
                flightDto.getAvailableSeats());
    }

    public static List<FlightDto> flightDtoList(List<FlightEntity> flightEntities) {
        List<FlightDto> flightDtoList = new ArrayList<>();
        for (FlightEntity flightEntity : flightEntities) {
            flightDtoList.add(new FlightDto(
                    flightEntity.getFlightId(),
                    flightEntity.getOrigin(),
                    flightEntity.getDestination(),
                    flightEntity.getDepartureTime(),
                    flightEntity.getAvailableSeats()));
        }
        return flightDtoList;
    }

    public static List<FlightEntity> flightEntityList(List<FlightDto> flightDtoList) {
        List<FlightEntity> flightEntityList = new ArrayList<>();
        for (FlightDto flightDto : flightDtoList) {
            flightEntityList.add(new FlightEntity(flightDto.getFlightId(),
                    flightDto.getOrigin(),
                    flightDto.getDestination(),
                    flightDto.getDepartureTime(),
                    flightDto.getAvailableSeats()));
        }
        return flightEntityList;
    }
}
