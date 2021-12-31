FROM maven:3-openjdk-11 AS base
FROM openjdk:11 AS run

FROM base AS dev
COPY . /workdir
RUN \
  cd workdir &&\
  mvn clean install package -Dmaven.test.skip=true

FROM run AS release
COPY --from=dev  /workdir/target/PracticeApplication.jar  /workdir/app.jar

EXPOSE 80