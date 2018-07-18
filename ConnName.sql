select s.sname from sailors s where s.sid in(select r.sid from reserves r where r.bid=44);

select s.sname from sailors s where exists (select * from reserves r where r.bid=44 and s.sid=r.sid);

create table product(prodid INTEGER PRIMARY KEY,prodname varchar2(20));

insert into product VALUES(1,'watch');
insert into product VALUES(2,'watch1');
insert into product VALUES(3,'watch3');

select * from product;

create table customer
(
    custname varchar(10), 
    custid integer, 
    primary key (custid,custname)
);

create table authors (authorid integer primary key,
authorname varchar(20)
);

create table books( bookid number , authorid integer references authors(authorid) , bookname varchar(20));

drop table authors; drop table books;

/*alter table persons add constraint chkdept check*/

create table employees ( empid int primary key, empname varchar(20), mgrid int );

insert into employees values(1,'Jason',0);
insert into employees values(2,'Kiran',1);
insert into employees values(3,'Karthik',5);
insert into employees values(4,'Akarsh',1);
insert into employees values(5,'Sanjana',2);
insert into employees values(6,'Megha',5);

select e.empname, m.empname from employees e, employees m where e.mgrid = m.empid;