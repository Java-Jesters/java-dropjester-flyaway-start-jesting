CREATE TABLE DeliveryEmployeeProject (
	deliveryEmployeeId int NOT NULL,
	projectId int NOT NULL,
	workingOnProject TINYINT(1),
	FOREIGN KEY (deliveryEmployeeId) REFERENCES DeliveryEmployee(id),
	FOREIGN KEY (projectId) REFERENCES Project(id)
);