/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.efika_customer.model.customer;

import java.util.Calendar;

/**
 *
 * @author G0042204
 */
public class EventoMassivo {

    private String tipoAlarme;

    private String tipoFalha;

    private String tipoAfetacao;

    private String desc;

    private Calendar dataAbertura;

    private Calendar dataPrevista;

    private Long numeroEvento;

    private String tipoEvento;

    public EventoMassivo() {
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTipoAlarme() {
        return tipoAlarme;
    }

    public void setTipoAlarme(String tipoAlarme) {
        this.tipoAlarme = tipoAlarme;
    }

    public String getTipoFalha() {
        return tipoFalha;
    }

    public void setTipoFalha(String tipoFalha) {
        this.tipoFalha = tipoFalha;
    }

    public String getTipoAfetacao() {
        return tipoAfetacao;
    }

    public void setTipoAfetacao(String tipoAfetacao) {
        this.tipoAfetacao = tipoAfetacao;
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Calendar dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Calendar getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(Calendar dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public Long getNumeroEvento() {
        return numeroEvento;
    }

    public void setNumeroEvento(Long numeroEvento) {
        this.numeroEvento = numeroEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

}
