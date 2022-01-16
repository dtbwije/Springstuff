::docker run -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=1 mysql
::docker run -p  3306:3306 -e MYSQL_ROOT_PASSWORD=root mysql
docker stop mysql-1
docker container rm mysql-1
docker run --name mysql-1 --detach --env="MYSQL_ROOT_PASSWORD=Password" -p 3306:3306 --volume=C:\Users\dtbwi\IdeaProjects\hplusapp\conf.d:/root/docker/mysql/conf.d mysql/mysql-server
timeout 10
docker exec -i mysql-1  mysql -u root -pPassword < C:\Users\dtbwi\git\SpringStuff\hplus\create_user.sql