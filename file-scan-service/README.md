# file-scan #

The file-scan service scans files for vulnerabilities

These functionalities will be extended as the project evolves

## Building
```./gradlew build```

```docker build -t file-scan:1.0-SNAPSHOT .```

## Running
```docker run -p 8081:8081 file-scan:1.0-SNAPSHOT```

## API ##  

| METHOD | PATH | DESCRIPTION |
| ------ |----- |-------------|
| GET | /api/v1/file | Scan a file for vulnerabilities |
| GET | /api/v1/md5 | Check MD5 hash for vulnerabilities |
