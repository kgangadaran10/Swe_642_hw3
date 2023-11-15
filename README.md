# Swe_642_hw3

Spring boot application for swe 642 hw3

## Dependencies

- Install latest version of Java (21.x.x)
- (Optional) Install latest version of maven (3.9.5)
  - Or use the included `mvnw` wrapper in the repo

## Suggestions

- Use VS Code as your IDE
- Install the VS Code "Extension Pack for Java"
  - Includes "Maven for Java" among other things

## How to Run

PostgreSQL is the database dependency for this project. Either install
locally to your computer, run your own virtual server, or use the
docker-compose.yaml file to run the PostgreSQL server.

```shell
docker-compose up -d
```

> To shutdown the container and remove the volume:
>
> ```shell
> docker-compose down -v
> ```

With postgres running, go ahead and install the project dependencies with maven.
This will build out the necessary files in `target/` to run a minimal application.
This will also run the test which does nothing but ensures that an empty test is run.

```shell
mvn install
```

Run the application with the spring-boot plugin:

```shell
mvn spring-boot:run
```

The default port is 8080, so you can visit http://localhost:8080 and you will see an
ugly page with a 404 error because the webserver hasn't been configured to run anything
yet.
# SurveyApp

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 17.0.0.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via a platform of your choice. To use this command, you need to first add a package that implements end-to-end testing capabilities.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.io/cli) page.
