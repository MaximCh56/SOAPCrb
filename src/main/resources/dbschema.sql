DROP TABLE IF EXISTS currency;

--USER TABLE
CREATE TABLE IF NOT EXISTS currency (
    ID INT NOT NULL AUTO_INCREMENT,
    CUR1 VARCHAR(255) NOT NULL ,
    CUR2  VARCHAR(255) NOT NULL,
    ONDATE  DATE NOT NULL,
    RATE INT NOT NULL,PRIMARY KEY(ID)
);