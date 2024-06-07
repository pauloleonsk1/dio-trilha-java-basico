import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = terminal.nextInt();

        try{
        validar(parametroUm, parametroDois);
        contar(parametroUm, parametroDois);
            
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }

    }

    static void validar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroDois < parametroUm){
            throw new ParametrosInvalidosException();
        }
    }

    static void contar(int parametroUm, int parametroDois){
        for(int numero = 1, x = parametroDois; x >= parametroUm; numero++, x--){
            System.out.println("Imprimindo o "+numero+"º numero: "+x);
        }
    }
}


        
        

