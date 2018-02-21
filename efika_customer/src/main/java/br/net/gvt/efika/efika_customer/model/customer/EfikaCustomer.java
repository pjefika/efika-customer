/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.efika_customer.model.customer;

import java.util.ArrayList;
import java.util.List;

public class EfikaCustomer {

    private String designador, instancia, designadorAcesso, designadorTv;

    private InventarioRede rede;

    private InventarioRedeExterna redeExterna;

    private InventarioServico servicos;

    private InventarioLinha linha;

    private InventarioRadius radius;

    private List<CustomerAssert> asserts;

    private List<EventoMassivo> eventos;

    public EfikaCustomer() {
        init();
    }

    public EfikaCustomer(String designador) {
        this.designador = designador;
        init();
    }

    protected void init() {
        rede = new InventarioRede();
        redeExterna = new InventarioRedeExterna();
        servicos = new InventarioServico();
        linha = new InventarioLinha();
        radius = new InventarioRadius();
        asserts = new ArrayList<>();
        eventos = new ArrayList<>();
    }

    public String getDesignador() {
        return designador;
    }

    public void setDesignador(String designador) {
        this.designador = designador;
    }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public String getDesignadorAcesso() {
        return designadorAcesso;
    }

    public void setDesignadorAcesso(String designadorAcesso) {
        this.designadorAcesso = designadorAcesso;
    }

    public InventarioRede getRede() {
        return rede;
    }

    public void setRede(InventarioRede rede) {
        this.rede = rede;
    }

    public InventarioServico getServicos() {
        return servicos;
    }

    public void setServicos(InventarioServico servicos) {
        this.servicos = servicos;
    }

    public List<CustomerAssert> getAsserts() {
        return asserts;
    }

    public void setAsserts(List<CustomerAssert> asserts) {
        this.asserts = asserts;
    }

    public InventarioLinha getLinha() {
        return linha;
    }

    public void setLinha(InventarioLinha linha) {
        this.linha = linha;
    }

    public String getDesignadorTv() {
        return designadorTv;
    }

    public void setDesignadorTv(String designadorTv) {
        this.designadorTv = designadorTv;
    }

    public List<EventoMassivo> getEventos() {
        return eventos;
    }

    public void setEventos(List<EventoMassivo> eventos) {
        this.eventos = eventos;
    }

    public InventarioRadius getRadius() {
        return radius;
    }

    public void setRadius(InventarioRadius radius) {
        this.radius = radius;

    }

    public InventarioRedeExterna getRedeExterna() {
        return redeExterna;
    }

    public void setRedeExterna(InventarioRedeExterna redeExterna) {
        this.redeExterna = redeExterna;
    }

}
