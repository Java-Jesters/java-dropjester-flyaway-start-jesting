CREATE TABLE Employee (
	id int NOT NULL AUTO_INCREMENT,
	firstName varchar(50),
	lastName varchar(50),
	salary decimal(7, 2),
	bankAccountNumber varchar(34),
	nationalInsuranceNumber varchar(9),
	PRIMARY KEY(id)
);