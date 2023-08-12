# Getting Started

## Adding Java runtime in vs code

If u using java 20 and vs code did not detect java 20 that installed on your setup.

* go to .vscode folder and open setting.json file.
* and add "java.jdt.ls.java.home": "your/java/path",
* for example mine is.

```json
{
    "java.jdt.ls.java.home": "C:/Java",
}
```

* if there not setting.json file.
* you also could change your java version on the project if u just started the project, and setting file will automatically generated.
* but u can add the file manually if changing the project java version is did not posable.

## Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.2/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.2/reference/htmlsingle/index.html#web)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
