# POO
Aulas
: '
23/10 - evento de limpar
private void btnLimpar Click(ActionEvent event){
  // limpar os textFields
  txtNumero1.setText("");
  txtNumero2.setText("");
  txtResultado.setText("");
  
  //limpar todos os radioButtons
  tgOperacao.selectToggle(null);
  
  //enviar o foco para o txtNumero1
  txtNumero1.requestFocus();
}

//Quando quero alterar/limpar  somente um elemento, utilizar 
// RBSomar.SetSelected(False)

//arrumou mais alguma coisa no codigo(Ver video aula)
//FOTOOO
//ToString toda classe possui, na classe object. Ele mencionou qu "Toda... é filha do object"
//Quando eu clicar no combobox vai aparecer varios endereço, então para que fique mais visivel organizado para o usarios, atraves reprogramar o ToString

//projeto novo

'
--------------------
30/10

/**
* Na combobox_ViewController.java
**/

//Cada Controller ter um @FXML
//Começou a modficiar e programar a combox
//Criar uma coleção na combo com fxcolletion(tudo que mudar aqui, ira afetar o combobox) - adcionar obejto produto
// o @fxml  private Combox <?> obProduto; é preciso trocar a <?> interrogação pelo tipo do dado que a combo ira armazenar

---
//Coleção para a combox
private ObservableList<Produto> produto =
        FXCollections.observeableArrayList();
        //serve para procurar e guardar atraves do arrayList
// public... initialize sempre vcai chmar o meu comando 
// public void initialize( URL url, ResourceBudle rb)
//coloica a coleção criada dentro da combox
cbProdutp.setItems(produto);
//faz ligação com bancodedados

//agora ja programador o ocmbox, programar o botão para inserir os elemntos do produto
//Enviar os dados de tela para um Model e faz inclusão na coleção combox
//adiconar codigp private void btnInserirCombo Click(ActionEvent event){
//model os dados da tela para model
//modelProduto = moveViewToModel();
//adiciona o model na coleção
//produtos.add(modelProduto);

//limpa os campos
//limpaCampos();

//move o cursor para o campo código
//txtCodigo.requestFocus();
//}

//private void btnExibirDados Click (ActionEvent event){
  //verificar se tem alguem selecionado
  //if(cbProduto.getValue() == null){
    //mensagem("Favor selecionar um item...");
  //}
  //else{
    //obtem os dados da combobox
    //modelProduto = cbProduto.getValue();
    //exibe os dados
    //moveModelToView(modelProduto);
  //}
//}
//poderia escrever tbm cbProduto, ao inves de modelProduto

//Exibe uma mensagem para usario 
//@param msg Mnesagem a ser exibida
//private void mensgaem(String msg){
//Alert alerta = new Alert(Alert.AlertType.INFORMATION);
//alert.setTitle("Mensagem");
//alert.setHeaderText(msg);
//alert.setContentText("");

//alerta.showAndWait(); //exibe a mensagem
//}
//}

//Dia 06/11
//Copiar nosso Teamplate para o nome de Banco de dados(ira gerar dois, e renomeamos o segundo)
//Pegar o arquivo no Teams ou Siga, dar Ctrl + C e vai no nosso projeto no NeatBeans, Sources Package e cola nosso arquivo. Ira criar <default package> com nosso arquivo BD
//Agora ir para o XAMPP, dar Start em apache e mysql(Caso de erro, vai no workbeanch e colocar nos comandos usuario e senha root)
// Mencionou sobre editar " Create database Loja_2 " e " use Loja_2 " para criar e usar outra banco de dados 
// Copiar todos os dados da informação do ARQUIVO BD e colocar no XAMPP ou outra ferramenta
//Se o XAMPP der erro no phpadin, vai no shell e adiconar mysql -u root e colocar. Colar o codigo ali 
//Criar novas Java Package, Persistencia, DAO e model. O banco ira ficar no persistencia
//Agora essas variaveis não precisam de instancia, e objeto consegue acessar direto
//Se escrever so Connection, devemos tomar cuidado para não fazer lçigação com outros pacotes. Soemnte no Java.sql;Connection
//O java não ocnsegue falar diretamente com o mysql. Cada fabricante tem um driver(temos que pegar na internte, atrves do Maven)
// Ir para o Maven repositori --> jdbc MYSQL --> duas versoes do java --> colocar o codigo  n oPorject file e pom em <depndency> --> salva --> vai ter um dependneica  com mysql-connector(não precisamos preocupar com os pacotes e drivers)
//Abrir o principal, depois de lauch 
//try {
//system.out.println("Conectando...");
//Banco.conectar();
//system.out.println("Conectado...");
//Banco.desconectar();
//system.out.println("Desconectando...");
//}
//catch(SQLException ex){
//system.out.println("Erro: " + ex.getMessage());
//}
//}
//Agorar testar se funciona

// https://www.youtube.com/watch?app=desktop&v=or8yeT8OOcg
//https://www.youtube.com/watch?app=desktop&v=CrQ3Fr306pM
// https://www.google.com/search?q=JAVAFX+BOOKING+SYSTEM+fARMACIA&tbm=isch&ved=2ahUKEwj-6IaSjreCAxVLipUCHSd8CaIQ2-cCegQIABAA&oq=JAVAFX+BOOKING+SYSTEM+fARMACIA&gs_lcp=CgNpbWcQA1CzEljXPWDYPmgAcAB4AIABeogBmxGSAQQ1LjE2mAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=TupMZf6JNMuU1sQPp_ilkAo&bih=911&biw=1903&rlz=1C1ISCS_pt-PTBR969BR969&hl=pt-BR#imgrc=dlMhbBjkbPMiKM&imgdii=9UVbPZeCHu4mFM
// https://www.google.com/search?q=JAVAFX+BOOKING+SYSTEM+fARMACIA&tbm=isch&ved=2ahUKEwj-6IaSjreCAxVLipUCHSd8CaIQ2-cCegQIABAA&oq=JAVAFX+BOOKING+SYSTEM+fARMACIA&gs_lcp=CgNpbWcQA1CzEljXPWDYPmgAcAB4AIABeogBmxGSAQQ1LjE2mAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=TupMZf6JNMuU1sQPp_ilkAo&bih=911&biw=1903&rlz=1C1ISCS_pt-PTBR969BR969&hl=pt-BR#imgrc=9UVbPZeCHu4mFM&imgdii=1NRzuJaaUyFj1M
//https://www.google.com/imgres?imgurl=https%3A%2F%2Ffiverr-res.cloudinary.com%2Fimages%2Ft_main1%2Cq_auto%2Cf_auto%2Cq_auto%2Cf_auto%2Fgigs%2F217552574%2Foriginal%2F03ed5a3a7893f7471df7149d21163a03c879c398%2Fdo-your-java-javafx-project-and-gui-applications.png&tbnid=zWXbFHTTRHwn3M&vet=10CAwQxiAoBWoXChMI2OjCwo-3ggMVAAAAAB0AAAAAEAY..i&imgrefurl=https%3A%2F%2Fwww.fiverr.com%2Filyasjaai%2Fdo-your-java-javafx-project-and-gui-applications&docid=zGA-IWbcPLipJM&w=680&h=427&itg=1&q=JAVAFX%20BOOKING%20SYSTEM%20fARMACIA&hl=pt-BR&ved=0CAwQxiAoBWoXChMI2OjCwo-3ggMVAAAAAB0AAAAAEAY

//CRIAR OS daos do projeto. Chave IDno tabela do Bd




