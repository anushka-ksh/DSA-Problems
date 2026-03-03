# Write your MySQL query statement below
with mycte as (
    select
        order_date,
        buyer_id
    from 
        Orders
    where order_date >='2019-01-01' and order_date<='2019-12-31'
)

select
    u.user_id as buyer_id,
    u.join_date,
    count(m.buyer_id) as orders_in_2019

from Users u
left join mycte m on u.user_id = m.buyer_id
group by u.user_id;

    
