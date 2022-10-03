<%
String nomeEmpresa = (String) request.getAttribute("person");
System.out.println(nomeEmpresa);
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
Empresa <%=nomeEmpresa %> cadastrada com sucesso!
</body>
</html>