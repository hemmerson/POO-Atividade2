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

    public double valorFinal(){
        double valorFinal = valorEmprestimo;
        for(int i = 0; i < parcelas; i++){
            valorFinal = valorFinal + (valorFinal * taxa / 100);
        }
        return valorFinal;
    }

    public boolean concedeEmprestimo(){
        if((valorFinal() / parcelas) <= (salario * 0.3))
            return true;
        return false;
    }

    public String realizaEmprestimo(){
        if (concedeEmprestimo())
            return "Cliente: "+nome+"\n" +
                    "Salário: "+salario+"\n" +
                    "Valor pedido para empréstimo: "+valorEmprestimo+"\n" +
                    "Quantidade de parcelas: "+parcelas+"\n" +
                    "Valor final: "+valorFinal()+"\n" +
                    "Valor da parcela: "+valorFinal()/parcelas+"\n" +
                    "EMPRÉSTIMO CONCEDIDO";
        return "Cliente: "+nome+"\n" +
                "Salário: "+salario+"\n" +
                "Valor pedido para empréstimo: "+valorEmprestimo+"\n" +
                "Quantidade de parcelas: "+parcelas+"\n" +
                "Valor final: "+valorFinal()+"\n" +
                "Valor da parcela: "+valorFinal()/parcelas+"\n" +
                "EMPRÉSTIMO NÃO CONCEDIDO";
    }

}
