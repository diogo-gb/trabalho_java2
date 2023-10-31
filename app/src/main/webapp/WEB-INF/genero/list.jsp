
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Generos</title>
    <link rel="stylesheet" href="/CSS/bootstrap.min.css">
</head>
<body>
    <div class="container">
    <h1>Generos</h1>
        <a href="/genero/insert" class="btn btn-primary">Novo genero</a>
        <table class="table">
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>&nbsp;</th>
            </tr>
            <c:forEach var="item" itens="${generos}">
                <tr>
                    <td>${item.Id}</td>
                    <td>${item.nome}</td>
                    <td>
                        <a href="/genero/update?id=${item.id}" class="btn btn-warning">Editar</a>
                        <a href="/genero/delete?id=${item.id}" class="btn btn-danger">Excluir</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>