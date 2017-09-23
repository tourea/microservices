FROM java:8-jre
MAINTAINER Aboubacar Toure

ADD ./build/libs/service-registry-1.0-SNAPSHOT.jar /service/
CMD ["java", "-Xmx200m", "-jar", "/service/service-registry-1.0-SNAPSHOT.jar"]

EXPOSE 8761
