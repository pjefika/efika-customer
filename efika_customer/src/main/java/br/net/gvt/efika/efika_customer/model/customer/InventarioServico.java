/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.efika_customer.model.customer;

import br.net.gvt.efika.efika_customer.model.customer.enums.OrigemInventarioServico;
import br.net.gvt.efika.efika_customer.model.customer.enums.TecnologiaTv;
import br.net.gvt.efika.efika_customer.model.customer.enums.TecnologiaLinha;

/**
 *
 * @author G0042204
 */
public class InventarioServico {

    private OrigemInventarioServico origem;

    private Long velDown, velUp;

    private TecnologiaTv tipoTv;

    private TecnologiaLinha tipoLinha;

    public InventarioServico() {
    }

    public Long getVelDown() {
        return velDown;
    }

    public void setVelDown(Long velDown) {
        this.velDown = velDown;
    }

    public Long getVelUp() {
        return velUp;
    }

    public void setVelUp(Long velUp) {
        this.velUp = velUp;
    }

    public TecnologiaTv getTipoTv() {
        return tipoTv;
    }

    public void setTipoTv(TecnologiaTv tipoTv) {
        this.tipoTv = tipoTv;
    }

    public TecnologiaLinha getTipoLinha() {
        return tipoLinha;
    }

    public void setTipoLinha(TecnologiaLinha tipoLinha) {
        this.tipoLinha = tipoLinha;
    }

    public OrigemInventarioServico getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemInventarioServico origem) {
        this.origem = origem;
    }

}
