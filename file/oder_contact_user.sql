-- MySQL Script generated by MySQL Workbench
-- Thu Mar 29 11:17:56 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema som2_demo
-- -----------------------------------------------------
-- 演示数据库
SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `order_contact`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `order_contact` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `order_contact` (
  `order_contact_user_id` BIGINT NOT NULL AUTO_INCREMENT,
  `oid` BIGINT NOT NULL,
  `cid` BIGINT NOT NULL,
  PRIMARY KEY (`order_contact_user_id`)
  )engine=InnoDB
  default character set=utf8
  collate=utf8_bin
  ;

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
