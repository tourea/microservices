FROM java:8-jre
MAINTAINER Aboubacar Toure

ADD ./build/libs/service-registry-1.0-SNAPSHOT.jar /service/
CMD ["java", "-Xmx200m", "-jar", "/service/service-registry-1.0-SNAPSHOT.jar"]

HEALTHCHECK --interval=30s --timeout=3s CMD curl -f http://localhost:8761/ || exit 1

EXPOSE 8761
