public class TestaEscopo {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 18;
        int quantidadePessoas = 3;
        boolean acompanhado;
        
        //boolean acompanhado = quantidadePessoas >= 2;

        if(quantidadePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        
        System.out.println("valor de acompanhado = " + acompanhado);
        if (idade >= 18 && acompanhado) {
            System.out.println("seja bem vindo");
        } 
        else {
            System.out.println("Infelizmente, voce nao pode entrar");
        }
    }
}

