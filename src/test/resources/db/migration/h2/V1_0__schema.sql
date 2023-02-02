CREATE TABLE train (
    id            SERIAL PRIMARY KEY, --Typ SERIAL automatycznie inkrementuje swoją wartość przy zapisie rekordu
    name          VARCHAR(255) NOT NULL,
    type          VARCHAR(255) NOT NULL,
    purchase_date TIMESTAMP    NOT NULL
);
