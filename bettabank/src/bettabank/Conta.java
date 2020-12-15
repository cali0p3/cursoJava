package bettabank;

public class Conta {
		double saldo;
		int	agencia;
		int	numero;
		String	titular;
		
		
		public void deposita(double valor) {
			this.saldo = saldo += valor;
			System.out.println("Deposito efetuado! Saldo atual: " + this.saldo);
		}
		public boolean saca(double valor) {
			if(this.saldo >= valor) {
				this.saldo -= valor;
				System.out.println("Saque efetuado. Saldo atual: " + this.saldo);
				return true;
			}else {
				System.out.println("Saldo insuficiente. Saldo atual: " + this.saldo);
				return false;
			}
		}
		public boolean transfere(double valor, Conta destino) {
			if(this.saldo >= valor) {
				this.saldo -= valor;
				System.out.println("Transferencia realizada com Sucesso! Saldo restante: " + this.saldo);
				return true;
			}
			System.out.println("Tranferencia n�o realizada! Saldo insuficiente.");
			return false;
		}
	}
