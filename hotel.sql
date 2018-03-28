create database hotel;
use hotel;


##用户表
create table user(
	uid int auto_increment,
    loginname varchar(50) not null,
    pwd varchar(50) not null,
    telnum varchar(20) not null,
    realname varchar(20) not null,
    sex varchar(5) not null,
    email varchar(20) not null,
    primary key(uid)
)engine=InnoDB
 default CHARACTER SET=utf8
 COLLATE = utf8_general_ci;
 


##房间表
create table rooms(
	rid bigint auto_increment,
	roomID varchar(20) not null unique comment'房间号',
    roomType varchar(50) not null COMMENT'房间类型',			## ，还可以拆分成一张表
    roomState char(2) not null comment'0:未入住 1：已入住',	
    roomTel varchar(20) not null comment'房间电话',	
    roomLoc varchar(10) not null comment'位置',	
    remark varchar(100) comment'备注',
    primary key(rid)
)engine=InnoDB
 default CHARACTER SET=utf8
 COLLATE = utf8_general_ci;
 
 alter table rooms add price decimal(10,4) not null;


##入住联系人表
create table contactUser(
	cid bigint auto_increment,
    uid bigint not null,
	c_name varchar(20) not null,
	c_sex varchar(5) not null,
    c_tel varchar(20) not null,
    c_email varchar(20),
    primary key(cid)
)engine=InnoDB
 default CHARACTER SET=utf8
 COLLATE = utf8_general_ci;
 
 ##订单表
 create table orders(
	oid bigint auto_increment,
    uid bigint not null,
    rommID varchar(100) not null,
    totallive int not null comment'入住人数',
	account decimal(10,4) not null default 0 comment'订单金额',
	liveInTime datetime not null,
    leftTime datetime not null,
    create_time DATETIME NOT NULL DEFAULT now(),
	update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	primary key(oid)
 )engine=InnoDB
 default CHARACTER SET=utf8
 COLLATE = utf8_general_ci;
 
 
 ##订单联系人表
 create table odercontactUser(
	odercontactUser bigint auto_increment,
    oid bigint not null,
    cid bigint not null,
    primary key(odercontactUser)
 
 )engine=InnoDB
 default CHARACTER SET=utf8
 COLLATE = utf8_general_ci;
 alter table odercontactUser add uid bigint not null;
 
 ##数据测试
 
 
 ##1、use表
 insert into user(uid,loginname,pwd,telnum,realname,sex,email)values(null,'15909205783','666666','15909205783','yangfan','男','2585928225@qq.com');
 insert into user(uid,loginname,pwd,telnum,realname,sex,email)values(null,'18700516893','456789','18700516893','xumiao','女','626899137@qq.com');
 insert into user(uid,loginname,pwd,telnum,realname,sex,email)values(null,'15291680844','888888','15291680844','nihao','男','1148000871@qq.com');
 insert into user(uid,loginname,pwd,telnum,realname,sex,email)values(null,'18402938953','999999','18402938953','gongshun','男','2219459616@qq.com');
 select * from user;
 
 ##房间类型表测试数据
 insert into roomType(roomType,price)values('A',5000),('B',2000),('C',1000),('D',500),('E',300),('F',200),('G',200),('H',150);
 SELECT * FROM ROOMTYPE;
 
 INSERT INTO rooms(roomID,roomType,price,roomState,roomTel,roomLoc,remark)values('1001','总统套房',5000,'0','029001','A栋','海景房，基础设施一应俱全');
 INSERT INTO rooms(roomID,roomType,price,roomState,roomTel,roomLoc,remark)values('901','豪华双人房',3000,'0','029002','C栋','视野开阔，基础设施一应俱全');
 INSERT INTO rooms(roomID,roomType,price,roomState,roomTel,roomLoc,remark)values('801','豪华大床房',2000,'0','029003','D栋','舒适卫生，基础设施一应俱全');
 INSERT INTO rooms(roomID,roomType,price,roomState,roomTel,roomLoc,remark)values('701','情侣房',1000,'0','029004','B栋','温馨浪漫，基础设施一应俱全');
 INSERT INTO rooms(roomID,roomType,price,roomState,roomTel,roomLoc,remark)values('601','麻将房',800,'0','029005','A栋','棋牌娱乐，基础设施一应俱全');
 INSERT INTO rooms(roomID,roomType,price,roomState,roomTel,roomLoc,remark)values('501','标间',500,'0','029006','C栋','宽敞，基础设施一应俱全');
 INSERT INTO rooms(roomID,roomType,price,roomState,roomTel,roomLoc,remark)values('401','大床房',300,'0','029007','E栋','经济舒适，空调WiFi独卫');
 INSERT INTO rooms(roomID,roomType,price,roomState,roomTel,roomLoc,remark)values('301','单间',150,'0','029008','A栋','经济，公共卫生间');
 select * from rooms;
 
 ##入住联系人测试
insert into contactUser(uid,c_name,c_sex,c_tel,c_email)values(1,'姚明','男','0000001','00008@126.com');
insert into contactUser(uid,c_name,c_sex,c_tel,c_email)values(2,'小明','男','0000002','00007@126.com');
insert into contactUser(uid,c_name,c_sex,c_tel,c_email)values(3,'李成','男','0000004','00006@126.com');
insert into contactUser(uid,c_name,c_sex,c_tel,c_email)values(4,'小红','女','0000003','00005@126.com');
insert into contactUser(uid,c_name,c_sex,c_tel,c_email)values(1,'李霸王','男','0000005','00004@126.com');
insert into contactUser(uid,c_name,c_sex,c_tel,c_email)values(3,'倪好','女','0000006','00003@26.com');

##测试订单表

 insert into orders(uid,rommID,totallive,account,liveInTime,leftTime)values(1,'701',3,5000,now(),now());
 update rooms set roomState = '1' where roomID = '701' ;
 
 insert into orders(uid,rommID,totallive,account,liveInTime,leftTime)values(1,'101',3,5000,now(),now());
 update rooms set roomState = '1' where roomID = '101' ;
 
 insert into orders(uid,rommID,totallive,account,liveInTime,leftTime)values(1,'301',3,5000,now(),now());
 update rooms set roomState = '1' where roomID = '301' ;

update orders set uid = 3 where oid =2;
update orders set uid = 2 where oid = 3;
select * from orders;
select * from contactUser;
select * from odercontactUser;

 
 ##测试订单联系人表
insert into odercontactUser(oid,cid,uid)values(1,1,1);
insert into odercontactUser(oid,cid,uid)values(1,5,1);
  
insert into odercontactUser(oid,cid,uid)values(2,3,3);
insert into odercontactUser(oid,cid,uid)values(2,6,3);
insert into odercontactUser(oid,cid,uid)values(3,2,2);
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 