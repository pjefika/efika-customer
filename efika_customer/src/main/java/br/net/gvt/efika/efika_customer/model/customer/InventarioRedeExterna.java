package br.net.gvt.efika.efika_customer.model.customer;

import br.net.gvt.efika.efika_customer.model.customer.enums.TipoRede;
import br.net.gvt.efika.efika_customer.model.customer.enums.OrigemRede;
import br.net.gvt.efika.efika_customer.model.customer.enums.OrigemPlanta;

/**
 *
 * @author G0042204
 */
public class InventarioRedeExterna {

    private TipoRede tipo;
    private OrigemRede origem;
    private OrigemPlanta planta;

    private String splitter1n, splitter2n, caboAlim;
    private String fibra1n, fibra2n;

    public InventarioRedeExterna() {
    }

    public OrigemRede getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemRede origem) {
        this.origem = origem;
    }

    public TipoRede getTipo() {
        return tipo;
    }

    public void setTipo(TipoRede tipo) {
        this.tipo = tipo;
    }

    public OrigemPlanta getPlanta() {
        return planta;
    }

    public void setPlanta(OrigemPlanta planta) {
        this.planta = planta;
    }

    public String getSplitter1n() {
        return splitter1n;
    }

    public void setSplitter1n(String splitter1n) {
        this.splitter1n = splitter1n;
    }

    public String getSplitter2n() {
        return splitter2n;
    }

    public void setSplitter2n(String splitter2n) {
        this.splitter2n = splitter2n;
    }

    public String getCaboAlim() {
        return caboAlim;
    }

    public void setCaboAlim(String caboAlim) {
        this.caboAlim = caboAlim;
    }

    public String getFibra1n() {
        return fibra1n;
    }

    public void setFibra1n(String fibra1n) {
        this.fibra1n = fibra1n;
    }

    public String getFibra2n() {
        return fibra2n;
    }

    public void setFibra2n(String fibra2n) {
        this.fibra2n = fibra2n;
    }

}
