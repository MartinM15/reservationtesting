package com.springboot.martinmurillo.reservationhotel.entity;
import java.time.LocalDate;

import java.util.List;


public class Reservation {
	 private Integer id;
	    private String clientFullName;
	    private Integer roomNumber;
	    private List<LocalDate> reservationDates;

	    // Constructores, getters y setters

	    public Reservation() {
	        // Constructor por defecto necesario para la deserialización JSON en Spring Boot
	    }

	    public Reservation(Integer id, String clientFullName, Integer roomNumber, List<LocalDate> reservationDates) {
	        this.id = id;
	        this.clientFullName = clientFullName;
	        this.roomNumber = roomNumber;
	        this.reservationDates = reservationDates;
	    }

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getClientFullName() {
	        return clientFullName;
	    }

	    public void setClientFullName(String clientFullName) {
	        this.clientFullName = clientFullName;
	    }

	    public Integer getRoomNumber() {
	        return roomNumber;
	    }

	    public void setRoomNumber(Integer roomNumber) {
	        this.roomNumber = roomNumber;
	    }

	    public List<LocalDate> getReservationDates() {
	        return reservationDates;
	    }

	    public void setReservationDates(List<LocalDate> reservationDates) {
	        this.reservationDates = reservationDates;
	    }
	    
}
