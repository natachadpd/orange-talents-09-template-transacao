package br.com.zupacademy.natacha.transacao.transacao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventoDeTransacaoRepository extends CrudRepository<EventoDeTransacao, Long> { ;

    List<EventoDeTransacao> findTop10ByCartaoIdOrderByEfetivadaEmDesc(String cartao);
}
