<br>
 <div align="center" class="imgs">
 <img style="margin: 0 50px;" height="250em" src="https://miro.medium.com/max/500/1*AbiX4LwtSNozoyfypcKvEg.png"> 

# API Restful com Spring Boot
<br>

</div>

## Para Rodar o Projeto

É uma Api Restful escrita com codigo java então é estremamente necessario ter o compilador do codigo Java Instalado no seu ambiente de desnvolvimento

- Para rodar a aplicação certifiquice de ter o Java instalado em sua maquina, ou , execute um codigo Docker para poder compilar o codigo

A arquitetura se organiza de forma padronizada sendo por

        Products Model
Responsavel pelos atributos salvos no banco de dados 
        
        Products Repository
Responsavel por manipular o repositorio encontrando o resultado desejado
        
        Products Controller
Responsavel por manipular as requisições <b><i>HTTP</i></b>

### Entendido Até aqui a compilação ja pode ser efetuada, execute o codigo e acesse a porta

        localhost:8080/product

<hr>


##  API


A Api pois possui facil integração com mais diversos sistemas, alem de ser uma forma muito ultilizada para a comunicação entre sistemas

GET

            8080/product
          
GET by Id

            8080/product/1
          
POST   

            8080/product
          
PUT ( by Id )

            8080/product/1
          
DELETE ( by Id )

            8080/product/1
        
## Variaveis de Ambiente
no <b><i>application.properties</i></b> voce pode manipular caracteristicas do projeto como

        spring.datasource.url=jdbc:h2:mem:products
Url do console do banco de dados h2      

        spring.datasource.username=sa
Nome de usuario        

        spring.datasource.password=admin
Senha de usuario        

        spring.h2.console.enabled=true
Se o console estara habilitado

        spring.h2.console.path=/h2-console
Caminho para o console depois da Porta

        spring.jpa.show-sql=true
        spring.jpa.properties.hibernate.format_sql=true
Configurações de SQL no terminal 

