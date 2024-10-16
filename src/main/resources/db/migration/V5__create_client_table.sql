CREATE TABLE Client (
	clientId int NOT NULL AUTO_INCREMENT,
	`name` varchar(50) NOT NULL,
	phoneNumber varchar(15) NOT NULL,
	addressLine1 varchar(30) NOT NULL,
	addressLine2 varchar(30),
	addressCity varchar(20) NOT NULL,
	addressProvince varchar(20) NOT NULL,
	addressRegion varchar(20) NOT NULL,
	addressCountry varchar(30) NOT NULL,
	addressPostCode varchar(10) NOT NULL,
	PRIMARY KEY(clientId)
);