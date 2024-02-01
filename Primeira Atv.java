class Carro {
    // Atributos da classe
    private String marca; // Atributo privado para encapsulamento
    private int modelo;
    private int Ano;
    private int Cor;
    private int VelocidadeA;  
    
    // Método construtor da classe para inicializar os atributos
    Carro(String marca, int modelo, int Ano, int Cor, int VelocidadeA) {
        this.marca = marca;
        this.modelo = modelo;
        this.Ano = Ano;
        this.Cor = Cor;
        this.VelocidadeA = VelocidadeA;
    }
    
    // Método getter para obter o nome da pessoa
    public String getmarca() {
        return marca;
    }
    
    // Método getter para obter a idade da pessoa
    public int getmodelo() {
        return modelo;
    }

    public int getAno() {
        return Ano;
    }
    
    public int getCor() {
        return Cor;
    }
    
    public int getVelocidadeA() {
        return VelocidadeA;
    }    
}

// Classe principal que contém o método main
public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe carro chamado "carro1"
        Carro carro1 = new Carro("Hyundai", 2017);
        
        // Usando os métodos getters para obter e imprimir as informações do Carro
        System.out.println("marca: " + carro1.getmarca()); // Obtém e imprime o marca do Carro
        System.out.println("modelo: " + carro1.getmodelo()); // Obtém e imprime o modelo do Carro
        System.out.println("Ano: " + carro1.getAno()); // Obtém e imprime o ano do Carro
        System.out.println("Cor: " + carro1.getCor()); // Obtém e imprime a cor do Carro
        System.out.println("VelocidadeA: " + carro1.getVelocidadeA()); // Obtém e imprime a velocidade atual do Carro
    }
}

