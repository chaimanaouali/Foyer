package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    private Long idChambre;
    private Long numeroChambre;

    @Enumerated (EnumType.STRING)

    private TypeChambre typeC;

    @ManyToOne
    Bloc bloc;
    @OneToMany
    private Set<Reservation> reservations;
}