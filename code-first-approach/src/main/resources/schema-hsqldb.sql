DROP TABLE IF EXISTS EXPENSES; 
CREATE TABLE  EXPENSES (ID BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 0)NOT NULL PRIMARY KEY,
                        DESCRIPTION varchar(255) NOT NULL, AMOUNT BIGINT NOT NULL, CREATED DATE, TSTAMP DATE );

INSERT INTO EXPENSES (DESCRIPTION, AMOUNT ,TSTAMP) VALUES ('Lunch', 30.30,CURDATE());


/**
INSERT INTO CUSTOMERS(DATA) VALUES ('data1');

INSERT INTO CUSTOMERS(DATA) VALUES ('data2');

INSERT INTO CUSTOMERS(DATA) VALUES ('data3');
                        
                        **/