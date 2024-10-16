CREATE TABLE DeliveryEmployee (
	deliveryEmployeeId int NOT NULL,
	PRIMARY KEY(deliveryEmployeeId),
	FOREIGN KEY (deliveryEmployeeId) REFERENCES Employee(employeeId)
);