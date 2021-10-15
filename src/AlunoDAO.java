import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AlunoDAO {
    String sSql;
    Connection con;
    PreparedStatement pstmt;
    
    public void adicionarAluno(Aluno a){
        try{
            //1º abrir conexao
            //2º executar a instrucao SQL
            //3º setar parametros
            //4º executar a instrucao SQL
            //5º fechar conexao
            
            
            con = Conexao.getConexao();
            pstmt = con.prepareStatement("INSERT INTO ALUNO(alu_ra,"
            + "alu_nome, alu_cpf, "
                          + "alu_rg, alu_datanasc, alu_email1, alu_email2,"
                          + "alu_dddtel, alu_telefone, alu_dddcel, "
                          + "alu_celular, alu_cep, alu_rua, alu_numero, "
                          + "alu_bairro, alu_cidade, alu_uf, alu_observacao, "
                          + "alu_dataCadastro, alu_Situacao) " 
                          + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ? )");
            pstmt.setString(1, a.getRa());
            pstmt.setString(2, a.getNome());
            pstmt.setString(3, a.getCpf());
            pstmt.setString(4,a.getRg());
            pstmt.setString(5,a.getDataNas());
            pstmt.setString(6,a.getEmail1());
            pstmt.setString(7,a.getEmail2());
            pstmt.setString(8,a.getDddTel());
            pstmt.setString(9,a.getTel());
            pstmt.setString(10,a.getDddCel());
            pstmt.setString(11,a.getCel());
            pstmt.setString(12,a.getCep());
            pstmt.setString(13,a.getRua()); 
            pstmt.setInt(14,a.getNumero()); 
            pstmt.setString(15,a.getBairro());
            pstmt.setString(16,a.getCidade());
            pstmt.setString(17,a.getUf());                
            pstmt.setString(18,a.getObs());
            pstmt.setString(19,a.getDataCadastro());
            pstmt.setString(20,a.getSituacao());
            
            
            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
                    
        }
        catch(SQLException erro){
            System.out.println("Erro ao gravar cliente" + erro.getMessage());
        }
        
    }
    
    // ---------------------------------------------------------------------------------
       
      public Aluno consultaAlunoPorRA(String ra) {
           ResultSet rs;
           Aluno a;
           a = new Aluno();
           con = null;
  
           sSql = "SELECT alu_ra, alu_nome, alu_rg, alu_cpf,alu_dataNasc, alu_email1,"
               + " alu_email2, alu_dddtel, alu_telefone, alu_dddcel, alu_celular,"
               + " alu_rua, alu_numero, alu_observacao, alu_bairro, alu_cep, "
               + " alu_cidade, alu_uf, alu_dataCadastro, alu_situacao FROM aluno "
                  + "WHERE alu_ra = ? "; 
             //System.out.println(sSql);
            try {           
                 con = Conexao.getConexao();
                 pstmt = con.prepareStatement(sSql);
                 pstmt.setString(1, ra);
                 rs = pstmt.executeQuery();
                 if (rs.next()) {
                   // a = new Aluno();
                    a.setRa(rs.getString("alu_ra"));
                    a.setNome(rs.getString("alu_nome"));
                    a.setRg(rs.getString("alu_rg"));
                    a.setCpf(rs.getString("alu_cpf"));
                    a.setDataNas(rs.getString("alu_dataNasc")); 
                    a.setEmail1(rs.getString("alu_email1"));                    
                    a.setEmail2(rs.getString("alu_email2")); 
                    a.setDddTel(rs.getString("alu_dddtel")); 
                    a.setTel(rs.getString("alu_telefone")); 
                    a.setDddCel(rs.getString("alu_dddcel")); 
                    a.setCel(rs.getString("alu_celular"));
                    a.setRua(rs.getString("alu_rua")); 
                    a.setNumero(rs.getInt("alu_numero")); 
                    a.setObs(rs.getString("alu_observacao"));
                    a.setBairro(rs.getString("alu_bairro")); 
                    a.setCep(rs.getString("alu_cep"));
                    a.setCidade(rs.getString("alu_cidade")); 
                    a.setUf(rs.getString("alu_uf")); 
                    a.setDataCadastro(rs.getString("alu_dataCadastro")); 
                    a.setSituacao(rs.getString("alu_situacao")); 
                    
                 }
               else {
                  //System.out.println("RA não cadastrado...");
                  a = null; 
               }  
               pstmt.close();
               rs.close();            
               con.close();
           } 
           catch (SQLException erro) {
               System.out.println("Erro ao consultar aluno - " + erro.getMessage());
           }
           return a;
       }
   // ---------------------------------------------------------------------------------
      public List<Aluno> listarAlunos() {
          List listadeAluno = new ArrayList();
          ResultSet rs;
          Aluno a;
          sSql = "SELECT alu_ra, alu_nome, alu_email1, alu_dataNasc FROM aluno";
          try {
              con = Conexao.getConexao();
              pstmt = con.prepareStatement(sSql);
              rs = pstmt.executeQuery();
              while (rs.next()) {
                  a = new Aluno();
                  a.setRa(rs.getString("alu_ra"));
                  a.setNome(rs.getString("alu_nome"));
                  a.setEmail1(rs.getString("alu_email1"));
                  a.setDataNas(rs.getString("alu_dataNasc"));
                  listadeAluno.add(a);                              
              }           
          } catch (SQLException erro) {
              listadeAluno = null;
              //System.out.println("Erro ao consultar aluno - " + erro.getMessage());
          }
          return listadeAluno;
      }
      
      
      // ---------------------------------------------------------------------------------
      public List<Aluno> consultarAlunoPorNome(String nome) {
          List <Aluno> listadeAluno;
          listadeAluno = new ArrayList<>();
          
          ResultSet rs;
          Aluno a;
          nome = "%" + nome + "%";
          
          sSql = "SELECT alu_ra, alu_nome, alu_email1 FROM aluno " + 
                  "WHERE alu_nome LIKE ? ORDER BY alu_nome";
          
          try {
              con = Conexao.getConexao();
              pstmt = con.prepareStatement(sSql);
              pstmt.setString(1, nome);
                            
              rs = pstmt.executeQuery();
              
              while (rs.next()) {
                  a = new Aluno();
                  a.setRa(rs.getString("alu_ra"));
                  a.setNome(rs.getString("alu_nome"));
                  a.setEmail1(rs.getString("alu_email1"));
                  
                  listadeAluno.add(a);                              
              }           
          } catch (SQLException erro) {
              listadeAluno = null;
//              System.out.println("Erro ao consultar aluno - " + erro.getMessage());
          }
          return listadeAluno;
      }
  // ---------------------------------------------------------------------------------
       
     public void excluirAluno(String ra)  {
         sSql = "DELETE FROM aluno WHERE alu_ra = ?";
         try {
             con = Conexao.getConexao();
             pstmt = con.prepareStatement(sSql);
             pstmt.setString(1, ra);
             pstmt.executeUpdate(); 
             pstmt.close();
             con.close();
         } catch (SQLException erro) {
            System.out.println("Erro ao excluir aluno - " + erro.getMessage());
         } 
     }
     
     
     
     // ---------------------------------------------------------------------------------
       
      public Aluno consultaAlunoPorEmail(String email) {
           ResultSet rs;
           Aluno a;
           a = new Aluno();
           con = null;
  
           sSql = "SELECT alu_ra, alu_nome, alu_rg, alu_cpf,alu_dataNasc, alu_email1,"
               + " alu_email2, alu_dddtel, alu_telefone, alu_dddcel, alu_celular,"
               + " alu_rua, alu_numero, alu_observacao, alu_bairro, alu_cep, "
               + " alu_cidade, alu_uf, alu_dataCadastro, alu_situacao FROM aluno "
                  + "WHERE alu_email1 = ?  or alu_email2 = ?";
             //System.out.println(sSql);
            try {           
                 con = Conexao.getConexao();
                 pstmt = con.prepareStatement(sSql);
                 pstmt.setString(1, email);
                 pstmt.setString(2, email);
                 
                 rs = pstmt.executeQuery();
                 if (rs.next()) {
                   // a = new Aluno();
                    a.setRa(rs.getString("alu_ra"));
                    a.setNome(rs.getString("alu_nome"));
                    a.setRg(rs.getString("alu_rg"));
                    a.setCpf(rs.getString("alu_cpf"));
                    a.setDataNas(rs.getString("alu_dataNasc")); 
                    a.setEmail1(rs.getString("alu_email1"));                    
                    a.setEmail2(rs.getString("alu_email2")); 
                    a.setDddTel(rs.getString("alu_dddtel")); 
                    a.setTel(rs.getString("alu_telefone")); 
                    a.setDddCel(rs.getString("alu_dddcel")); 
                    a.setCel(rs.getString("alu_celular"));
                    a.setRua(rs.getString("alu_rua")); 
                    a.setNumero(rs.getInt("alu_numero")); 
                    a.setObs(rs.getString("alu_observacao"));
                    a.setBairro(rs.getString("alu_bairro")); 
                    a.setCep(rs.getString("alu_cep"));
                    a.setCidade(rs.getString("alu_cidade")); 
                    a.setUf(rs.getString("alu_uf")); 
                    a.setDataCadastro(rs.getString("alu_dataCadastro")); 
                    a.setSituacao(rs.getString("alu_situacao")); 
                    
                 }
               else {
                  //System.out.println("RA não cadastrado...");
                  a = null; 
               }  
               pstmt.close();
               rs.close();            
               con.close();
           } 
           catch (SQLException erro) {
               System.out.println("Erro ao consultar aluno - " + erro.getMessage());
           }
           return a;
       }
      
      // ---------------------------------------------------------------------------------
      public List<Aluno> consultarAlunoPorEmail2(String email) {
          List <Aluno> listadeAluno;
          listadeAluno = new ArrayList<>();
          
          ResultSet rs;
          Aluno a;
                   
          sSql = "SELECT alu_ra, alu_nome, alu_email1 FROM aluno " + 
                  "WHERE alu_email1 = ? OR alu_email2 = ? ORDER BY alu_nome";
          
          try {
              con = Conexao.getConexao();
              pstmt = con.prepareStatement(sSql);
              pstmt.setString(1, email);
              pstmt.setString(2, email);
                            
              rs = pstmt.executeQuery();
              
              while (rs.next()) {
                  a = new Aluno();
                  a.setRa(rs.getString("alu_ra"));
                  a.setNome(rs.getString("alu_nome"));
                  a.setEmail1(rs.getString("alu_email1"));
                  
                  listadeAluno.add(a);                              
              }           
          } catch (SQLException erro) {
              listadeAluno = null;
//              System.out.println("Erro ao consultar aluno - " + erro.getMessage());
          }
          return listadeAluno;
      }
      
      
       public void editarAluno(Aluno a){
        try{
            //1º abrir conexao
            //2º executar a instrucao SQL
            //3º setar parametros
            //4º executar a instrucao SQL
            //5º fechar conexao
            
            
            con = Conexao.getConexao();
            pstmt = con.prepareStatement("update aluno set "
                    + "alu_nome     = ?, "
                    + "alu_cpf      = ?, "
                    + "alu_rg       = ?, "
                    + "alu_datanasc = ?, "
                    + "alu_email1   = ?, "
                    + "alu_email2   = ?, "
                    + "alu_dddtel   = ?, "
                    + "alu_telefone = ?, "
                    + "alu_dddcel   = ?, "
                    + "alu_celular  = ?, "
                    + "alu_cep      = ?, "
                    + "alu_rua      = ?, "
                    + "alu_numero   = ?, "
                    + "alu_bairro   = ?, "
                    + "alu_cidade   = ?, "
                    + "alu_uf       = ?, "
                    + "alu_observacao = ?, "
                    + "alu_dataCadastro = ?, "
                    + "alu_Situacao = ? " 
                    + "where alu_ra = ?");         
                                 
                    
            
            pstmt.setString(1, a.getNome());
            pstmt.setString(2, a.getCpf());
            pstmt.setString(3,a.getRg());
            pstmt.setString(4,a.getDataNas());
            pstmt.setString(5,a.getEmail1());
            pstmt.setString(6,a.getEmail2());
            pstmt.setString(7,a.getDddTel());
            pstmt.setString(8,a.getTel());
            pstmt.setString(9,a.getDddCel());
            pstmt.setString(10,a.getCel());
            pstmt.setString(11,a.getCep());
            pstmt.setString(12,a.getRua()); 
            pstmt.setInt   (13,a.getNumero()); 
            pstmt.setString(14,a.getBairro());
            pstmt.setString(15,a.getCidade());
            pstmt.setString(16,a.getUf());                
            pstmt.setString(17,a.getObs());
            pstmt.setString(18,a.getDataCadastro());
            pstmt.setString(19,a.getSituacao());
            pstmt.setString(20, a.getRa());
                       
            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
                    
        }
        catch(SQLException erro){
            System.out.println("Erro ao gravar cliente" + erro.getMessage());
        }
        
    }
     
 }

