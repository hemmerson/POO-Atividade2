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
    }
}