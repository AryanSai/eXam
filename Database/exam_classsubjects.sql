-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: exam
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `classsubjects`
--

DROP TABLE IF EXISTS `classsubjects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classsubjects` (
  `class` varchar(17) DEFAULT NULL,
  `subject` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classsubjects`
--

LOCK TABLES `classsubjects` WRITE;
/*!40000 ALTER TABLE `classsubjects` DISABLE KEYS */;
INSERT INTO `classsubjects` VALUES ('VIII','English'),('VIII','Mathematics'),('VIII','Science'),('VIII','Social'),('VIII','Hindi'),('VIII','Sanskrit'),('VIII','Computers'),('IX','English'),('IX','Mathematics'),('IX','Science'),('IX','Social'),('IX','Hindi'),('IX','Sanskrit'),('IX','Computers'),('X','English'),('X','Mathematics'),('X','Science'),('X','Social'),('X','Hindi'),('X','Sanskrit'),('X','Computers'),('XI','English'),('XI','Mathematics'),('XI','Physics'),('XI','Chemistry'),('XI','Biology'),('XI','ComputerScience'),('XI','Hindi'),('XI','Telugu'),('XI','Sanskrit'),('XI','Commerce'),('XI','Accounts'),('XI','Informatics'),('XII','Commerce'),('XII','Accounts'),('XII','English'),('XII','Informatics'),('XII','Hindi'),('XII','English'),('XII','Mathematics'),('XII','Physics'),('XII','Chemistry'),('XII','Biology'),('XII','ComputerScience'),('XII','Telugu');
/*!40000 ALTER TABLE `classsubjects` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-01 17:04:42
