-- 코드를 입력하세요
SELECT a.animal_id, a.name
from animal_ins a 
left join animal_outs b on a.animal_id = b.animal_id
where b.datetime < a.datetime
order by a.datetime