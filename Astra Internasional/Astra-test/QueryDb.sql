SELECT nama, daerah, pekerjaan
FROM customer
INNER JOIN pekerjaan ON customer.idpekerjaan = pekerjaan.id
WHERE isactive = 1
AND nama LIKE "KEN%";
