# Sistema-de-gest-o-de-cl-nica
Sistema eficaz e eficiente para a gerência dos processos internos de uma clinica

Descrição do Projeto

Este projeto é um sistema simples de clínica desenvolvido em Java para fins escolares.
O objetivo do sistema é simular o funcionamento básico de uma clínica através de um menu interativo no terminal.
O programa permite navegar entre diferentes módulos usando números do teclado.


Objetivo do Projeto

O sistema foi criado para:
praticar programação em Java;
aprender estruturas de decisão (switch);
utilizar estruturas de repetição (do while);
trabalhar com entrada de dados usando Scanner;
trabalhar com Strings e arrayList;
trabalhar com registros;
simular um sistema real de forma simples.

Funcionalidades do Sistema

O menu principal possui as seguintes opções:
Opção	Função
  1	Cadastrar Paciente
  2	Marcar Consulta
  3	Ver Consultas
  4	Lista de Médicos
  5	Pagamentos
  6	Estoque de Remédios
  7	Relatórios
  0	Sair do Sistema

Funcionamento Geral do Sistema
1. Cadastro do Paciente
  Quando um paciente chega à clínica, ele pode ser cadastrado no sistema.
  O cadastro serve para registrar o paciente e permitir que ele utilize os serviços da clínica.

2. Marcação de Consulta
  Depois de cadastrado, o paciente pode marcar uma consulta.
  A consulta representa o atendimento que será realizado por um médico da clínica.

3. Visualização das Consultas
  O sistema permite visualizar as consultas marcadas.
  Isso ajuda a clínica a organizar os atendimentos do dia.

4. Lista de Médicos
  Existe uma área para visualizar os médicos disponíveis na clínica.
  Essa funcionalidade ajuda na organização dos profissionais responsáveis pelos atendimentos.

5. Pagamentos
  Após o atendimento, a clínica pode registrar os pagamentos realizados pelos pacientes.
  Essa parte representa o controle financeiro básico da clínica.

6. Controle de Remédios
  O sistema também possui um controle simples de remédios.
  Isso ajuda a acompanhar os medicamentos disponíveis na clínica.

7. Relatórios
  A clínica pode gerar relatórios simples do sistema.
  Os relatórios ajudam a visualizar informações importantes sobre o funcionamento da clínica.

Classes do Sistema

Paciente
Representa os pacientes da clínica.
Atributos:
  id
  nome
  idade
  sexo
  telefone
  endereço
Métodos:
  cadastrarPaciente()
  listarPacientes()
  buscarPaciente()
  Medico

Representa os médicos da clínica.
Atributos:
  id
  nome
  especialidade
  telefone
  horárioDisponivel
Métodos:
  listarMedicos()
  adicionarMedico()
  Consulta

Responsável pelas consultas médicas.

Atributos:
idConsulta
paciente
medico
data
hora
estadoConsulta
Métodos:
marcarConsulta()
listarConsultas()
cancelarConsulta()
Pagamento

Controla os pagamentos da clínica.

Atributos:
  idPagamento
  paciente
  valor
  metodoPagamento
  dataPagamento
Métodos:
  registrarPagamento()
  listarPagamentos()
  Medicamento

Responsável pelo estoque de remédios.

Atributos:
  idMedicamento
  nome
  quantidade
  validade
  preco
Métodos:
  adicionarMedicamento()
  atualizarEstoque()
  listarMedicamentos()
  Relatorio
