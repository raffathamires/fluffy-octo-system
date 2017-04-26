create table smartphones(
id integer not null primary key generated always as identity(start with 1, increment by 1),
name varchar(80) not null,
description varchar (300) not null,
image varchar(300) not null,
value decimal (10,2)
)

INSERT INTO app.smartphones (name, description, image, value) VALUES ('Smartphone Samsung Galaxy J2', 'Smartphone Samsung Galaxy J2 Prime TV SM-G532MT, Quad Core 1.4Ghz , Android 6.0, 8MP, 8GB, Tela 5, 4G, Duos, Desbloq - Dourado', 'https://static.kabum.com.br/produtos/fotos/84179/84179_index_p.jpg', 549.90);

INSERT INTO app.smartphones (name, description, image, value) VALUES ('Smartphone Samsung Galaxy J7', 'Smartphone Samsung Galaxy J7 Prime G610M/DS Octa Core 1.6Ghz, Android 6.0.1, 13MP, 32GB, Tela 5.5 Leitor Digital, Dual Chip, Desb - Dourado', 'https://static.kabum.com.br/produtos/fotos/83941/83941_index_p.jpg', 1078.90);

INSERT INTO app.smartphones (name, description, image, value) VALUES ('Smartphone Samsung Galaxy J7', 'Smartphone Samsung Galaxy J7 Prime G610M/DS Octa Core 1.6Ghz, Android 6.0.1, 13MP, 32GB, Tela 5.5 Leitor Digital, Dual Chip, Desb - Preto', 'https://static.kabum.com.br/produtos/fotos/83940/83940_index_p.jpg', 1089.90);

INSERT INTO app.smartphones (name, description, image, value) VALUES ('Smartphone Motorola Moto G5 Plus', 'Smartphone Motorola Moto G5 Plus TV Digital XT1683 Octa-Core Android 7.0, Tela 5.2´, 32GB, 12MP, 4G, Dual Chip Desbloqueado - Platinum', 'https://static.kabum.com.br/produtos/fotos/86842/86842_index_p.jpg', 1274.15);

INSERT INTO app.smartphones (name, description, image, value) VALUES ('Smartphone Alcatel Pixi 4', 'Smartphone Alcatel Pixi 4 4034E, Quad Core, Android 6.0, Tela 4´, 8MP, 8GB, Dual Chip, Desbloqueado - Preto + Capas Extras', 'https://static.kabum.com.br/produtos/fotos/77482/77482_index_p.jpg', 299.90);

INSERT INTO app.smartphones (name, description, image, value) VALUES ('Smartphone Asus Zenfone 3', 'Smartphone Asus Zenfone 3 ZE552KL-1A037BR, Octa Core Android 6, Tela 5,5´ 64GB, 16MP, 4G, Dual Chip, Desbloqueado - Preto Safira', 'https://static.kabum.com.br/produtos/fotos/81431/81431_index_p.jpg', 1671.90);

INSERT INTO app.smartphones (name, description, image, value) VALUES ('Smartphone Asus Zenfone 3', 'Smartphone Asus Zenfone 3 Max ZC553KL-4J011BR Octa Core, Android 6, Tela 5,5´, 32GB, 16MP, 4G, Dual Chip Desbloqueado - Prata', 'https://static.kabum.com.br/produtos/fotos/83946/83946_index_p.jpg', 1143.90);


