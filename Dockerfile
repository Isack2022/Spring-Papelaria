FROM openjdk:17
EXPOSE 8091
ADD target/app-papelaria.jar app-papelaria.jar
ENTRYPOINT ["java","-jar","app-papelaria"]
