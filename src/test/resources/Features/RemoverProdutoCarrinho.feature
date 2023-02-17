#language: pt
@RemoverCarrinho @End2End
Funcionalidade: Remover produto do carrinho

  Contexto:
    Dado que o usuario esteja na pagina principal do sistema
    Quando o usuario clica no campo Buscar e coloca o nome do produto desejado
    E clica na lupa
    E o sistema traz a lista de produtos
    E o usuario seleciona o produto desejado
    E adiciona ao carrinho
    Entao o sistema devera inserir o produto no carrinho

  @RemoverProdutoCarrinho
  Cenario: Remover produto do carrinho
    Quando o usuario clica no carrinho
    E clica em excluir no produto
    Entao o sistema devera excluir o produto do carrinho


