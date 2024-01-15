CREATE DATABASE customerdatabase;

USE customerdatabase;

CREATE TABLE `customer` (
`id` INT NOT NULL AUTO_INCREMENT,
`customer_ref` VARCHAR(45) NOT NULL,
`customer_name` VARCHAR(45) NOT NULL,
`address_line1` VARCHAR(45) NOT NULL,
`address_line2` VARCHAR(45) NOT NULL,
`town` VARCHAR(45) NOT NULL,
`county` VARCHAR(45) NOT NULL,
`country` VARCHAR(45) NOT NULL,
`postcode` VARCHAR(45) NOT NULL,
PRIMARY KEY(`id`));