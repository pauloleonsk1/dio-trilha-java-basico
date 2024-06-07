//Importando utilitario ThreadLocalRandom
import java.util.concurrent.ThreadLocalRandom;

//Importando utilitario Random
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        
        //Teste CASE 1
        /*
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
        */

        //Teste CASE 2
        /*
        selecionarCandidato();
        */

        //Teste CASE 3
        /*
        imprimirSelecionados()
        */
        //Teste CASE 4
        String [] candidatosSelecionados = {"Paulo","Eduardo","Cassiane","Gabrielle","Elizabeth"};

        for(String candidato: candidatosSelecionados){
           entrarEmContato(candidato);
        }
    }
    //CASE 1 (analisando candidatos)
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if(salarioBase==salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else{
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }
    }
    //CASE 2 (selecionando candidatos)
    static void selecionarCandidato(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatoAtual = 0;
        int candidatosSelecionados = 0;
        Double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = aleatorizarSalarioPretendido();

            System.out.println("O candidato "+candidato+" pretende receber R$ "+salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+candidato+" foi selecionado!");
                candidatosSelecionados++;
            }else{
                System.out.println("O candididato "+candidato+" não foi selecionado! :(");
            }
            candidatoAtual++;
        }


    }
    //Random CASE 2
    static double aleatorizarSalarioPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
   }
    //CASE 3
    static void imprimirSelecionados(){
        String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        
        //impressão quando precisa-se de indice
        System.out.println("Imprimindo usando o indice");
        for(int indice = 0; indice < candidatosSelecionados.length; indice++){
            System.out.println("O candidato de número "+(indice+1)+" é "+candidatosSelecionados[indice]);
        }
        
        System.out.println("imprimindo sem indice. Forma abreviada (for each)");
        for(String candidato: candidatosSelecionados){
            System.out.println("O candidato selecionado foi: "+candidato);
        }
    
    }
    //CASE 4 (método auxiliar)
    static boolean ligar(){
        return new Random().nextInt(3)==1;
    }
    //CASE 4
    static void entrarEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = ligar(); 
            continuarTentando = !atendeu;

            System.out.println("Ligando para "+candidato+"...");
            if(continuarTentando){
                System.out.println("O contato falhou! Tentando novamente...");
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso!");
            }

        }while(continuarTentando && tentativasRealizadas < 3);
        
        if (atendeu) {
            System.out.println("Conseguimos contato com "+candidato+" na "+tentativasRealizadas+"ª tentativa.");
        }else{
            System.out.println("Não conseguimos contato com "+candidato+" nas "+tentativasRealizadas+" tentativas.");
        }
    }

}
