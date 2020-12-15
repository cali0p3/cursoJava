
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(987, 9876);
		conta.setNumero(2552);
		System.out.println(conta.getNumero());
		
		conta.setAgencia(255);
		System.out.println(conta.getAgencia());
		
		conta.deposita(0);
		
		Cliente joanna = new Cliente("Joanna", "9876564322", "Estudante");
		Conta contaDaJoanna = new Conta(1234, 123456);
		contaDaJoanna.setTitular(joanna);
		
		System.out.println(contaDaJoanna.getTitular().getNome());
		
		Conta.getTotal();
	
		Cliente maria = new Cliente("Maria", "09876433467", "Desenvolvedora");
		
		Conta contaDaMaria = new Conta(9999, 99999);
		contaDaMaria.setTitular(maria);
		
		System.out.println(contaDaMaria.getTitular().getNome());
		System.out.println(contaDaMaria.getTitular().getCpf());
		System.out.println(contaDaMaria.getTitular().getProfissao());
		
		Cliente joao = new Cliente("Joao", "00875467800", "Estudante");
	}
}
