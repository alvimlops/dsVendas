create table tb_sales (id int8 generated by default as identity, amount float8, date date, deals int4, visited int4, seller_id int8, primary key (id));
create table tb_sallers (id int8 generated by default as identity, name varchar(255), primary key (id));
alter table if exists tb_sales add constraint FK8j144eu4y7naxlepjhq8h6pye foreign key (seller_id) references tb_sallers;
