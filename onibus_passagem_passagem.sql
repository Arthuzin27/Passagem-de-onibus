-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: onibus_passagem
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `passagem`
--

DROP TABLE IF EXISTS `passagem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passagem` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_viagem` int NOT NULL,
  `id_vendedor` int NOT NULL,
  `id_passageiro` int NOT NULL,
  `id_assento` int NOT NULL,
  `custo` double NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_passagem_UNIQUE` (`id`),
  KEY `fk_passagempassageiro_idx` (`id_passageiro`),
  KEY `fk_passagemviagem_idx` (`id_viagem`),
  KEY `fk_passagem_vendedor_idx` (`id_vendedor`),
  KEY `fk_passagem_assento_idx` (`id_assento`),
  CONSTRAINT `fk_passagem_assento` FOREIGN KEY (`id_assento`) REFERENCES `assento2` (`id`),
  CONSTRAINT `fk_passagem_vendedor` FOREIGN KEY (`id_vendedor`) REFERENCES `vendedor` (`id`),
  CONSTRAINT `fk_passagem_viagem` FOREIGN KEY (`id_viagem`) REFERENCES `viagem` (`id`),
  CONSTRAINT `fk_passagempassageiro` FOREIGN KEY (`id_passageiro`) REFERENCES `passageiro` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passagem`
--

LOCK TABLES `passagem` WRITE;
/*!40000 ALTER TABLE `passagem` DISABLE KEYS */;
INSERT INTO `passagem` VALUES (1,6,1,1,5,25),(2,5,1,1,5,25),(4,1,1,3,6,74),(5,2,1,3,6,77),(6,3,1,4,7,22),(7,4,1,4,7,19),(8,7,2,5,8,48),(9,8,2,5,8,45),(10,9,2,6,9,90),(11,10,2,6,9,88);
/*!40000 ALTER TABLE `passagem` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-25 19:41:40
