# microservices #

The goal for this project is to implement the Microservice Architecture for educational purpose (Hence, some design decisions might appear convoluted or unnecessary).

The service that is implemented has the following functionalities:
* Scan files for vulnerabilities
* Scan URLs for vulnerabilities

These functionalities will be extended as the project evolves

## API ##  

| METHOD | PATH | DESCRIPTION |
| ------ |----- |-------------|
| GET | /fileScan/file | Scan a file for vulnerabilities |
| GET | /fileScan/md5 | Check a MD5 hash for vulnerabilities |
