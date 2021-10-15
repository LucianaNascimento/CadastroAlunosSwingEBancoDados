
public class Aluno {
    private String ra;
    private String cpf;
    private String rg;
    private String nome;
    private String dataNas;
    private String email1;
    private String email2;
    private String dddTel;
    private String tel;
    private String dddCel;
    private String cel;
    private String cep;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String obs;
    private String dataCadastro;
    private String situacao;


    public Aluno (String ra, String nome){
        this.ra = ra;
        this.nome = nome;
    }
    
    public Aluno (){
       
       
    }

    public Aluno(String ra, String cpf, String rg, String nome, String dataNas, String email1, String email2, String dddTel, String tel, String dddCel, String cel, String cep, String rua, int numero, String bairro, String cidade, String uf, String obs, String dataCadastro, String situacao) {
        this.ra = ra;
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.dataNas = dataNas;
        this.email1 = email1;
        this.email2 = email2;
        this.dddTel = dddTel;
        this.tel = tel;
        this.dddCel = dddCel;
        this.cel = cel;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.obs = obs;
        this.dataCadastro = dataCadastro;
        this.situacao = situacao;
    }
    
    
    
    
    

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNas() {
        return dataNas;
    }

    public void setDataNas(String dataNas) {
        this.dataNas = dataNas;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getDddTel() {
        return dddTel;
    }

    public void setDddTel(String dddTel) {
        this.dddTel = dddTel;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDddCel() {
        return dddCel;
    }

    public void setDddCel(String dddCel) {
        this.dddCel = dddCel;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
    
    
    
    
    
}
