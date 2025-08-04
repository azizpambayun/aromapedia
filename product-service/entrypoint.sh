#!/bin/sh
until pg_isready -h postgres -p 5432 -U ilham
do
  echo "Waiting for postgres..."
  sleep 2
done
psql -h postgres -U ilham -tc "SELECT 1 FROM pg_database WHERE datname = 'product'" | grep -q 1 || psql -h postgres -U ilham -c "CREATE DATABASE product"
java -jar product-service-0.0.1-SNAPSHOT.jar
