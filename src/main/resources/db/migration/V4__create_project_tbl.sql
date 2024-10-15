CREATE TABLE Project (
    id int NOT NULL AUTO_INCREMENT,
    `name` varchar(50) NOT NULL,
    `value` decimal(11, 2) NOT NULL,
    clientId int NOT NULL,
    techLeadId int NOT NULL,
    salesEmployeeId int NOT NULL,
    startDate DateTime NOT NULL DEFAULT CURRENT_TIMESTAMP,
    finishDate DateTime,
    PRIMARY KEY(id),
    FOREIGN KEY (clientId) REFERENCES Client(id),
    FOREIGN KEY (techLeadId) REFERENCES DeliveryEmployee(id),
    FOREIGN KEY (salesEmployeeId) REFERENCES SalesEmployee(id)
);
