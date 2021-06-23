FROM --platform=arm64 nginx

ADD ./nginx-init-files/init.sh .

RUN chmod 777 init.sh
RUN sh init.sh

# CMD [ "service", "nginx", "start" ]
CMD [ "nginx", "-g", "daemon off;" ]
