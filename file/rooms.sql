-- MySQL Script generated by MySQL Workbench
-- Thu Mar 29 11:12:23 2018
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
-- Table `rooms`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `rooms` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `rooms` (
  `rid` BIGINT NOT NULL AUTO_INCREMENT,
  `room_id` VARCHAR(20) NOT NULL,
  `romm_type` VARCHAR(10) NOT NULL,
  `room_state` CHAR(2) NOT NULL,
  `room_tel` VARCHAR(20) NOT NULL,
  `room_loc` VARCHAR(10) NOT NULL,
  `remark` VARCHAR(45) NULL,
  PRIMARY KEY (`rid`)
  )engine=InnoDB
  default character set = utf8
  collate=utf8_bin;

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
