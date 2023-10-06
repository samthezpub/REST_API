CREATE TABLE log_data (
    id serial PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    level text,
    src text,
    message text
)