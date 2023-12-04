package ec.voto.api.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "curso")

public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(name = "nombre_del_curso", nullable = false)
    private String nombreDelCurso;

    @OneToMany(mappedBy = "curso")
    private String  estudiantes;

    @OneToMany(mappedBy = "curso")
    private String mesas;
}
