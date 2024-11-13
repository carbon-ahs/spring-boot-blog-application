# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.example.spring-boot-blog-application' is invalid and this project uses 'com.example.spring_boot_blog_application' instead.

# Getting Started

## Youtube Video Link
https://www.youtube.com/watch?v=7iWlCl35p9o

## Main Repository link
https://github.com/wazooinc/spring-boot-blog-application
This repo is fabulous. It has a lot of examples and is well documented. It's a great starting point. It has branches for each level you want to get to.

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.5/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.5/maven-plugin/build-image.html)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.3.5/reference/using/devtools.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.3.5/reference/web/servlet.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/3.3.5/reference/data/sql.html#data.sql.jpa-and-spring-data)
* [Validation](https://docs.spring.io/spring-boot/3.3.5/reference/io/validation.html)
* [Thymeleaf](https://docs.spring.io/spring-boot/3.3.5/reference/web/servlet.html#web.servlet.spring-mvc.template-engines)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

12.11.2024: https://youtu.be/7iWlCl35p9o?si=PlaTpQ91yxGaKxje&t=2977
13.11.2024: https://youtu.be/7iWlCl35p9o?si=XcoT2UFSl8WdhARH&t=7092