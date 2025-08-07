public class movie {
    String titulo; //nome do movie
    String gener; // genero do filme
    int classificacao; // idade mínima para o filme

    // métodos da classe 
    void playit(){
        System.out.println("O filme está sendo reproduzido: " + titulo);
    }
    
}

// Classe que possui a main 

class MainMovie{

    public static void main (String[] args){
        //Criar novos objetos do tipo movie

        movie m = new movie();
        m.titulo= "Como treinar seu dragão";
        m.gener="Animação";
        m.classificacao=0;
        m.playit();
        
    }
}


