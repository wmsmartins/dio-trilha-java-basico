	// Inicio do código ContaBancaria

    public class ContaBancaria {
        private String titular;
        private String numeroConta;
        private double saldo;
    
        public ContaBancaria(String titular, String numeroConta, double saldoInicial) {
            this.titular = titular;
            this.numeroConta = numeroConta;
            this.saldo = saldoInicial;
        }
    
        public String getTitular() {
            return titular;
        }
    
        public String getNumeroConta() {
            return numeroConta;
        }
    
        public double getSaldo() {
            return saldo;
        }
    
        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Valor de depósito inválido.");
            }
        }
    
        public boolean sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
                return true;
            } else {
                System.out.println("Saldo insuficiente ou valor de saque inválido.");
                return false;
            }
        }
    
        @Override
        public String toString() {
            return "ContaBancaria{" +
                    "titular='" + titular + '\'' +
                    ", numeroConta='" + numeroConta + '\'' +
                    ", saldo=" + saldo +
                    '}';
        }
    }