package br.com.zupacademy.natacha.transacao.transacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/transacoes")
public class EventoDeTransacaoController {

    @Autowired
    private EventoDeTransacaoRepository repository;


    @GetMapping("/cartoes/{idCartao}")
    public ResponseEntity<List<EventoDeTransacaoResponse>> consultar(@PathVariable String idCartao){

        List<EventoDeTransacao> transacao = repository.findTop10ByCartaoIdOrderByEfetivadaEmDesc(idCartao);
        if(transacao.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cartão não encontrado");
        }

        return ResponseEntity.ok()
                .body(transacao
                .stream()
                .map(EventoDeTransacaoResponse::new)
                .collect(Collectors.toList()));
    }
}
