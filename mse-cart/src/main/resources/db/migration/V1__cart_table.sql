DROP TABLE IF EXISTS cart;
CREATE TABLE cart
(
  id                  BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  customer_id         BIGINT(20)             NOT NULL,
  product_details     JSON,
  created_tstamp      DATETIME,
  created_by_id       BIGINT(20),
  last_updated_tstamp DATETIME,
  last_updated_by_id  BIGINT(20),
  deleted_tstamp      DATETIME,
  deleted_by_id       BIGINT(20)
);


