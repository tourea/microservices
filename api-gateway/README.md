# api-gateway #

A gateway service that uses Netflix Zuul to forward requests to the service application.

## Building
```./gradlew build```

```docker build -t api-gateway:1.0-SNAPSHOT .```

## Running
```docker run -p 8081:8081 api-gateway:1.0-SNAPSHOT```

## API ##  

| METHOD | PATH | DESCRIPTION |
| ------ |----- |-------------|
| GET | /fileScan/file | Scan a file for vulnerabilities |
| GET | /fileScan/md5 | Check MD5 hash for vulnerabilities |
