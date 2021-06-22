CREATE DATABASE IF NOT EXISTS `myapp`;
use `myapp`;

DROP TABLE IF EXISTS `member`;

CREATE TABLE IF NOT EXISTS `member`(
		member_id bigint not null,
		name varchar(255),
		primary key (member_id)
);
