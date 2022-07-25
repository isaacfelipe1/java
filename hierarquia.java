package hierarquia;

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
        // Objeto jaime e seus dados
        Pessoa jaime;
        jaime=new Pessoa();
        jaime.nome="Jaime";
        jaime.c=bianca;
        // Objeto pietra e seus dados
        Pessoa pietra;
        pietra=new Pessoa();
        pietra.nome="Pietra";
        pietra.f=jaime;
        // Objeto Joana e seus dados
        Pessoa joana;
        joana=new Pessoa();
        joana.nome="Joana";
        //Objeto antonio e seus dados
        
        //objeto var1 se referindo ao nome Rodolfo
        Pessoa var1;
        var1=new Pessoa();
        var1.nome="Rodolfo";
        var1.m=pietra;
        
        
     
        
        // Imprimindo as hierarquia: 
        System.out.println(var1.nome); 
        System.out.println(var1.m.f.c.nome);
        //System.out.println(var1.p.f.m.m.nome);
        System.out.println(var1.m.f.c.m.f.nome);
   
    }

    static class Pessoa {

        String nome;
        Pessoa m; // mãe
        Pessoa p; // pai
        Pessoa f; // filho(a)  favorito (a)
        Pessoa c; // cônjugue
    }
}
