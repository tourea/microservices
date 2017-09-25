FROM java:8-jre
MAINTAINER Aboubacar Toure

ADD ./build/libs/monitoring-1.0-SNAPSHOT.jar /service/
CMD ["java", "-Xmx200m", "-jar", "/service/monitoring-1.0-SNAPSHOT.jar"]

EXPOSE 8989 4000
