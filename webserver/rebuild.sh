docker stop `docker ps|grep -v CONT |awk '{print $1}'`
docker rmi apache2
docker build -t apache2 .
docker run --rm -dit -p 8081:80 apache2
