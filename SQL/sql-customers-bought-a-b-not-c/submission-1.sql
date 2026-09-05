-- Write your query below
select customer_id,customer_name from customers c
where c.customer_id in (select customer_id  from orders where
product_name ='A') AND 
c.customer_id in (select customer_id  from orders where
product_name ='B') AND 
c.customer_id NOT in (select customer_id  from orders where
product_name ='C') 
ORDER BY customer_name