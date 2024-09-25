-- 코드를 작성해주세요
select ID, 
        (case when SIZE_OF_COLONY <= 100 THEN 'LOW' ELSE
            (CASE WHEN SIZE_OF_COLONY > 1000 THEN 'HIGH' ELSE 'MEDIUM' END)
        END ) AS SIZE
FROM ECOLI_DATA 
ORDER BY ID
        