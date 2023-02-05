CREATE TABLE IF NOT EXISTS expenses (
	id serial PRIMARY KEY,
	expense_name VARCHAR ( 255 )  NOT NULL,
	description VARCHAR (255) NOT NULL,
	expense_amount NUMERIC(5,2) NOT NULL,
	category VARCHAR (255) NOT NULL,
    expense_date DATE NOT NULL
);