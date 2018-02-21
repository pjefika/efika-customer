/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.efika_customer.model.customer;

/**
 *
 * @author G0041775
 */
public class InventarioRadius {

    private String status, armario, rin, velocidade, ipFixo, profile, porta;

    private Boolean isIpFixo;

    public InventarioRadius() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getArmario() {
        return armario;
    }

    public void setArmario(String armario) {
        this.armario = armario;
    }

    public String getRin() {
        return rin;
    }

    public void setRin(String rin) {
        this.rin = rin;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public String getIpFixo() {
        return ipFixo;
    }

    public void setIpFixo(String ipFixo) {
        this.ipFixo = ipFixo;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public Boolean getIsIpFixo() {
        return isIpFixo;
    }

    public void setIsIpFixo(Boolean isIpFixo) {
        this.isIpFixo = isIpFixo;
    }

}
