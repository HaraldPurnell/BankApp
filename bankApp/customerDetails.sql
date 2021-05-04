CREATE TABLE [Customers] (
	[CustomerId] INTEGER NOT NULL PRIMARY KEY,
	[CustomerFirstName] NVARCHAR(25) NOT NULL,
	[CustomerLastName] NVARCHAR(25) NOT NULL,
	[CustomerBirthDate] DATE NOT NULL,
	[CustomerPinNumber] INTEGER(16) NOT NULL,
	[CustomerAccountType] NVARCHAR(25) NOT NULL,
	[CustomerCurrentBalance] DOUBLE(100000, 2) NOT NULL
);


INSERT INTO [Customers] VALUES(1, 'John', 'Smith', '1978-10-18',      1234567898765432, 'Basic', 1324.43);
INSERT INTO [Customers] VALUES(2, 'Jackson', 'Percy', '1955-03-01',   9174837629504733, 'Premium', 27467.00);
INSERT INTO [Customers] VALUES(3, 'Meghan', 'Brewster', '1995-05-19', 1926473849503928, 'Basic', 15226.43);
INSERT INTO [Customers] VALUES(4, 'Ian', 'Holmes', '1993-05-10',      8372648290103849, 'Regular', 24.00);
INSERT INTO [Customers] VALUES(5, 'Lucy', 'Moon', '1976-09-29',       9102938475829198), 'Regular', 100.10;
		