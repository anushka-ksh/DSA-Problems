# Write your MySQL query statement below
select e.name
from Employee e
join (
    select managerId
    from Employee
    group by managerId
    having count(*)>=5
) as m on e.id=m.managerId;