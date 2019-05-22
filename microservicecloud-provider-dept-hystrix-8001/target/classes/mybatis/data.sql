drop DATABASE if EXISTS clouddb001;
CREATE DATABASE clouddb001 CHARACTER set utf8;

use clouddb001;

create table dept(
	deptno BIGINT not null PRIMARY key auto_increment,
	dname VARCHAR(60),
	db_source VARCHAR(60)
);

insert into dept(dname, db_source) values('开发部', DATABASE());
insert into dept(dname, db_source) values('人事部', DATABASE());
insert into dept(dname, db_source) values('财务部', DATABASE());
insert into dept(dname, db_source) values('市场部', DATABASE());
insert into dept(dname, db_source) values('运维部', DATABASE());


