--Activity1: Create salesman table
CREATE TABLE salesman (
    salesman_id int,
    salesman_name varchar2(32),
    salesman_city varchar2(32),
    commission int
);
DESCRIBE Salesman;
--Activity2:
-- Insert one row
INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

-- Insert multiple rows at once
INSERT ALL
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM DUAL;

-- View data from all columns
SELECT * FROM salesman;

--Activity3:using  different SELECT statements with WHERE clause.Write SELECT statements for the following outputs:
--Show data from the salesman_id and salesman_city columns
SELECT salesman_id,salesman_city FROM Salesman;

--Show data of salesman from Paris
SELECT * FROM salesman WHERE salesman_city='Paris';

--Show salesman_id and commission of Paul Adam
SELECT salesman_id,commission FROM Salesman WHERE salesman_name='Paul Adam';

--Activity 4:alter table
ALTER TABLE Salesman ADD grade int;
UPDATE Salesman SET grade=100;
SELECT * FROM Salesman;

--Activity 5:set diff grade values
-- To update data in the table
UPDATE salesman SET grade=200 WHERE salesman_city='Rome';
UPDATE salesman SET grade=200 WHERE salesman_name='McLyon';
UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='Paul Adam';
SELECT * FROM Salesman;
