# microservices #

The goal for this project is to implement the Microservice Architecture for educational purpose (Hence, some design decisions might appear convoluted or unnecessary).

The service that is implemented has the following functionalities:
* It can scan files for vulnerabilities

These functionalities will be extended as the project evolves

## API ##  

| METHOD | PATH | DESCRIPTION |
| ------ |----- |-------------|
| GET | /scan/file/path | Scan a file given its path |
| GET | /scan/file/md5 | Scan a file given its MD5 hash |
