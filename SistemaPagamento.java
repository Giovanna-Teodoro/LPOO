import java.util.ArrayList;
import java.util.List;

abstract class Pagamento{
    private double valor; //valor da transação
    private String data;  //data do pagamento

    Pagamento(double valor, String data){
        this.valor=valor;
        this.data=data;
    }

    public void setValor(double valor){
        this.valor=valor;
    }

    public double getValor(){
        return this.valor;
    }

    public void setData(String data){
        this.data=data;
    }

    public String getData(){
        return this.data;
    }

    public abstract void processarPagamento();

    public void exibirDetalhe(){
        System.out.println("Valor da transacao: "+ this.valor);
        System.out.println("Data da transacao: "+ this.data);
    }
}

interface PagamentoOnline{

    public void confirmarTransacao();

}

interface PagamentoOffline{
    public void gerarBoleto();

}

class CartaoCredito extends Pagamento implements PagamentoOnline{

    CartaoCredito(double valor, String data){
        super(valor,data);
    }

    public void processarPagamento(){
        System.out.println("Pagamento foi realizado!");
    }

    public void confirmarTransacao(){
        System.out.println("Operação confirmada");
    }

}

class BoletoBancario extends Pagamento implements PagamentoOffline{

    BoletoBancario(double valor, String data){
        super(valor,data);
    }


    public void processarPagamento(){
        System.out.println("Boleto pago com sucesso!");
    }

    public void gerarBoleto(){
        System.out.println("Boleto gerado com sucesso!");
    }

}

class TransferenciaBancaria extends Pagamento implements PagamentoOnline{

    TransferenciaBancaria(double valor, String data){
        super(valor,data);
    }


    public void processarPagamento(){
        System.out.println("Transferencia processada!");

    }

    public void confirmarTransacao(){
        System.out.println("Operação realizada com sucesso!");
    }
}

class SistemaPagamento{
    public static void main(String[] args){

        List<Pagamento> listaDeMetodos = new ArrayList<>();
        listaDeMetodos.add(new CartaoCredito(15000,"10/01/99"));
        listaDeMetodos.add(new BoletoBancario(50,"25/05/26"));
        listaDeMetodos.add(new TransferenciaBancaria(80000,"29/10/25"));

        for(Pagamento pagamento: listaDeMetodos){
            pagamento.exibirDetalhe();
            if(pagamento instanceof TransferenciaBancaria){
                pagamento.processarPagamento();
                ((TransferenciaBancaria) pagamento).confirmarTransacao();
            }
            if(pagamento instanceof BoletoBancario){
                pagamento.processarPagamento();
                ((BoletoBancario) pagamento).gerarBoleto();
            }
            if(pagamento instanceof CartaoCredito){
                pagamento.processarPagamento();
            }
        }
    }
}


