<h1 align="center"> Screenmatch </h1>

![imagem da homepage principal do Screenmatch](https://github.com/user-attachments/assets/86b2252a-5476-4f49-9fd1-c021995fb28f)

![Badge em Produção](http://img.shields.io/static/v1?label=STATUS&message=ONLINE&color=GREEN&style=for-the-badge)

# Descrição do Projeto
O Screenmatch foi desenvolvido, inicialmente, como uma aplicação por linha de comando, consumindo a API da [OMDb API](https://www.omdbapi.com/), ele traz informações de filmes e séries e armazena essas informações em um banco de dados PostgreSQL. Sendo uma aplicação pensada para o público brasileiro, foi preciso fazer a tradução da sinopse de filmes e séries para a língua português brasileiro, para este processo de tradução foi utilizado a integração com o ChatGPT da OpenAI, configurando os parâmetros do modelo de IA.

![imagem da aplicação por linha de comando](https://github.com/user-attachments/assets/b8477adb-5f3b-4e2e-9240-c094850ca684)

Posteriormente, o projeto evoluiu e se tornou uma API REST, que por seguinte, recebia e devolvia requisições ao interagir com ferramentas de API como Insomnia e Postman. Hospedado localmente, o projeto têm controllers que cuidam do recebimento e retorno de requisições, retornando as informações que estão armazenadas no banco de dados PostgreSQL. 

O projeto teve uma última etapa de evolução, em que obteve um front-end, até então toda a aplicação rodava em back-end. Hospedado localmente também, a interface gráfica permite que o usuário possa visualizar filmes e séries do Screenmatch, além de filtrar a busca por filmes e séries pela categoria. 

O Screenmatch tem a finalidade de permitir a consulta personalizada de informações de filmes e séries. 

![GIF da navegação na homepage principal do Screenmatch](https://github.com/user-attachments/assets/f840dd40-e566-4aa8-8552-bf193f540ebf)

# Funcionalidades do Projeto
- `Funcionalidade 1` buscar todas as séries/filmes armazenadas.
- `Funcionalidade 2` buscar todos os episódios associados a uma série.
- `Funcionalidade 3` buscar série/filme por título.
- `Funcionalidade 4` buscar série/filme pelo nome do ator.
- `Funcionalidade 5` listar as top 5 séries/filmes pela avaliação da série/filme.
- `Funcionalidade 6` buscar séries/filmes por categoria.
- `Funcionalidade 7` filtrar série por temporada e avaliação.
- `Funcionalidade 8` buscar episódios de série por trecho do título do episódio.
- `Funcionalidade 9` listar os top 5 episódios de série pela avaliação do episódio.
- `Funcionalidade 10` buscar episódios de séries a partir de uma data

# Acessar e Baixar o Projeto

Para baixar o projeto em sua máquina, execute `git clone` com o link do repositório remoto `https://github.com/kevin-vogado/API-Screenmatch.git`.

# Técnicas e Tecnologias Utilizadas

- `Java`
- `Spring`
- `Spring Boot`
- `ChatGPT`
- `Engenharia de Prompt`
- `PostgreSQL`
- `Orientação a Objetos`
- `Records em Java`
- `Lambdas e Streams em Java`
- `Consumo de API`
- `Integração entre back-end e front-end`
- `API REST`
