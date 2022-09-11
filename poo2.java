public class Exemplo02{
 public static void main(String[]args){
	 ContaBancaria c1,c2;
	 c1=new ContaBancaria();
	 c2=new ContaBancaria();
	 
	 c1.banco="Bradesco";
	 c1.agencia="12345";
	 c1.conta="54321";
	 c1.titular="Maria Silva";
	 
	 c2.banco=" Caixa";
	 c2.agencia="4321";
	 c2.conta="12345";
	 c2.titular="Joaquim Souza";
	 c1.depositar(50.0);
	 c2.depositar(30.0);
	 
	 c1.sacar(25.0);
	 c2.sacar(35.0);
	 c1.mostrarInformacoes();
	 c2.mostrarInformacoes();
 
 
 }


}

class ContaBancaria{
 String banco, agencia, conta, titular;
 double saldo;
   void mostrarInformacoes(){
	  System.out.println("Banco :" + banco);
	  System.out.println("Agencia:" +  agencia);
	  System.out.println("Conta :" + conta);
	  System.out.println("Titular :" + titular);
	  System.out.println("Saldo :" + saldo);
  }
  void depositar(double valor){
  saldo+=valor;
  
  
  }
  

  double obterSaldo(){
  return saldo;
  
  }
  boolean sacar( double valor){
  if ( saldo >=valor){
		saldo-=valor;
		return true;
  
  }else{
  
   return false;
  }
  
  }
}
