# Write your MySQL query statement below
with Employeerank as(
    select
        e.name as Employee,
        e.salary,
        e.departmentId,
        dense_rank() over (partition by departmentId order by salary desc) as rnk
    from Employee e
)
select
    d.name as Department,
    er.Employee,
    er.salary as salary

from EmployeeRank er
join Department d on er.departmentId =d.id
where er.rnk<=3;