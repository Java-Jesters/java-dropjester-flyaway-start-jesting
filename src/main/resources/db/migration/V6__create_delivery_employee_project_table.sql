CREATE TABLE DeliveryEmployeeProject (
	deliveryEmployeeId int NOT NULL,
	projectId int NOT NULL,
	workingOnProject BOOL,
	FOREIGN KEY (deliveryEmployeeId) REFERENCES DeliveryEmployee(deliveryEmployeeId),
	FOREIGN KEY (projectId) REFERENCES Project(projectId)
);