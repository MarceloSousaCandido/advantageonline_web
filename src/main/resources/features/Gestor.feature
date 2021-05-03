#language: pt
#encoding: UTF-8
Funcionalidade: Gestor de Orcamento - Despesa
  
  Eu enquanto usuario Necessito organizar minhas financas Para que eu consiga cortar gastos desnecessarios e poupar dinheiro

  Cenario: Adicionar uma nova transacao/despesa
    Dado que o usuario acione o botao adicionar
    Quando selecionar o tipo de transacao "DESPESAS"
    E informar o valor de "33,00"
    E informar a categoria "Compras de mercado"
    E informar a data de "hoje"
    E clicar no botao "Adicionar"
    Entao o app adiciona uma nova despesa com as informacoes:
      | DESPESAS           |
      | Compras de Mercado |
