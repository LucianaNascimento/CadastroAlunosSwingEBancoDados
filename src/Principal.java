import java.util.List;
 import java.util.Scanner;
 
public class Principal {
 
     public static void main(String[] args) {
         
         JFAluno faluno;
         faluno = new JFAluno();
         faluno.setVisible(true);
         
         
//         int op = 99;
//         Scanner leia;       
//                 
//         leia = new Scanner(System.in);
//       
//         Aluno alu;
//         alu = new Aluno();
//         
//         AlunoDAO dao;
//         dao = new AlunoDAO();
//              
//         while (op != 0) {
//             System.out.println("=============================================================================");
//             System.out.println("1 - Testar Conexao");
//             System.out.println("2 - Incluir");
//             System.out.println("3 - Consultar");
//             System.out.println("4 - Listar");
//             System.out.println("5 - Excluir");
//             System.out.println("0 - SAIR");
//             System.out.print("Opção: ");
//             op = leia.nextInt();
//             switch(op) {
//                 case 1:
//                        Conexao.getConexao();
//                        break;
//                 case 2:
//                      
//                      System.out.print("RA: ");
//                      alu.setRa(leia.next());
//                      
//                      System.out.print("Nome: ");
//                      alu.setNome(leia.next());
//                      
//                      System.out.print("Email: ");
//                      alu.setEmail(leia.next());
//                      
//                      System.out.print("Idade: ");
//                      alu.setIdade(leia.nextInt());
//                      
//                      dao.adicionarAluno(alu);  
//                      break;
//                   
//                 case 3:
//                      String ra;
//                                         
//                      System.out.print("RA: ");
//                      ra = leia.next();
//                                           
//                      alu = dao.consultaAlunoPorRA(ra);
//                      if (alu != null) {
//                          System.out.println("RA  :  " + alu.getRa());
//                          System.out.println("Nome:  " + alu.getNome());
//                          System.out.println("Email: " + alu.getEmail());      
//                      }
//                      else {
//                          System.out.println("Aluno nao cadastrado");
//                      }
//                      break;
//                      
//                 case 4 : 
//                     List<Aluno> lst;
//                     lst = dao.listarAlunos();
//                     if (lst != null) {
//                         for (Aluno i : lst) {
//                             System.out.println(" | " + i.getRa() + " | " + i.getNome() + " | " + i.getEmail() + " | ");
//                         }
//                     }
//                     else {
//                         System.out.println("Aluno não cadastrado!!");
//                     }
//                     break;
//                     
//                 case 5:                                                      
//                     System.out.print("RA: ");
//                     ra = leia.next();                
//                     dao.excluirAluno(ra);
//                     break;
//             }           
//         }        
     }   
 }

