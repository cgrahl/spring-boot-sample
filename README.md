# spring-boot-sample
Simple Spring Boot project using REST, JPA, Spring security and Spring Cloud

## Iniciar

Os serviços devem ser iniciados nesta ordem:

* eureka-naming-server
* zuul-api-gateway-server
* auth-server
* clientes
* pedidos

## Login:

Fazer uma chamada curl -s acme:acmesecret@localhost:9999/uaa/oauth/token  \\
 -d grant_type=password \\
 -d client_id=acme \\
 -d scope=webshop \\
 -d username=user \\
 -d password=password
 
E o retorno é um token no seguinte formato:

{
  "access_token": "62ca1eb0-b2a1-4f66-bcf4-2c0171bbb593",
  "token_type": "bearer",
  "refresh_token": "920fd8e6-1407-41cd-87ad-e7a07bd6337a",
  "expires_in": 43173,
  "scope": "webshop"
}

A partir daí, toda requisição deve ser enviada com o seguinte cabeçaho:

Authorization: Bearer <access_token>

Por exemplo:

Authorization: Bearer 62ca1eb0-b2a1-4f66-bcf4-2c0171bbb593

ou:

curl 'http://localhost:8765/clientes/cliente/1/pedidos' -H "Authorization: Bearer $TOKEN" -s


 
 
