# file service #

The file service scans files for vulnerabilities

These functionalities will be extended as the project evolves

## Building
```./gradlew build```

## API ##  

| METHOD | PATH | DESCRIPTION |
| ------ |----- |-------------|
| GET | /api/v1/scans | Scans a file for vulnerabilities |
| GET | /api/v1/checks | Check MD5 hash for vulnerabilities |
