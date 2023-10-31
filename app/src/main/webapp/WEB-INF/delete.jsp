<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/CSS/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h1>Deletar genero</h1>
        <form action="/genero/insert" method="post">
            <div class="form-group">
                <label for="nome">Nome</label>
                <input type="text" name="nome" class="form-control" />
            </div>
            <br />
            <a href="/genero/list" class="btn btn-primary">Voltar</a>
            <button type="submit" class="btn btn-sucess">Excluir</button>
        </form>
    </div>
</body>
</html>