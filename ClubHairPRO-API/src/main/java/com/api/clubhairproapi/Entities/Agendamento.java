package com.api.clubhairproapi.Entities;

import com.api.clubhairproapi.ENUM.PaymentMethod;
import com.api.clubhairproapi.ENUM.StatusService;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "agendamentos")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "usuario_id")
    private Usuario cliente;

    private LocalDate dataAgendamento;

//    private LocalTime horaAgendamento;

    //private PaymentMethod payment; -> Incluir depois!!

    private String servico;

    private StatusService status;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "profissional_id", unique = false)
    private Profissional profissional;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(LocalDate dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

//    public LocalTime getHoraAgendamento() {
//        return horaAgendamento;
//    }
//
//    public void setHoraAgendamento(LocalTime horaAgendamento) {
//        this.horaAgendamento = horaAgendamento;
//    }

//    public PaymentMethod getPayment() {
//        return payment;
//    }
//
//    public void setPayment(PaymentMethod payment) {
//        this.payment = payment;
//    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public StatusService getStatus() {
        return status;
    }

    public void setStatus(StatusService status) {
        this.status = status;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "Id=" + Id +
                ", cliente=" + cliente +
                ", dataAgendamento=" + dataAgendamento +
//                ", horaAgendamento=" + horaAgendamento +
                ", servico='" + servico + '\'' +
                ", status=" + status +
                ", profissional=" + profissional +
                '}';
    }
}
