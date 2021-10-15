# CadastroAlunosSwingEBancoDados
App Java Swing de cadastro de alunos, com Banco de Dados.

Telas:

Tela de cadastro:

![image](https://user-images.githubusercontent.com/85845319/137441486-9504a0f5-8890-4e0f-ba5b-e1e2d4471462.png)

Tela de consulta:

![image](https://user-images.githubusercontent.com/85845319/137441600-fde4e952-359a-46f2-ad9b-bf18d2444193.png)




Banco de Dados:

nome:
bdalunocompleto

Dados para a criação da tabela:

CREATE TABLE aluno  (
   alu_ra  varchar(15) NOT NULL,
   alu_cpf  varchar(14),
   alu_rg  varchar(14),
   alu_nome  varchar(60),
   alu_dataNasc  varchar(10),
   alu_email1  varchar(60),
   alu_email2  varchar(60),
   alu_dddtel  varchar(2),
   alu_telefone  varchar(20),
   alu_dddcel  varchar(2),
   alu_celular  varchar(20),
   alu_cep  varchar(9),
   alu_rua  varchar(60),
   alu_numero  int,
   alu_bairro  varchar(30),
   alu_cidade  varchar(30),
   alu_uf  varchar(2),
   alu_observacao  varchar(120),
   alu_dataCadastro  varchar(10),
   alu_situacao  varchar(1),
   PRIMARY KEY ( alu_ra )
)
