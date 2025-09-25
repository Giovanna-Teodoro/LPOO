import java.util.ArrayList;
import java.util.List;

abstract class Veiculo {
    private String placa;
    private String marca;
    private int ano;

    Veiculo(String placa, String marca, int ano){
        this.placa=placa;
        this.marca=marca;
        this.ano=ano;

    }

    public void setPlaca(String placa){
        this.placa=placa;
    }

    public String getPlaca(){
        return this.placa;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getMarca(){
        return this.marca;

    }

    public void setAno(int ano){
        this.ano=ano;
    }

    public int getAno(){
        return this.ano;
    }


    
    public abstract double calcularDiaria();

    public void exibirDados(){
        System.out.println("Placa:"+this.placa);
        System.out.println("Marca:"+this.marca);
        System.out.println("Ano:"+this.ano);
    }

    
}

class Carro extends Veiculo{

    Carro(String placa, String marca, int ano){
        super(placa,marca,ano);
       
    }

    @Override
    public double calcularDiaria(){
        return 150.0;
    } 

}

class Moto extends Veiculo{
    
    Moto(String placa, String marca, int ano){
        super(placa,marca,ano);
        
    }

    @Override
    public double calcularDiaria(){
        return 70.0;
    }
}


class Locadora{
    public static void main(String[] args){
        List<Veiculo> veiculosParaAlugar= new ArrayList<>();

        veiculosParaAlugar.add(new Carro("AMRH","Ford",2015));
        veiculosParaAlugar.add(new Moto("KOOOL","HOnda", 2023));

        for(Veiculo veiculo: veiculosParaAlugar){
            veiculo.exibirDados();
            System.out.println("O valor da diária R$"+veiculo.calcularDiaria());
            System.out.println("----------");
        }

    }
    
}