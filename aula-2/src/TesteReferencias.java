public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 300;
        System.out.println("saldo primeira conta "+primeiraConta.saldo);
        
        //copia referência
        Conta segundaConta = primeiraConta;
        System.out.println("saldo da segunda conta "+segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("agora o saldo da segunda conta "+segundaConta.saldo);
        System.out.println("agora o saldo da primeira conta "+primeiraConta.saldo);

    }      
}
