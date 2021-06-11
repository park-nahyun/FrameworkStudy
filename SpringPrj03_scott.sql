SELECT USER
FROM DUAL;
--==>> SCOTT


SELECT *
FROM TBL_MEMBERLIST;


DESC TBL_MEMBERLIST;
/*
이름    널?       유형            
----- -------- ------------- 
ID    NOT NULL VARCHAR2(30)  
PW    NOT NULL VARCHAR2(20)  
NAME  NOT NULL VARCHAR2(50)  
TEL   NOT NULL VARCHAR2(50)  
EMAIL          VARCHAR2(100) 
*/


--○ 기존 데이터 삭제
DELETE
FROM TBL_MEMBERLIST;


--○ 커밋
COMMIT;


INSERT INTO TBL_MEMBERLIST(ID, PW, NAME, TEL, EMAIL)
VALUES('admin', CRYPTPACK.ENCRYPT('java006$', 'admin'), '관리자', '010-1234-1234', 'admin@test.com');
--==>> 1 행 이(가) 삽입되었습니다.


--○ 기본 조회 구문
SELECT ID, NAME, TEL, EMAIL
FROM TBL_MEMBERLIST
ORDER BY ID;



--○ 데이터 추가 입력(원격 접속 실습을 위한 준비)
INSERT INTO TBL_MEMBERLIST(ID, PW, NAME, TEL, EMAIL)
VALUES('superman', CRYPTPACK.ENCRYPT('java006$', 'superman'), '홍길동', '010-1111-1111', 'superman@test.com');
--==>> 1 행 이(가) 삽입되었습니다.


--○ 커밋
COMMIT;
-->> 커밋 완.