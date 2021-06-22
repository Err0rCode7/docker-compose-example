FROM adoptopenjdk/openjdk11

# RUN apt-get update && apt-get install netcat-openbsd -y

ADD . /spring-app
WORKDIR /spring-app

# ADD ./netcat_wait_for_db.sh /docker-entrypoint-initdb.d
