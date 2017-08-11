# microservices #

The goal for this project is to implement the Microservice Architecture for educational purpose (Hence, some design decisions might appear convoluted or unnecessary).

The service that is implemented has the following functionalities:
* Scan files for vulnerabilities

These functionalities will be extended as the project evolves

## API ##  

| METHOD | PATH | DESCRIPTION |
| ------ |----- |-------------|
| GET | /scan/file/ | Scan a file given its path for vulnerabilities |
| GET | /check/md5 | Check MD5 hash for vulnerabilities |
