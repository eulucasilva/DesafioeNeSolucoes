#language: pt
 @BuscarProduto @End2End
 Funcionalidade: Buscar produto
   Como cliente de uma loja virtual
   Eu desejo buscar produtos eletrônicos
   Para colocá-los em um carrinho e realizar compras

   Contexto:
     Dado que o usuario esteja na pagina principal do sistema

   Cenario:
     Quando o usuario clica no campo Buscar e coloca o nome do produto desejado
     E clica na lupa
     Entao o sistema traz a lista de produtos
