public class Primeiro{
    
    private static String[] parametros;
    private static int idade;
    private static float salario;
    private static String nome;
    private static String sobrenome;
    private static int qtdeMeses;
    private static boolean ehJava;
     
    private static void tratarParametros(){

	    nome = parametros[0];
		sobrenome = parametros[1];
	    String nome = parametros[0];
		String sobrenome = parametros[1];
		idade = Integer.valueOf(parametros[2]);
		salario = Float.valueOf(parametros[3]);
		qtdeMeses = Integer.valueOf(parametros[5]);
		ehJava = "S".equalsIgnoreCase(parametros[4]) ? true : false; //-> estrutura ternario.
    }
    
    private static boolean validar(int qtde){
        return qtde == 6;
    }
    
    private static int definirAnoNascimento(){
        return 2021 - idade;
    }
    
    private static float calcularValorTotal(){
        return qtdeMeses * salario;
    }
    
    private static String obterPerfilPorIdade(){
        return idade < 50 ? "Iniciante." : "Veterano.";
    }
    
    private static String obterPerfilPorSalario(){
        return salario > 1000 ? "Estável" : "Instável";
    }
    
    private static void imprimir(){
        
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Nascimento: " + definirAnoNascimento());
        System.out.println("SalÃ¡rio: " + salario);
        System.out.println("Java? " + ehJava);
        System.out.println("Salario Total: " + calcularValorTotal());
        System.out.println("Nivel: " + obterPerfilPorIdade());
        System.out.println("Situação: " + obterPerfilPorSalario());

    private static boolean validar(){
        if(args.length ==6){
            return true;
        }
        return false;

    }
    
    public static void main(String[] args){
	
		if(validar(args.length)){
	        parametros = args;
	        tratarParametros();
	        imprimir();

		if(validar()){
	        parametros = args;
	        
	        tratarParametros();
	        
	        int anoNascimento = 2021 - idade;
	        float salarioTotal = salario * qtdeMeses;
	
	        String nivel = idade < 50 ? "iniciante" : "veterano";
	        String situacao = salario > 1000 ? "estavel" : "instavél";
	
	        System.out.println("Nome: " + nome);
	        System.out.println("Sobrenome: " + sobrenome);
	        System.out.println("Idade: " + idade);
	        System.out.println("Nascimento: " + anoNascimento);
	        System.out.println("SalÃ¡rio: " + salario);
	        System.out.println("Java? " + ehJava);
	        System.out.println("Salario Total: " + salarioTotal);
	        System.out.println("Nivel: " + nivel);
	        System.out.println("Situação: " + situacao);
	            
		} else {
			System.out.println("Problemas na quantidade de parametros.");
	        }
	}
}