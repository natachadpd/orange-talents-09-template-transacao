package br.com.zupacademy.natacha.transacao.transacao;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class EventoDeTransacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBanco;
    @Column(name="id_transacao")
    private String id;
    private BigDecimal valor;
    @Embedded
    private EstabelecimentoConsumer estabelecimento;
    @AttributeOverrides(
            @AttributeOverride(name = "id",
                    column = @Column(name = "id_cartao"))
    )
    @Embedded
    private CartaoConsumer cartao;
    private LocalDateTime efetivadaEm;

    @Deprecated
    public EventoDeTransacao() {
    }

    public EventoDeTransacao(String id, BigDecimal valor, EstabelecimentoConsumer estabelecimento,
                             CartaoConsumer cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
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
