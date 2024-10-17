select concat(
    TRUNCATE((month(DIFFERENTIATION_DATE) - 1) / 3, 0) + 1, 
    'Q') QUARTER, count(*) ECOLI_COUNT
from ECOLI_DATA
group by QUARTER
order by QUARTER