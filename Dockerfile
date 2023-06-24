FROM openjdk:11

RUN mkdir /app

COPY .idea/ /app

WORKDIR /app

CMD java Main.java