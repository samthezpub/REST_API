CREATE TABLE log_data (
    id serial PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    level int,
    src text,
    message text
)