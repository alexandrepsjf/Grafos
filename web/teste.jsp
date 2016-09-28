<!DOCTYPE html>
<!-- 
    Document   : teste
    Created on : 22/09/2016, 13:15:41
    Author     : Alexandre
-->



<html>
    <head>
        <%@page contentType="text/html" pageEncoding="UTF-8"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
        <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1><table border="1">
            <thead>
                <tr>
                    <th>Cabeçalho</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Primeira linha e coluna</td>
                </tr>
                <tr>
                    <td><form action="response.jsp">
                            <strong>Select a subject:</strong>
                            <select name="subject_id">
                                <option></option>                                
                            </select>
                            <input type="submit" value="submit" name="submit" />
                        </form>
                    </td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
