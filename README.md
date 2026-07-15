# Genius Artist API v1

Una API REST desarrollada en Spring Boot que se integra con la API oficial de Genius. Este proyecto (en construcción) actúa como un servicio intermediario para consultar información específica de artistas musicales y sus temas más exitosos. 

El proyecto está diseñado enfocándose en buenas prácticas de desarrollo, una arquitectura limpia y la utilización de herramientas modernas del framework para peticiones HTTP.

## Características principales
* **Integración moderna:** Consumo de la API externa de Genius utilizando la interfaz fluida `RestClient` (introducida en las versiones recientes de Spring).
* **Buenas prácticas:** Estructura de código limpia, separación de responsabilidades (Controllers, Services, Clients, DTOs) y manejo adecuado de las peticiones.

## Endpoints disponibles

El servicio expone los siguientes endpoints privados:

* **`GET /api/private/artists/{id}`**
  Devuelve la información detallada del artista correspondiente al ID especificado, adjuntando además una lista con sus 10 canciones más populares.

* **`GET /api/private/artists/{id}/songs`**
  Devuelve de manera exclusiva la lista de las 10 canciones más populares del artista especificado por su ID.

## Tecnologías utilizadas
* Java
* Spring Boot
* Spring Web (RestClient)
