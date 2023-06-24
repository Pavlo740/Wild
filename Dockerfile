FROM openjdk:11

RUN mkdir /app

COPY .idea/ /out

WORKDIR /app

CMD java Main.java