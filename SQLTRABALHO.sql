-- CREATE DATABASE A3;
USE A3;

-- -- Tabela para armazenar informações dos usuários
-- CREATE TABLE usuario (
--     id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, -- ID do usuário
--     nome VARCHAR(30), -- Nome do usuário
--     senha VARCHAR(20) -- Senha do usuário
-- );

-- -- Tabela para armazenar tipos de gastos
-- CREATE TABLE TB_TIPO (
--     CODIGO INT NOT NULL AUTO_INCREMENT PRIMARY KEY, -- Código do tipo de gasto
--     NOME VARCHAR(15) -- Nome do tipo de gasto
-- );

-- -- Tabela para armazenar informações dos gastos
-- CREATE TABLE TB_GASTOS (
--     CODIGO_G INT NOT NULL AUTO_INCREMENT PRIMARY KEY, -- Código do gasto
--     NOME VARCHAR(255), -- Nome/descrição do gasto
--     VALOR DOUBLE, -- Valor do gasto
--     TIPO INT, -- Referência ao código do tipo de gasto na tabela TB_TIPO
--     DATA DATE, -- Data do gasto
--     FOREIGN KEY (TIPO) REFERENCES TB_TIPO(CODIGO) -- Chave estrangeira referenciando o tipo de gasto na tabela TB_TIPO
-- );

Select * from usuario;