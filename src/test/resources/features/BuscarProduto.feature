#language: pt


  Funcionalidade: Buscar um Item

    Cenario: Realizar a busca de um item na home page
      Dado que estaja na pagina inicial: "http://automationpractice.com"
      Quando o Usuário digitar  o item : "Printed Dress" no campo de busca
      E clicar no botão buscar
      Entao o sistema deve trazer no resultado da pesquisa todos os itens que contém essas palavras na tela