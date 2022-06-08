#language: pt

@Busca
  Funcionalidade: : Buscar um Item

    Cenario: Realize a busca de um item na home page
      Dado que esteja na pagina inicial: "http://automationpractice.com/index.php"
      Quando o Usuário digitar no campo busca o item : "Printed Dress"
      E  clica no botão buscar
    Entao o sistema deve trazer no resultado da pesquisa todos os itens que contém essas palavras na tela
