FROM java:8-jre
MAINTAINER Aboubacar Toure

ADD ./build/libs/api-gateway-1.0-SNAPSHOT.jar /service/
CMD ["java", "-Xmx200m", "-jar", "/service/api-gateway-1.0-SNAPSHOT.jar"]

EXPOSE 8080
