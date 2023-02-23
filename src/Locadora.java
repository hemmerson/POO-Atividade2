/**
 * @author hemmerson
 * on date 23/02/2023
 */
public class Locadora {
    String nome;
    int periodoLocacao;
    double valorHora;
    double valorDia;

    /**
     * método que calcula o valor da locacao de acordo com o período escolhido pelo cliente
     *
     * @return valor da locação em double
     */
    double calculaValor() {
        if (periodoLocacao <= 12)
            return valorHora * periodoLocacao;
        else {
            int dias;
            dias = (periodoLocacao / 24) + 1;
            return valorDia * dias;
        }
    }

    /**
     * método que calcula o valor a ser pago já com as taxas, se o valor que vem do método
     * calculaValor() for até 200.00 a taxa é de 20%, senão a taxa é de 15%
     *
     * @return valor da locacção com a taxa inclusa
     */
    double calculaValorTaxa() {
        if (calculaValor() <= 200.00)
            return calculaValor() + (calculaValor() * 0.2);
        else
            return calculaValor() + (calculaValor() * 0.15);
    }

    /**
     * metodo que retorna os dados da locação de acordo com o período desejado, incluindo
     * nome, período de locação e valor pago ao final com taxa
     *
     * @return String com os dados da locação
     */
    public String dados() {
        if (periodoLocacao <= 12)
            return "Nome: " + nome + "\n" +
                    "Período de locação: " + periodoLocacao + " horas\n" +
                    "Valor a ser pago: R$ " + calculaValorTaxa();
        else
            return "Nome: " + nome + "\n" +
                    "Período de locação: " + ((periodoLocacao / 24) + 1) + " dias\n" +
                    "Valor a ser pago: R$ " + calculaValorTaxa();
    }
}
