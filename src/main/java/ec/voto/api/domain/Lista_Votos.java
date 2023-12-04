package ec.voto.api.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "lista_de_votos")
public class Lista_Votos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_votacion", nullable = false)
    private Votacion votacion;

    @Column(nullable = false)
    private String asistencia;
}
