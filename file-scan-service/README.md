# file-scan #

The file-scan service has the following functionalities:
* It can scan files for vulnerabilities

These functionalities will be extended as the project evolves

## API ##  

| METHOD | PATH | DESCRIPTION |
| ------ |----- |-------------|
| GET | /scan/file | Scan a file given its path for vulnerabilities |
| GET | /check/md5 | Check MD5 hash for vulnerabilities |