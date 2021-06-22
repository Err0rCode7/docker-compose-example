FROM --platform=linux/x86_64 mysql:5.7

ADD ./mysql-init-files /docker-entrypoint-initdb.d

# CMD ["mysqld"]
