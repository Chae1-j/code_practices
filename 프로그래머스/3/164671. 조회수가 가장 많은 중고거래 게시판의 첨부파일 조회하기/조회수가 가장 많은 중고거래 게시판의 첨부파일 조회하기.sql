SELECT 
    CONCAT('/home/grep/src/', uf.BOARD_ID, '/', uf.FILE_ID, uf.FILE_NAME, uf.FILE_EXT) AS FILE_PATH
FROM 
    USED_GOODS_BOARD ub
JOIN 
    USED_GOODS_FILE uf ON ub.BOARD_ID = uf.BOARD_ID
WHERE 
    ub.VIEWS = (SELECT MAX(VIEWS) FROM USED_GOODS_BOARD)
ORDER BY 
    uf.FILE_ID DESC;
