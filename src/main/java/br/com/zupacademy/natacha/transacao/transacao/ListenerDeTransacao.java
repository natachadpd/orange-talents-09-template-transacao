package br.com.zupacademy.natacha.transacao.transacao;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    private EventoDeTransacaoRepository repository;

    public ListenerDeTransacao(EventoDeTransacaoRepository repository){
        this.repository = repository;
    }

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(EventoDeTransacaoResponse transacaoResponse) {
        EventoDeTransacao transacao = transacaoResponse.toModel();
        repository.save(transacao);
    }


}
