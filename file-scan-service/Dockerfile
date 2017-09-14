FROM java:8-jre
MAINTAINER Aboubacar Toure

ADD ./build/libs/file-scan-1.0-SNAPSHOT.jar /service/
CMD ["java", "-Xmx200m", "-jar", "/service/file-scan-1.0-SNAPSHOT.jar"]

EXPOSE 8081
