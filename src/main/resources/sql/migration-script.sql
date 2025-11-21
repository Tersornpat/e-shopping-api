-- Create sequence
CREATE SEQUENCE ESHOPPING.test_customer_id_seq
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    NO MAXVALUE
    CACHE 1;

-- Create table
CREATE TABLE ESHOPPING.test_customer (
    id BIGINT NOT NULL DEFAULT nextval('test_customer_id_seq'),
    firstname VARCHAR(100),
    lastname  VARCHAR(100),
    tel       VARCHAR(50),
    email     VARCHAR(255),
    PRIMARY KEY (id)
);

-- Link sequence to the column (recommended)
ALTER SEQUENCE test_customer_id_seq
    OWNED BY test_customer.id;
