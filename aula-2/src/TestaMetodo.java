public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);

        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println(conseguiuRetirar);
        System.out.println(contaDoPaulo.saldo);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        
        if (contaDaMarcela.transfere(300, contaDoPaulo)) {
            System.out.println("transferência concluida com sucesso");
        }else{
            System.out.println("faltou dinheiro");
        }
        
        System.out.println(contaDoPaulo.saldo);
        System.out.println(contaDaMarcela.saldo);

        contaDoPaulo.titular = "paulo silveira";
        System.out.println(contaDoPaulo.titular);
    }
}
