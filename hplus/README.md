README
--

## Setup mysql docker db with access and users.

- create a user

```roomsql
docker exec -it <image_name> bash

mysqladmin -u root password

CREATE USER 'nilu'@'172.17.0.1' IDENTIFIED BY 'Password';
Query OK, 0 rows affected (0.00 sec)

mysql> GRANT ALL ON hplus.* TO 'nilu'@'172.17.0.1'  WITH GRANT OPTION;
Query OK, 0 rows affected (0.01 sec)
flush privileges;
```

- create Data

```roomsql
INSERT INTO `user` VALUES (1,'admin','admin','admin','admin','2000-01-03','gym','MALE'),(2,'admin1','admin1','admin1','admin1','1985-08-23','sport','FEMALE');
INSERT INTO `product` VALUES (1,'mineralwater-blueberry','images/mineralwater-blueberry.jpg'),(2,'mineralwater-lemonlime','images/mineralwater-lemonlime.jpg'),(3,'mineralwater-orange','images/mineralwater-orange.jpg'),(4,'mineralwater-peach','images/mineralwater-peach.jpg'),(5,'mineralwater-raspberry','images/mineralwater-raspberry.jpg'),(6,'mineralwater-strawberry','images/mineralwater-strawberry.jpg'),(7,'proteinbar-chocolate','images/proteinbar-chocolate.jpg'),(8,'proteinbar-lemon','images/proteinbar-lemon.jpg'),(9,'proteinbar-peanutbutter','images/proteinbar-peanutbutter.jpg'),(10,'vitamin-a','images/vitamin-a.jpg'),(11,'vitamin-bcomplex','images/vitamin-bcomplex.jpg'),(12,'vitamin-calcium','images/vitamin-c.jpg');

```

- [for help in database in docker.](https://developpaper.com/running-multiple-mysql-instances-on-different-ports-mapped-by-docker-port/)

