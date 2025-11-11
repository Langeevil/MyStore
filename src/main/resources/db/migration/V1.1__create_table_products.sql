create table if not exists products (
    id serial not null,
    name varchar(50) not null,
    category_id integer not null,
    constraint pk_product primary key(id),
    constraint fk_product_category foreign key (category_id) references categories(id)
);