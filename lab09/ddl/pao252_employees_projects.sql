--
-- Table structure for table `employees_projects`
--

DROP TABLE IF EXISTS `employees_projects`;
CREATE TABLE `employees_projects` (
  `id` int NOT NULL AUTO_INCREMENT,
  `employee_id` int NOT NULL,
  `project_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `employee_id_idx` (`employee_id`),
  KEY `project_id_idx` (`project_id`),
  CONSTRAINT `employee_id` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`id`),
  CONSTRAINT `project_id` FOREIGN KEY (`project_id`) REFERENCES `projects` (`id`)
)

INSERT INTO `employees_projects`
VALUES (1,1,2),(2,1,3),(3,2,1),(4,2,2),(5,3,3),(6,4,1),(7,5,1),(8,5,2),(9,5,3),(10,7,3);