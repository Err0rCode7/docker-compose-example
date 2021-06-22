#!/bin/bash

mysql_host="myapp"
mysql_port="3306"

# Wait for the mysql docker to be running
echo "hi"
while ! nc $mysql_host $mysql_port; do
	>&2 echo "Mysql is unavailable - sleeping"
	sleep 1
done

./gradlew 