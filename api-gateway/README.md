# api-gateway #

A gateway service that uses Netflix Zuul to forward requests to the service application.

With the microservices architecture, the data returned to a client often comes from different services. In theory, the client could make requests to each of the microservices and merge the result on a client side; but a much better aproach is to have a single entry point for all services known as an API Gateway. The API Gateway encapsulates the internal system architecture and provides an API that is tailored to each client.

## Building
```./gradlew build```

## API ##  

| METHOD | PATH | DESCRIPTION |
| ------ |----- |-------------|
| GET | /file/scan | Scans a file for vulnerabilities |
| GET | /file/check | Checks MD5 hash for vulnerabilities |
