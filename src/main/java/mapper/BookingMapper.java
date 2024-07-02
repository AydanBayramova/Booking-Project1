package mapper;

import dto.BookingDto;
import entity.BookingEntity;

import java.util.ArrayList;
import java.util.List;

public class BookingMapper {
    public static BookingDto toDto(BookingEntity bookingEntity) {
        return new BookingDto(
                bookingEntity.getBookingId(),
                bookingEntity.getFlightId(),
                bookingEntity.getPassengersList());
    }

    public static BookingEntity toBookingEntity(BookingDto bookingDto) {
        return new BookingEntity(
                bookingDto.getBookingId(),
                bookingDto.getFlightId(),
                bookingDto.getPassengersList());
    }

    public static List<BookingEntity> bookingEntityList(List<BookingDto> bookingDtoList) {
        List<BookingEntity> bookingEntities = new ArrayList<>();
        for (BookingDto bookingDto : bookingDtoList) {
            bookingEntities.add(new BookingEntity(
                    bookingDto.getBookingId(),
                    bookingDto.getFlightId(),
                    bookingDto.getPassengersList()));
        }
        return bookingEntities;
    }

    public static List<BookingDto> bookingDtoList(List<BookingEntity> bookingEntities) {
        List<BookingDto> bookingDtos = new ArrayList<>();
        for (BookingEntity bookingEntity : bookingEntities) {
            bookingDtos.add(new BookingDto(
                    bookingEntity.getBookingId(),
                    bookingEntity.getFlightId(),
                    bookingEntity.getPassengersList()));
        }
        return bookingDtos;
    }
}
