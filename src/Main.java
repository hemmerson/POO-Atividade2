/**
 * @author hemmerson
 * on date 23/02/2023
 */
public class Main {
    public static void main(String[] args) {

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.nome = "Ricardo";
        emprestimo.salario = 2000.00;
        emprestimo.valorEmprestimo = 5000.00;
        emprestimo.parcelas = 12;
        emprestimo.taxa = 10;
        System.out.println(emprestimo.realizaEmprestimo());

        System.out.println("-------------------------------------\n");

        Locadora locacao = new Locadora();
        locacao.nome = "Paulo";
        locacao.periodoLocacao = 10;
        locacao.valorHora = 10.00;
        System.out.println(locacao.dados());
        System.out.println();
        Locadora locacao2 = new Locadora();
        locacao2.nome = "Maria";
        locacao2.periodoLocacao = 30;
        locacao2.valorDia = 160.00;
        System.out.println(locacao2.dados());
    }
}