public class Conta {
   private double saldo;
   int agencia;
   int numero;
   Cliente titular;

   //getters and setters
   public double getSaldo() {
      return saldo;
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
