# spring-boot-crud

get record 
localhost:9090/get/1

save record:
localhost:9090/save
{
  "id": 1,
  "name":"abc",
  "salary":50000,
  "city":"xyz"
}

update record:
localhost:9090/update
{
  "id": 1,
  "name":"abc",
  "salary":50000,
  "city":"JPA"
}
delete record:
localhost:9090/delete/5

get all records:
localhost:9090/get
