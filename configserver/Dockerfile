FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /opt/app.jar
RUN mkdir /var/configfiles
COPY configfiles /var/configfiles
ENTRYPOINT ["java","-jar","/opt/app.jar"]
EXPOSE 8081
