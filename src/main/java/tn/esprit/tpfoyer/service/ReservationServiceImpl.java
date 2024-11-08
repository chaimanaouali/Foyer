package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Reservation;
import tn.esprit.tpfoyer.repository.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService{
    ReservationRepository reservationRepository;
    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll();
    }
    public Reservation retrieveReservation(Long reservationId) {return reservationRepository.findById(reservationId).get();
    }
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }
    public void removeReservation(Long reservationId) {
        reservationRepository.deleteById(reservationId);
    }
    public Reservation modifyReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
