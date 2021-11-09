package br.com.zupacademy.natacha.transacao.transacao;

public class EstabelecimentoConsumer {

    private String nome;
    private String cidade;
    private String endereco;


    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "EstabelecimentoConsumer{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
