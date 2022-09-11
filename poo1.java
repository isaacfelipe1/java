public class Exemplo1{
	public static void main(String[] args){
		Paciente paciente1;
		paciente1=new Paciente();
		
		Paciente paciente2;
		paciente2=new Paciente();
		
		Paciente paciente3;
		paciente3=new Paciente();
		
		paciente1.nome="Maria";
		paciente1.peso=63.0;
		paciente1.altura=1.58;
		paciente1.diaNascimento=5;
		paciente1.mesNascimento=2;
		paciente1.anoNascimento=2003;
		
		
		
		paciente2.nome="Ana";
		paciente2.peso=74.0;
		paciente2.altura=1.78;
		paciente2.diaNascimento=17;
		paciente2.mesNascimento=10;
		paciente2.anoNascimento=2002;
		
		
		
		
		paciente3.nome="Joaquim";
		paciente3.peso=52.0;
		paciente3.altura=1.68;
		paciente3.diaNascimento=11;
		paciente3.mesNascimento=11;
		paciente3.anoNascimento=2000;
		
		
		paciente1.mostrarDados(10,11,2020);
		paciente2.mostrarDados(10,11,2020);
		paciente3.mostrarDados(10,11,2020);
		 
		
		
	}


}

class Paciente {
	
	String nome;
	double peso, altura;
	int diaNascimento, mesNascimento, anoNascimento;
	
	//Assinatura do mÃ©todo;
	
	public void mostrarDados(int diaAtual, int mesAtual, int anoAtual){
		double imc;
		int idade;
		System.out.println("Nome:" + this.nome);
		System.out.println("Peso:" + this.peso);
		System.out.println("Altura:" + this.altura);
		imc=calcularIMC();
		System.out.println("IMC:" + imc);
		idade=obterIdade(diaAtual,mesAtual,anoAtual);
		System.out.println("Idade:" + idade);
		
	}
	
	double calcularIMC(){
		double imc;
		imc=peso/(altura*altura);
		return imc;
	}
	
	int obterIdade(int diaAtual, int mesAtual, int anoAtual){
		int idade;
		idade= anoAtual-anoNascimento;
		if (mesAtual<mesNascimento){
			idade--;
		}else if(mesAtual==mesNascimento && diaAtual<diaNascimento){
			
			idade--;
		}
		
		return idade;
		
	}
	
}
