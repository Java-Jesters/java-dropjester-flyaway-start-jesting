CREATE TABLE DeliveryEmployee (
	id int NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (id) REFERENCES Employee(id)
);