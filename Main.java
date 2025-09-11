abstract class Animal{
    private String nome;
    private int fome;

    public String getNome(){
        return nome;
    }

    public int getFome(){
        return fome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setFome (int fome){
        this.fome=fome;
    }

    abstract public void vagar();

    public void comer(){
        System.out.println(getNome()+" animal está comendo.");
    }



}


abstract class Canino extends Animal{
    @Override
    public void vagar() {
        System.out.println(getNome()+" está vagando em bando...");
    }

    void uivar(){
        System.out.println(getNome()+" diz: Auuuuu!");
    }

}

class Cachorro extends Canino implements Pet{

    @Override
    public void brincar() {
        System.out.println(getNome() +" está brincando! ");
    }
    @Override
    public void sejaAMigavel() {
        System.out.println(getNome() + " está sendo amigo.");
    }

    
    public void abanaRabo(){
        System.out.println(getNome()+" abana o rabo.");
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(this.getClass() != obj.getClass()){
            return false; // objeto tem classes diferentes 
        }

        Cachorro c = (Cachorro) obj;

        if (this.getNome() ==  c.getNome() && this.getFome() == c.getFome()){
            return true;
        }else{
            return false;
        }
       
    }

    @Override
    public String toString() {
        return "Cachorro: " + 
                "\n Fome: " + getFome() +
                "\n Nome: " + getNome();
    }
}

interface Pet {
    // definir os métodos abstraodos
    abstract public void sejaAMigavel();
    abstract public void brincar();
}

public class Main{

    public static void main(String[] args){
        //Objeto cachorro com referencia cachorro
        Cachorro c1 = new Cachorro();
        c1.setNome("Kiara");
        c1.setFome(4);
        c1.abanaRabo();
        System.out.println(c1.toString());

        Canino c2 = new Cachorro();
        c2.setNome("Luba");
        c2.setFome(5);
        //c2.abanaRabo(); não funciona pois este metodo está relacionado a classe cachorro apenas 

        Animal c3 = new Cachorro();
        c3.setNome("Sara");
        c3.setFome(1);

    



    }

}
