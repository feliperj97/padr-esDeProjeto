package model;

public class Pedido {
private String produto ;
private String cliente ;
private String enderecoDeEntrega ;
private String NotaFiscal ;

public Pedido ( String produto , String cliente , String enderecoDeEntrega, String NotaFiscal ) {
this . produto = produto ;
this . cliente = cliente ;
this . enderecoDeEntrega = enderecoDeEntrega ;
this.NotaFiscal = NotaFiscal;
 }

public String getProduto () {
return produto ;
 }

public String getCliente () {
return cliente ;
 }

public String getEnderecoDeEntrega () {
return enderecoDeEntrega ;
 }
public String getNotaFiscal() {
return NotaFiscal;
}
}