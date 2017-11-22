DROP TABLE IF EXISTS brand;
CREATE TABLE brand
(
  id                  BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  brand_name          VARCHAR(255)           NOT NULL,
  created_tstamp      DATETIME,
  created_by_id       BIGINT(20),
  last_updated_tstamp DATETIME,
  last_updated_by_id  BIGINT(20),
  deleted_tstamp      DATETIME,
  deleted_by_id       BIGINT(20)
);

DROP TABLE IF EXISTS category;
CREATE TABLE category
(
  id                  BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  category_name       VARCHAR(255)           NOT NULL,
  created_tstamp      DATETIME,
  created_by_id       BIGINT(20),
  last_updated_tstamp DATETIME,
  last_updated_by_id  BIGINT(20),
  deleted_tstamp      DATETIME,
  deleted_by_id       BIGINT(20)
);

DROP TABLE IF EXISTS product;
CREATE TABLE product
(
  id                  BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  product_name        VARCHAR(255)           NOT NULL,
  brand_id            BIGINT(20)             NOT NULL,
  category_id         BIGINT(20)             NOT NULL,
  price               FLOAT (24),
  mfg_date            DATETIME,
  created_tstamp      DATETIME,
  created_by_id       BIGINT(20),
  last_updated_tstamp DATETIME,
  last_updated_by_id  BIGINT(20),
  deleted_tstamp      DATETIME,
  deleted_by_id       BIGINT(20),
  details             JSON,

  CONSTRAINT fk_product_brand_id FOREIGN KEY (brand_id) REFERENCES brand (id),
  CONSTRAINT fk_product_category_id FOREIGN KEY (category_id) REFERENCES category (id)

);

DROP TABLE IF EXISTS inventory;
CREATE TABLE inventory
(
  id                  BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  product_id          BIGINT(20)           NOT NULL,
  quantity            BIGINT(20),
  created_tstamp      DATETIME,
  created_by_id       BIGINT(20),
  last_updated_tstamp DATETIME,
  last_updated_by_id  BIGINT(20),
  deleted_tstamp      DATETIME,
  deleted_by_id       BIGINT(20),

   CONSTRAINT fk_inventory_product_id FOREIGN KEY (product_id) REFERENCES product (id)

);