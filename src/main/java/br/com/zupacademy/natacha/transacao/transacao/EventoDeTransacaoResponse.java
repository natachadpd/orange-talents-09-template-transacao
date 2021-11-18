package br.com.zupacademy.natacha.transacao.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class EventoDeTransacaoResponse {

    private String id;
    private BigDecimal valor;
    private EstabelecimentoConsumer estabelecimento;
    private LocalDateTime efetivadaEm;
    private CartaoConsumer cartao;


    @Deprecated
    public EventoDeTransacaoResponse(){
    }

    public EventoDeTransacaoResponse(EventoDeTransacao transacao) {
        this.id = transacao.getId();
        this.valor = transacao.getValor();
        this.estabelecimento = transacao.getEstabelecimento();
        this.efetivadaEm = transacao.getEfetivadaEm();
        this.cartao = transacao.getCartao();
    }

    public String getIdTransacao() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoConsumer getEstabelecimento() {
        return estabelecimento;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public EventoDeTransacao toModel(){
        return new EventoDeTransacao(this.id, this.valor, this.estabelecimento,  this.cartao,this.efetivadaEm );
    }
}
