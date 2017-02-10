-- SQL Test

insert into emaillist values (seq_emaillist.nextval, '미니', '언즈', 'minions@gmail.com');

select * from emaillist;


rollback;

select no, first_name, last_name, email from emailList order by no desc;


commit;