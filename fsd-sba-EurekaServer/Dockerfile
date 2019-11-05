FROM openjdk:8-jdk-alpine
MAINTAINER MeiHuaLiu <dllmhliu@cn.ibm.com>
COPY /target/*.jar app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]