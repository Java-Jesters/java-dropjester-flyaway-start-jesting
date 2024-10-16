CREATE TABLE DeliveryEmployeeProject (
	deliveryEmployeeId int NOT NULL,
	projectId int NOT NULL,
	workingOnProject TINYINT(1),
	PRIMARY KEY(delivery_employee_id, working_on_project),
	FOREIGN KEY (deliveryEmployeeId) REFERENCES DeliveryEmployee(id),
	FOREIGN KEY (projectId) REFERENCES Project(id)
);