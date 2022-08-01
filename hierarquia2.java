public class Hierarquia {
   
    
    public static void main(String[] args) {
        
    // Objeto Karem e seus dados;
        Pessoa karem;
        karem=new Pessoa();
        karem.nome="Karem";
       // objeto diogo e seus Dados   
        Pessoa diogo;
        diogo=new Pessoa();
        diogo.nome="Diogo";
        diogo.c=karem;
        // objeto teodoro e seus dados
        Pessoa teodoro;
        teodoro=new Pessoa();
        teodoro.nome="Teodoro";
        //objeto arthur e seus dados
        Pessoa arthur ;
        arthur=new Pessoa();
        arthur.nome="Arthur";
        arthur.c=teodoro;
        // Objeto alice e seus dados
        Pessoa alice;
        alice=new Pessoa();
        alice.nome="Alice";
        alice.f=arthur;
        //objeto Carlos e seus respectivos dados
        Pessoa carlos;
        carlos=new Pessoa();
        carlos.nome="Carlos";
        // Objeto bianca e seus dados
        Pessoa bianca;
        bianca=new Pessoa();
        bianca.nome="Bianca";
        bianca.m=alice;
        bianca.p=carlos;
        // objeto Ricardo e seus dados
        Pessoa ricardo;
        ricardo=new Pessoa();
        ricardo.nome="Ricarcdo";
        ricardo.f=arthur;
        // objeto antonio e seus dados
        Pessoa antonio;
        antonio=new Pessoa();
        antonio.nome="Antonio";
        
        // Objeto jaime e seus dados
        Pessoa jaime;
        jaime=new Pessoa();
        jaime.nome="Jaime";
        jaime.c=bianca;
        jaime.p=antonio;
        
        // filha do jaime e da binca
        Pessoa dolores;
        dolores=new Pessoa();
        dolores.nome="Dolores";
        dolores.m=bianca;
        dolores.p=jaime;
        // Objeto pietra e seus dados
        
        Pessoa fernanda;
        fernanda=new Pessoa();
        fernanda.nome="Fernanda";
        // Objeto Joana e seus dados
        Pessoa joana;
        joana=new Pessoa();
        joana.nome="Joana";
 
        
        Pessoa pietra;
        pietra=new Pessoa();
        pietra.nome="Pietra";
        pietra.f=jaime;
        pietra.m=joana;
        
        //objeto var1 se referindo ao nome Rodolfo
        Pessoa var1;
        var1=new Pessoa();
        var1.nome="Rodolfo";
        var1.m=pietra;
        var1.p=antonio;
        antonio.f=var1;
 
        // Imprimindo as hierarquia: 
        //System.out.println(var1.nome); // Rodolfo 
       // System.out.println(var1.m.f.c.nome); // Bianca
       // System.out.println(var1.p.f.m.m.nome);//joana
       // System.out.println(var1.m.f.c.m.f.nome); // Arthur
       
        
      
        pietra.faleONomeDaSuaAvoMaterna();
        pietra.faleONomeDoSeuAvoMaterno();
        pietra.faleONomeDaSuaAvoPaterna();
        pietra.faleONomeDoSeuAvoPaterno();
        
        System.out.println("\n>>>> Antonio>>>>\n");
        
        antonio.faleONomeDaSuaAvoMaterna();
        antonio.faleONomeDoSeuAvoMaterno();
        antonio.faleONomeDaSuaAvoPaterna();
        antonio.faleONomeDoSeuAvoPaterno();
        
        System.out.println("\n>>>> Rodolfo>>>>\n");
        var1.faleONomeDaSuaAvoMaterna();
        var1.faleONomeDoSeuAvoMaterno();
        var1.faleONomeDaSuaAvoPaterna();
        var1.faleONomeDoSeuAvoPaterno();
        
        System.out.println("\n>>>> Dolores>>>>\n");
        dolores.faleONomeDaSuaAvoMaterna();
        dolores.faleONomeDoSeuAvoMaterno();
        dolores.faleONomeDaSuaAvoPaterna();
        dolores.faleONomeDoSeuAvoPaterno();
         
        
    }

static class Pessoa {

        String nome;
        Pessoa m; // mãe
        Pessoa p; // pai
        Pessoa f; // filho(a)  favorito (a)
        Pessoa c; // cônjugue
        
        public void falae_O_Nome_da_ou_conj(){
             if(c==null){
                 System.out.println("Sem conjugue");
             }else{
                 System.out.println(this.c.nome);
             }
        }
         public void falae_O_Nome_da_sua_mae(){
             if(m==null){
                 System.out.println("Sem mãe");
             }else{
                 System.out.println(this.m.nome);
             }
        }
          public void fale_O_Nome_de_seu_pai(){
              if(p==null){
                  System.out.println("Procura-se");
              }else{
                    System.out.println(this.p.nome);
              }
        
        }
         public void faleONomeDaSuaAvoMaterna(){
             if(m==null || m.m==null ){
                 System.out.println("Sem avó Materna");
             }else{
                 System.out.println(this.m.m.nome);
             }
         }
        public void faleONomeDoSeuAvoMaterno(){
             if(p==null || p.p==null ){
                 System.out.println("Sem avô Materno");
             }else{
                 System.out.println(this.p.p.nome);
             }
         }
        public void faleONomeDoSeuAvoPaterno(){
             if(p==null || p.m==null ){
                 System.out.println("Sem avô Paterno");
             }else{
                 System.out.println(this.p.m.nome);
             }
         }
        public void faleONomeDaSuaAvoPaterna(){
            if(m==null || m.p==null){
                System.out.println("Sem avó Paterna");
            }else{
                System.out.println(this.m.p.nome);
            }
        }
    }
}
