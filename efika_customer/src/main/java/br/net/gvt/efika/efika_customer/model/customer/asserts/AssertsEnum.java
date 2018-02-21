/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.efika_customer.model.customer.asserts;

/**
 *
 * @author G0042204
 */
public enum AssertsEnum {

    HAS_SYNC("Possui sincronismo?"),
    AUTH_ABERTURA_ORDEM("Houve autenticação após abertura da ordem?"),
    LINHA_MUDA("Reclamação Linha Muda?"),
    RUIDO_CHIADO("Reclamação Ruído e Chiado?"),
    IS_ADSL("É ADSL?"),
    IS_SIP("É SIP?"),
    IS_REPARO("É Reparo?"),
    CIRCUITO_ATIVO("Circuito Ativo no TBS?"),
    HAS_BLOQUEIO_RADIUS("Possui bloqueio no Radius?"),
    DIVERGENCIA_TBS_RADIUS("Existe divergencia entre TBS e Radius?"),
    REDE_CONFIAVEL("Rede confiável?"),
    RESYNC_MENOR_5("Resync < 5?"),
    RESYNC_MENOR_50("Resync < 50?"),
    RESYNC_MENOR_300("Resync < 300?"),
    PACOTES_DOWN_MAIOR_6000("Pacotes de DOWN > 6000?"),
    PACOTES_UP_MAIOR_4000("Pacotes de UP > 4000?"),
    ATT_DOWN_OK("Attainable Rate Download OK?"),
    ATT_UP_OK("Attainable Rate Upload OK?"),
    ORIGINOU_CHAMADA_POS_ABERTURA_ORDEM("Telefone originou chamada após abertura da ordem?");

    private final String pergunta;

    private AssertsEnum(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getPergunta() {
        return pergunta;
    }

}
