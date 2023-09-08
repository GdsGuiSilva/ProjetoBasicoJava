/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetochamada;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author guilherme.silva
 */
public class ProjetoChamada {
    EntradaDados entdados;
    List<Chamada> chamada;
    public ProjetoChamada()
            {
                entdados = new EntradaDados();
                chamada = new ArrayList<>();
            }
    public void Menu()
    {
        System.out.println("================");
        System.out.println("Digite a opção que deseja ");
        System.out.print("Opção 1 para cadastro");
        System.out.print("Opção 2 para listar");
        System.out.print("Opção zero para sair");
        int opc = entdados.LerInteiro("Opção digitada :");
        while(opc != 0)
        {
            switch(opc)
            {
                    case 0:
                        System.out.println("Saindo da aplicação");
                        break;
                    case 1:
                        LerDados();
                        System.out.println("CADASTRO FEITO COM SUCESSO!!");
                        break;
                    case 2:
                    System.out.println(chamada);
                    break;
            }
        System.out.println("================");
        System.out.println("Digite a opção que deseja ");
        System.out.print("Opção 1 para cadastro");
        System.out.print("Opção 2 para listar");
        System.out.print("Opção zero para sair");
        opc = entdados.LerInteiro("Opção digitada :");
                        
        }
    }
                public void LerDados()
                {
                    String codigo = entdados.LerString("Digite o codigo do aluno :");
                    String turma = entdados.LerString("Digite o nome da turma :");
                    String nomealuno = entdados.LerString("Digite o nome do aluno :");
                    chamada.add(new Chamada(codigo,turma,nomealuno));
                }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProjetoChamada chama = new ProjetoChamada();
        chama.Menu();
        // TODO code application logic here
}

    private List<Chamada> Lerdados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}