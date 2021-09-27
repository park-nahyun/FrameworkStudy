SELECT USER
FROM DUAL;
--==>> SCOTT


SELECT *
FROM TBL_MEMBERLIST;


DESC TBL_MEMBERLIST;
/*
�̸�    ��?       ����            
----- -------- ------------- 
ID    NOT NULL VARCHAR2(30)  
PW    NOT NULL VARCHAR2(20)  
NAME  NOT NULL VARCHAR2(50)  
TEL   NOT NULL VARCHAR2(50)  
EMAIL          VARCHAR2(100) 
*/


--�� ���� ������ ����
DELETE
FROM TBL_MEMBERLIST;


--�� Ŀ��
COMMIT;


INSERT INTO TBL_MEMBERLIST(ID, PW, NAME, TEL, EMAIL)
VALUES('admin', CRYPTPACK.ENCRYPT('java006$', 'admin'), '������', '010-1234-1234', 'admin@test.com');
--==>> 1 �� ��(��) ���ԵǾ����ϴ�.


--�� �⺻ ��ȸ ����
SELECT ID, NAME, TEL, EMAIL
FROM TBL_MEMBERLIST
ORDER BY ID;



--�� ������ �߰� �Է�(���� ���� �ǽ��� ���� �غ�)
INSERT INTO TBL_MEMBERLIST(ID, PW, NAME, TEL, EMAIL)
VALUES('superman', CRYPTPACK.ENCRYPT('java006$', 'superman'), 'ȫ�浿', '010-1111-1111', 'superman@test.com');
--==>> 1 �� ��(��) ���ԵǾ����ϴ�.


--�� Ŀ��
COMMIT;
-->> Ŀ�� ��.