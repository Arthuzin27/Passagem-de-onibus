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
-- Table structure for table `viagem`
--

DROP TABLE IF EXISTS `viagem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `viagem` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_onibus` int NOT NULL,
  `cidade_origem` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `data_saida` varchar(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `horario_saida` varchar(5) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `cidade_destino` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `data_chegada` varchar(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `horario_previsto_chegada` varchar(5) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `ativo` tinyint DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `fk_viagem_onibus_idx` (`id_onibus`),
  CONSTRAINT `fk_viagem_onibus` FOREIGN KEY (`id_onibus`) REFERENCES `onibus` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `viagem`
--

LOCK TABLES `viagem` WRITE;
/*!40000 ALTER TABLE `viagem` DISABLE KEYS */;
INSERT INTO `viagem` VALUES (1,5,'Colatina','28/04/2024','18:00','Vitória-ES','28/04/2024','21:30',1),(2,5,'Vitória-ES','29/04/2024','16:00','Colatina-ES','29/04/2024','19:00',1),(3,8,'Marechal Floriano-ES','30/04/2024','14:30','Vitória-ES','30/04/2024','15:55',1),(4,8,'Vitória-ES','30/04/2024','14:30','Marechal Floriano-E','30/04/2024','15:55',1),(5,9,'Alfredo Chaves-ES','02/04/2024','15:00','Guarapari-ES','02/04/2024','15:55',1),(6,9,'Guarapari-ES','03/04/2024','15:00','Alfredo Chaves-ES','03/04/2024','15:55',1),(7,10,'Ibatiba-ES','04/04/2024','15:00','Vitória-ES','04/04/2024','17:30',1),(8,10,'Ibatiba-ES','05/04/2024','17:30','Vitória-ES','05/04/2024','20:00',1),(9,11,'Brejetuba-ES','06/05/2024','18:00','Colatina','06/05/2024','22:30',1),(10,11,'Colatina-ES','06/05/2024','18:00','Brejetuba-ES','06/05/2024','22:30',1);
/*!40000 ALTER TABLE `viagem` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-25 19:41:39
