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
-- Table structure for table `questionbank`
--

DROP TABLE IF EXISTS `questionbank`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `questionbank` (
  `QuestionID` int(11) NOT NULL AUTO_INCREMENT,
  `Class` varchar(17) NOT NULL,
  `Subject` varchar(45) NOT NULL,
  `ChapterName` varchar(45) NOT NULL,
  `QuestionNo` int(11) NOT NULL,
  `Question` varchar(400) DEFAULT NULL,
  `OptionA` varchar(100) DEFAULT NULL,
  `OptionB` varchar(100) DEFAULT NULL,
  `OptionC` varchar(100) DEFAULT NULL,
  `OptionD` varchar(100) DEFAULT NULL,
  `AnswerOption` char(2) DEFAULT NULL,
  `Mark` int(11) DEFAULT '1',
  `Image` longblob,
  PRIMARY KEY (`QuestionID`,`Class`,`Subject`,`ChapterName`,`QuestionNo`)
) ENGINE=InnoDB AUTO_INCREMENT=119 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questionbank`
--

LOCK TABLES `questionbank` WRITE;
/*!40000 ALTER TABLE `questionbank` DISABLE KEYS */;
INSERT INTO `questionbank` VALUES (112,'XI','Informatics','Intro',1,'who is the inventor of computer??','Babbage','Charles','Aryan','god','A',1,NULL),(113,'XI','Informatics','Intro',2,'who is the ceo of exam','me','u','sai','swamy','D',1,NULL),(114,'XII','Informatics','networks',1,'what is a hub','A','B','C','D','A',1,NULL),(115,'XII','Informatics','networks',2,'what is sms???','SHORT','MESSAGE','SERVISE','ALL','D',1,NULL),(116,'XI','Informatics','Intro',3,'what is cpu','center','central','processing','unit','B',1,NULL),(117,'XI','Informatics','Intro',4,'have u ever seen a computer','no',' s','donno','yes','A',1,NULL),(118,'XI','Informatics','Intro',5,'what is memory','dono','no','no','nooo','A',1,NULL);
/*!40000 ALTER TABLE `questionbank` ENABLE KEYS */;
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
