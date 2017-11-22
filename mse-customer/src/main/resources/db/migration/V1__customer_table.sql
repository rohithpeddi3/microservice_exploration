DROP TABLE IF EXISTS customer;
CREATE TABLE customer
(
  id                  BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  first_name          VARCHAR(255)           NOT NULL,
  last_name           VARCHAR (255)          NOT NULL,
  address             VARCHAR (255),
  created_tstamp      DATETIME,
  created_by_id       BIGINT(20),
  last_updated_tstamp DATETIME,
  last_updated_by_id  BIGINT(20),
  deleted_tstamp      DATETIME,
  deleted_by_id       BIGINT(20)
);

DROP TABLE IF EXISTS account;
CREATE TABLE account
(
  id                  BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  account_no          INT                    NOT NULL,
  customer_id         BIGINT(20)             NOT NULL,
  current_balance     INT,
  created_tstamp      DATETIME,
  created_by_id       BIGINT(20),
  last_updated_tstamp DATETIME,
  last_updated_by_id  BIGINT(20),
  deleted_tstamp      DATETIME,
  deleted_by_id       BIGINT(20),
  CONSTRAINT fk_account_customer_id FOREIGN KEY (customer_id) REFERENCES customer (id)
);
