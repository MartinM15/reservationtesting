package com.springboot.martinmurillo.reservationhotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springboot.martinmurillo.reservationhotel.entity.Reservation;
import com.springboot.martinmurillo.reservationhotel.service.ReservationService;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@RestController
@RequestMapping("/reservation")
public class ReservationController {
	
	  @Autowired
	    private ReservationService reservationService;

	    @GetMapping
	    public Set<Reservation> getAllReservations() {
	        return reservationService.getAllReservations();
	    }

	    @GetMapping("/{id}")
	    public Reservation getReservationById(@PathVariable Integer id) {
	        return reservationService.getReservationById(id)
	                .orElseThrow(() -> new RuntimeException("Reservation not found with id: " + id));
	    }

	    @PostMapping
	    public Reservation createReservation(@RequestBody Reservation reservation) {
	        return reservationService.createReservation(reservation);
	    }

	    @PutMapping("/{id}")
	    public Reservation updateReservation(@PathVariable Integer id, @RequestBody Reservation updatedReservation) {
	        return reservationService.updateReservation(id, updatedReservation)
	                .orElseThrow(() -> new RuntimeException("Reservation not found with id: " + id));
	    }

	    @DeleteMapping("/{id}")
	    public void deleteReservation(@PathVariable Integer id) {
	        reservationService.deleteReservation(id);
	    }

}
