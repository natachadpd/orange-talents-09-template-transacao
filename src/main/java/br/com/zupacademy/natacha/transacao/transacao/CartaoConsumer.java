package br.com.zupacademy.natacha.transacao.transacao;

import javax.persistence.Embeddable;

@Embeddable
public class CartaoConsumer {


    private String id;
    private String email;


    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "CartaoConsumer{" +
                "idCartao='" + id+ '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
