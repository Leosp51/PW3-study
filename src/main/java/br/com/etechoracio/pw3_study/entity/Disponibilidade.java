package br.com.etechoracio.pw3_study.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "TBL_DISPONIBILIDADE")
public class Disponibilidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DISPONIBILIDADE")
    private Long id;
    @Column(name = "TX_DIA_SEMANA")
    private String diaSemana;
    @Column(name = "DT_DAS")
    private LocalDateTime dtDas;
    @Column(name = "DT_ATE")
    private LocalDateTime dtAte;

}
