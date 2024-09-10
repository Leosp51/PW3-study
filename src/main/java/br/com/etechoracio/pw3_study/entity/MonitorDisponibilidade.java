package br.com.etechoracio.pw3_study.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_REL_MONITOR_DISPONIBILIDADE")
public class MonitorDisponibilidade {
    @ManyToOne
    @JoinTable(name = "TBL_MONITOR")
    @JoinColumn(name = "ID_MONITOR")
    private Long idMonitor;
    @ManyToOne
    @JoinTable(name = "TBL_DISPONIBILIDADE")
    @JoinColumn(name = "ID_DISPONIBILIDADE")
    private Long idDisponibilidade;
}
