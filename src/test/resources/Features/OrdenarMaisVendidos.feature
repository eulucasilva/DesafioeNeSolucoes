#language: pt
@MaisVendidos @End2End
Funcionalidade: Ordenar mais vendidos
  Como cliente de uma loja virtual
  Eu desejo buscar produtos eletrônicos
  Para colocá-los em um carrinho e realizar compras

  Contexto:
    Dado que o usuario esteja na pagina principal do sistema
    Quando o usuario clica no campo Buscar e coloca o nome do produto desejado
    E clica na lupa
    E o sistema traz a lista de produtos

  Cenario:
    Quando o usuario clica no campo Ordenar e seleciona os produtos mais vendidos
    Entao o sistema traz a lista de produtos ordenada
