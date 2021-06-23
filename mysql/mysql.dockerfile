FROM --platform=linux/x86_64 mysql:8.0.22

ADD ./mysql-init-files /docker-entrypoint-initdb.d