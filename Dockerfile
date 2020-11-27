FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/calculator-test.jar
ARG JAR_LIB_FILE=target/lib/

FROM ubuntu:latest
MAINTAINER me
RUN apt-get update \
&& apt-get install -y vim git \
&& apt-get clean \
&& rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*