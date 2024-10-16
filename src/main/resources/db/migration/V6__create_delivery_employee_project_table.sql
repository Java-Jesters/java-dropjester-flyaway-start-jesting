CREATE TABLE DeliveryEmployeeProject (
	deliveryEmployeeId int NOT NULL,
	projectId int NOT NULL,
	workingOnProject BOOL,
	PRIMARY KEY(deliveryEmployeeId, projectId),
	FOREIGN KEY (deliveryEmployeeId) REFERENCES DeliveryEmployee(employeeId),
	FOREIGN KEY (projectId) REFERENCES Project(projectId)
);