# api-gateway #

A gateway service that uses Netflix Zuul to forward requests to the service application.

## Building
```./gradlew build```

## API ##  

| METHOD | PATH | DESCRIPTION |
| ------ |----- |-------------|
| GET | /file/scan | Scans a file for vulnerabilities |
| GET | /file/check | Checks MD5 hash for vulnerabilities |
