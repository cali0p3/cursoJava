
public class ControleBonificacao {

	private double soma;
	
	public void registra(FuncionarioMod f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma(){
		return soma;
	}
}
