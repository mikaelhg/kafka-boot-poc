CREATE TABLE people (
    id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    name TEXT,
    email TEXT
);

CREATE TABLE horses (
    id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    person_id INTEGER REFERENCES people (id),
    name TEXT,
    stall INTEGER
);
