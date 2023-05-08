--
-- Table structure for table `projects`
--

DROP TABLE IF EXISTS `projects`;
CREATE TABLE `projects` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `timeline` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`),
  UNIQUE KEY `timeline_UNIQUE` (`timeline`)
)

INSERT INTO `projects`
VALUES (1,'Employee manager app',90),(2,'Instant payment app',365),(3,'Employee AI',180);