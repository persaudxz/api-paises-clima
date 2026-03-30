# API de Países (Spring Boot)

Esse projeto foi desenvolvido como parte de uma atividade da faculdade para praticar consumo de APIs em Java usando Spring Boot.

A aplicação permite buscar informações de um país a partir do nome (em inglês), utilizando a API pública REST Countries.

## O que a aplicação faz

- Recebe o nome de um país através de um formulário
- Consome a API REST Countries
- Exibe na tela:
  - Nome comum
  - Nome oficial
  - Capital
  - Região e sub-região
  - População
  - Área
  - Bandeira do país

Também foi implementado tratamento de erro para quando o país não é encontrado.

## Tecnologias utilizadas

- Java
- Spring Boot
- Thymeleaf
- Maven

## Como executar o projeto

1. Abrir o projeto em uma IDE (IntelliJ, por exemplo)
2. Rodar a classe `PaisesApplication`
3. Acessar no navegador: http://localhost:8080

## Observações

Esse projeto foi desenvolvido com foco em aprendizado, principalmente na manipulação de JSON e consumo de APIs externas.
