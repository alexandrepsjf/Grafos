<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Produto</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div><h1>Produto</h1></div>
        <%@page contentType="text/html" pageEncoding="utf-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
    <head>
        <title>Produto</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div><h1>Produto</h1></div>
        <table> 
            <tr> 
                <th>Cod Produto</th>
                <th>Nome Produto </th>
                <th colspan =2>AÃ§Ã£o</th>
            </tr>
            <c:forEach items="${produtos}" var="Produto">
            <tr> 
                <td><c:out value="${produto.id}"/></td>
                <td><c:out value="${produto.nome}"/></td>
                <td><a href="ManterProdutoController?acao=prepararEditar&id=<c:out value="${produto.id}"/>">Editar</a></td>
                <td><a href="ManterProdutoController?acao=prepararExcluir&id=<c:out value="${produto.id}"/>">Excluir</a></td>
                
            </tr>
            </c:forEach>        
        </table>
        <form action="ManterProdutoController?acao=prepararIncluir" method="post">
            <imput type="submit" name="btnIncluir" value="Incluir">
        </form>
    </body>
    
</html>
