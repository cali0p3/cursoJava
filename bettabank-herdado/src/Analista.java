public class Analista extends Funcionario {

	public double getBonificacao() {
		return super.getBonificacao() + super.salario;
	}
}
