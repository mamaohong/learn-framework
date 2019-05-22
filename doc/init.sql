create table student_info (
  student_id varchar(20) primary key not null ,
  name varchar(10),
  grade int,
  class int,
  java float,
  chinese float,
  math float,
  english float
);

insert into student_info values ('2014220303023', '张三', 2, 1, 59, 84, 98, 20);
insert into student_info values ('2014220303024', '李四', 2, 1, 61, 33, 0, 36);
insert into student_info values ('2014220303025', '王五', 2, 1, 72, 72, 77, 91);
insert into student_info values ('2014220303026', '赵六', 2, 1, 63, 28, 66, 2);