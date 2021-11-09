package br.com.zupacademy.natacha.transacao.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class EventoDeTransacao {


    private String id;
    private BigDecimal valor;
    private EstabelecimentoConsumer estabelecimento;
    private CartaoConsumer cartao;
    private LocalDateTime efetivadaEm;

    public EventoDeTransacao() {
    }


    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoConsumer getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoConsumer getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    @Override
    public String toString() {
        return "EventoDeTransacao{" +
                "id='" + id + '\'' +
                ", valor=" + valor +
                ", estabelecimentoConsumer=" + estabelecimento +
                ", cartaoConsumer=" + cartao +
                ", efetivadaEm=" + efetivadaEm +
                '}';
    }
}
