package ex0209;
import java.io.File;
import java.io.IOException;


public class Ex0209 {

    public static void main(String[] args) throws IOException{
        File f= new File("c:/ex0209/Isaac/");
       //Verificando se Existe um diretório para Isaac, Caso não exista, ele 
       //utiliza o metodo mkdirs para criar um diretório
        if (f.exists()){
            System.out.println("Existe Diretório");
        }else{
            System.out.println("Não existe Diretório em : " + f);
            System.out.println("\n>>>>>> Criando um diretório<<<<<<<\n");
             if(f.mkdirs()){
                 System.out.println("Foi criado um Diretório em: " + f);
             }else{
                 System.out.println("Não foi criado o diretório");
             }
        }
        
        //Criando um arquivo dentro do diretório c:/ex0209/Isaac/
     File familia1= new File("c:/ex0209/Isaac/Franscico.txt");
        if(familia1.createNewFile()){
            System.out.println("Foi criado um arquivo no diretório : " + familia1);
        }else{
            System.out.println("Não foi criado um arquivo");
        }
        File familia2= new File("c:/ex0209/Isaac/Celina.txt");
        if(familia2.createNewFile()){
            System.out.println("Foi criado um arquivo no diretório : " + familia2);
        }else{
            System.out.println("Não foi criado um arquivo");
        }
        File familia3= new File("c:/ex0209/Isaac/meire.txt");
        if(familia3.createNewFile()){
            System.out.println("Foi criado um arquivo no diretório : " + familia3);
        }else{
            System.out.println("Não foi criado um arquivo");
        }
        
        
        //Mostrar o número de bytes que o arquivo vovo.txt
        
        File vovo=new File("c:/ex0209/vovo.txt");
         System.out.println("\n____________Verificando se existe diretório__________________\n");
         System.out.println();
        if (vovo.exists()){
            System.out.println("Existe um diretório em :" + vovo);
            System.out.println("\n________Mostrando os bytes_________\n");
            System.out.println("Número de Bystes: " + vovo.length());
       
        }else{
            System.out.println("Não existe um diretório");
        }
        //Alterando o nome do arquivo no diretório
        System.out.println("\n_______ Alterando o nome arquivo no diretório_____________\n");
         File vovo1=new File("c:/ex0209/vovo.txt");
         File novo_Nome= new File("c:/ex0209/Isabel.txt");
         if (vovo1.renameTo(novo_Nome)){
             System.out.println("Nome de Arquivo renomeado com sucesso!");
             
         }else{
             System.out.println("Error!");
         }
       
         // Delteando o arquivo vizinho.txt
         File vizinho=new File("c:/ex0209/vizinho.txt");
         System.out.println("\n_________Deletando o Arquivo :  " + vizinho + "_______________\n");
         if(vizinho.delete()){
             System.out.println("Foi Deletado com Sucesso");
         }else{
             System.out.println("Não foi deletado");
         }
         // Verificação de existencia de arquivo
       File arq=new File("c:\\Windows\\win.ini ");
       System.out.println("\n___________VERIFICANDO SE O ARQUIVO " + arq + "EXISTE__________\n");
       if(arq.exists()){
           System.out.println("O arquivo " + arq + " Existe");
       }else{
           System.out.println("Não Existe esse arquivo");
       }
    }
    
}
