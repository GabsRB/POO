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

