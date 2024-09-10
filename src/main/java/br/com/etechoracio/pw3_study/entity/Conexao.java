package br.com.etechoracio.pw3_study.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "TBL_CONEXAO")
public class Conexao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONEXAO")
    private Long id;
    @Column(name = "DT_CRIACAO")
    private LocalDateTime dtCriacao;
    @ManyToOne
    @JoinTable(name = "TBL_MONITOR")
    @JoinColumn(name = "ID_MONITOR")
    private Long idMonitor;
}
