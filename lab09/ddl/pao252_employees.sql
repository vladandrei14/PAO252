--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `department` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) 


INSERT INTO `employees`
VALUES (1,'Vlad','IT'),(2,'Andreea','HR'),(3,'George','Marketing'),(4,'Laurentiu','IT'),(5,'Maria','Legal'),(6,'Irina','HR'),(7,'Ana','IT');
