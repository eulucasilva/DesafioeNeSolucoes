#language: pt
@AdicionarCarrinho @End2End
Funcionalidade: Adicionar produto ao carrinho
	Como cliente de uma loja virtual
	Eu desejo buscar produtos eletrônicos
	Para colocá-los em um carrinho e realizar compras

	Contexto:
		Dado que o usuario esteja na pagina principal do sistema
		Quando o usuario clica no campo Buscar e coloca o nome do produto desejado
		E clica na lupa
		E o sistema traz a lista de produtos
		
	@AdicionarProdutoCarrinho
	Cenario: Adicionar produto ao carrinho
		Quando o usuario seleciona o produto desejado
		E adiciona ao carrinho
		Entao o sistema devera inserir o produto no carrinho

		
		
#	@RemoverProdutoCarrinho
#	Cenario: Remover produto ao carrinho
#		Quando o usuario selecionar o produto
#		E clicar para remover do carrinho 
#		Entao o sistema devera excluir o produto ao carrinho