class Dog{
    int size; //tamanho do Dog
    String breed; // raça do dog
    String name; // nome do dog

    //Métodos
    void bark(){
        System.out.println("Cachorro " + name +" está latindo!");
        System.out.println("Ruff! Ruff!");
    }
}

// Classe que possui a main

class MainTestDrive{
    public static void main (String[] args){
        //Criar novos objetos do tipo dog 

        Dog thor = new Dog();
        // thor.name= "";
        thor.breed= "Pastor Alemão";
        thor.size= 15;
        thor.bark();

        Dog sadan = new Dog();
        //sadan.name="";
        sadan.breed="Pitbull";
        sadan.size=26;
        sadan.bark();

    }
    
}