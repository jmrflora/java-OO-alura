public class Conta {
   private double saldo;
   private int agencia;
   private int numero;
   private Cliente titular;
   private static int total;

   //construtor
   public Conta(int agencia, int numero){
      total++;
      System.out.println("total é "+total);
      this.agencia = agencia;
      this.numero = numero;
   }

   //getters and setters
   public double getSaldo() {
      return saldo;
   }
   public int getAgencia() {
      return agencia;
   }
   public void setAgencia(int agencia) {
      if(agencia <=0){
         System.out.println("não pode valor menor ou igual a 0");
         return;
      }
      this.agencia = agencia;
   }
   public int getNumero() {
      return numero;
   } 
   public void setNumero(int numero) {
      if (numero <= 0) {
         System.out.println("não pode valor <= 0");
         return;
      }
      this.numero = numero;
   }
   public Cliente getTitular() {
      return titular;
   }
   public void setTitular(Cliente titular) {
      this.titular = titular;
   }
   public static int getTotal(){
      return Conta.total;
   }
   //métodos
   void deposita(double valor){
      this.saldo = this.saldo + valor;
   }
   public boolean saca(double valor){
      if (this.saldo >= valor) {
         this.saldo = this.saldo - valor;
         return true;
      }else{
         return false;
      }
   }

   public boolean transfere(double valor, Conta destino){
      if (this.saca(valor)) {
         destino.deposita(valor);
         return true;
      }
      return false;
   }
}
