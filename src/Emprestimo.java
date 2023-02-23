/**
 * @author hemmerson
 * on date 23/02/2023
 */
public class Emprestimo {
    String nome;
    double salario;
    double valorEmprestimo;
    int parcelas;
    double taxa;

    /**
     * método que calcula o valor final que será pago pelo cliente no final do pagamento
     *
     * @return valorfinal em double
     */
    public double valorFinal() {
        double valorFinal = valorEmprestimo;
        for (int i = 0; i < parcelas; i++) {
            valorFinal = valorFinal + (valorFinal * taxa / 100);
        }
        return valorFinal;
    }

    /**
     * método que verifica se pode ser concedido o emprestimo, se o valor da parcela é
     * menor ou igual a 30% do salário o empréstimo pode ser concedido.
     *
     * @return true or false
     */
    public boolean concedeEmprestimo() {
        if ((valorFinal() / parcelas) <= (salario * 0.3))
            return true;
        return false;
    }

    /**
     * método que retorna os dados do empréstimo e ainda se foi ou não concedido o empréstimo
     *
     * @return String com dados do empréstimo
     */
    public String realizaEmprestimo() {
        if (concedeEmprestimo())
            return "Cliente: " + nome + "\n" +
                    "Salário: R$ " + salario + "\n" +
                    "Valor pedido para empréstimo: R$ " + valorEmprestimo + "\n" +
                    "Quantidade de parcelas: " + parcelas + "x\n" +
                    "Valor final: R$ " + valorFinal() + "\n" +
                    "Valor da parcela: R$ " + valorFinal() / parcelas + "\n" +
                    "EMPRÉSTIMO CONCEDIDO";
        return "Cliente: " + nome + "\n" +
                "Salário: R$ " + salario + "\n" +
                "Valor pedido para empréstimo: R$ " + valorEmprestimo + "\n" +
                "Quantidade de parcelas: " + parcelas + "x\n" +
                "Valor final: R$ " + valorFinal() + "\n" +
                "Valor da parcela: R$ " + valorFinal() / parcelas + "\n" +
                "EMPRÉSTIMO NÃO CONCEDIDO";
    }

}
