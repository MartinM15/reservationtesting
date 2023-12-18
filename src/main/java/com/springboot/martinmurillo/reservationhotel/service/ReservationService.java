package com.springboot.martinmurillo.reservationhotel.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.springboot.martinmurillo.reservationhotel.entity.Reservation;

@Service
public class ReservationService {

	private Set<Reservation> reservations = new HashSet<>();
    private int nextReservationId = 1;

    public Set<Reservation> getAllReservations() {
        return reservations;
    }

    public Optional<Reservation> getReservationById(Integer id) {
        return reservations.stream()
                .filter(reservation -> reservation.getId().equals(id))
                .findFirst();
    }

    public Reservation createReservation(Reservation reservation) {
        reservation.setId(nextReservationId++);
        reservations.add(reservation);
        return reservation;
    }

    public Optional<Reservation> updateReservation(Integer id, Reservation updatedReservation) {
        return getReservationById(id)
                .map(existingReservation -> {
                    existingReservation.setClientFullName(updatedReservation.getClientFullName());
                    existingReservation.setRoomNumber(updatedReservation.getRoomNumber());
                    existingReservation.setReservationDates(updatedReservation.getReservationDates());
                    return existingReservation;
                });
    }

    public void deleteReservation(Integer id) {
        reservations.removeIf(reservation -> reservation.getId().equals(id));
    }
	
}
