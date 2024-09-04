-- 코드를 입력하세요
SELECT DISTINCT(A.CAR_ID)
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY A
JOIN CAR_RENTAL_COMPANY_CAR B ON A.CAR_ID = B.CAR_ID
WHERE START_DATE >= '2022-10-01'
    AND CAR_TYPE = '세단' 
ORDER BY CAR_ID DESC