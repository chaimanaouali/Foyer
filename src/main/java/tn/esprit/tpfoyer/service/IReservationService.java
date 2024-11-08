package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Reservation;

import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservation();
    public Reservation retrieveReservation(Long ReservationId);
    public Reservation addReservation(Reservation r);
    public void removeReservation(Long ReservationId);
    public Reservation modifyReservation(Reservation reservation);
}
