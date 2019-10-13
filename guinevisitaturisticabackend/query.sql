CREATE TABLE destination(
id IDENTITY,
name VARCHAR(50),
address VARCHAR(100),
description VARCHAR(250),
image_url VARCHAR(15),
CONSTRAINT pk_destination_id  PRIMARY KEY(id)
);

INSERT INTO destination(name,address,description,image_url)VALUES('Bissau','Capitale, Bissau, Guinée-Bissau','capitale de la Guinée-Bissau. Selon une estimation de l’Instituto Nacional de Estatística e Censos datant de 2007, la ville compte environ 400 000 habitants, la langue la plus parlée est le créole.','DT00001');
INSERT INTO destination(name,address,description,image_url)VALUES('Bolama','Ville,Guinée-Bissau l´île de Bolama','Bolama est une ville de Guinée-Bissau, située sur lîle de Bolama, dans la région Bolama-Bijagos. La ville est issue de ancienne municipalité créée en 1871 par les Portugais.','DT00002');
INSERT INTO destination(name,address,description,image_url)VALUES('Bafata','Ville,Guinée-Bissau,centre du pays','Bafatá est une ville de Guinée-Bissau située dans le centre du pays. Lors du recensement de 2005, la population était de 22 521 habitants, ce qui en fait la seconde ville du pays.','DT00003');
INSERT INTO destination(name,address,description,image_url)VALUES('Gabu','Ville, Bissau, Guinée-Bissau,L´est du Pays','Gabu est une ville de Guinée-Bissau, située dans la région de Gabu.','DT00004');
INSERT INTO destination(name,address,description,image_url)VALUES('Quinhamel','Ville,Guinée-Bissau,Nord du pays','Quinhámel est une ville de Guinée-Bissau située dans la région de Biombo. Sa population est estimée à 2 887 habitants en 2008','DT00005');
INSERT INTO destination(name,address,description,image_url)VALUES('Cacheu','Ville,Guinée-Bissau,Nord du pays','Cacheu est une ville côtière de Guinée-Bissau, située sur la rive gauche du Rio Cacheu, à l´extrémité nord-ouest du pays.','DT00006');
INSERT INTO destination(name,address,description,image_url)VALUES('Bubaque','Ville,Guinée-Bissau,l´ile de bubaque','Bubaque est une île de la Guinée-Bissau située dans l´archipel des Bijagos. Elle a également une ville du même nom.','DT00007');




CREATE TABLE hotel(
id IDENTITY,
coordination_id INT,
destination_id INT,
photo_id INT,
email VARCHAR(100),
tel VARCHAR(14),
is_active BOOLEAN,
name VARCHAR(25),
views INT DEFAULT 0,
reserved INT DEFAULT 0,
price NUMERIC(10,2),
address VARCHAR(80),
description VARCHAR(350),
CONSTRAINT pk_hotel_id  PRIMARY KEY(id),

CONSTRAINT fk_coordination_hotel FOREIGN KEY(coordination_id) REFERENCES coordinate(id),
CONSTRAINT fk_destination_hotel FOREIGN KEY(destination_id) REFERENCES destination(id),
CONSTRAINT fk_photo_hotel FOREIGN KEY(photo_id) REFERENCES photo(id)
);

INSERT INTO hotel(coordination_id,destination_id,hotelRoom_id,photo_id,email,tel,is_active,name,
price,address,description)VALUES(1,1,1,'reservations@ceibabissau.com','+245969189292',true,'Ceiba',170,
'Av. Francisco Mendes S/N - Bissau - Guinea Bissau','Situé à Bissau, à 500 mètres des terrains de sport, le Ceiba Hotel Bissau propose des hébergements avec un restaurant, un parking privé gratuit, une piscine extérieure et un centre de remise en forme. Cet hôtel 4 étoiles propose un bar et des chambres climatisées.');

INSERT INTO hotel(coordination_id,destination_id,photo_id,email,tel,is_active,name,
price,address,description)VALUES(3,1,2,'hotelroyalbissau@reservations.com','+245969111111',true,'Royal',121,'ROYAL BISSAU HOTEL, Avenida Amilcar Cabral, C.P. 1001 Bissau, Guinea-Bissau','Situé à Bissau, à 200 mètres d´Amilcar Cabral, le Bissau Royal Hotel propose des chambres climatisées, un bar, un restaurant, une réception ouverte 24h/24');

CREATE TABLE coordinate(
id IDENTITY,
coordinate_name VARCHAR(25),
longitude DOUBLE,
latitude DOUBLE,
CONSTRAINT pk_coordinate_id  PRIMARY KEY(id)
);

INSERT INTO coordinate (coordinate_name,latitude,longitude) VALUES('Ceiba',11.859651324905373,-15.590504459689782)
INSERT INTO coordinate (coordinate_name,latitude,longitude) VALUES('Azalai',11.876254360234416,-15.590651035308838)
INSERT INTO coordinate (coordinate_name,latitude,longitude) VALUES('Royal',11.861555114034964,-15.583328604698181)
INSERT INTO coordinate (coordinate_name,latitude,longitude) VALUES('Ledger Plaza',11.860106145436028,-15.622880458831787)

CREATE TABLE reservation(
id IDENTITY,
id_user_detail int,
id_hotel int,
start_date DATE,
end_date DATE,
total_person int,
total_price NUMERIC(10,2),
total_num_room int,
CONSTRAINT pk_reservation_id  PRIMARY KEY(id),
CONSTRAINT fk_user_detail_reservation FOREIGN KEY(id_user_detail) REFERENCES user_detail(id),
CONSTRAINT fk_hotel_reservation FOREIGN KEY(id_hotel) REFERENCES hotel(id)
);

INSERT INTO reservation(id_user_detail,id_hotel,start_date,end_date,total_person,total_price,total_num_room)
VALUES(2,1,'2019-09-16','2019-09-23',1,1190,1);

CREATE TABLE user_detail(
id IDENTITY,
name VARCHAR(50),
last_name VARCHAR(50),
role VARCHAR(8),
password VARCHAR(20),
email VARCHAR(100),
tel VARCHAR(14),
enabled BOOLEAN,
CONSTRAINT pk_client_id  PRIMARY KEY(id)
);

INSERT INTO user_detail(name,last_name,role,password,email,tel,enabled) VALUES('Demba','Mane','ADMIN','Player110@','demba10@live.com.pt','00245693009500',true)
INSERT INTO user_detail(name,last_name,role,password,email,tel,enabled) VALUES('user01','user01','c','user01','user01@gmail.com','00245955532457',true)

CREATE TABLE photo(
id IDENTITY,
photo_name VARCHAR(25),
_1_photo VARCHAR(20),
_2_photo VARCHAR(20),
_3_photo VARCHAR(20),
_4_photo VARCHAR(20),
_5_photo VARCHAR(20),
_6_photo VARCHAR(20),
_7_photo VARCHAR(20),
_8_photo VARCHAR(20),
_9_photo VARCHAR(20),
_10_photo VARCHAR(20),
CONSTRAINT pk_photo_id  PRIMARY KEY(id)
);

INSERT INTO photo(photo_name,_1_photo,_2_photo,_3_photo,_4_photo,_5_photo,_6_photo,_7_photo,_8_photo,_9_photo,_10_photo) VALUES('Ceiba','HC000567','HC000568','HC000569','HC000570','HC000571','HC000572','HC000573','HC000574','HC000575','HC000576');
INSERT INTO photo(photo_name,_1_photo,_2_photo,_3_photo,_4_photo,_5_photo,_6_photo,_7_photo,_8_photo,_9_photo,_10_photo) VALUES('Royal','HR000567','HR000568','HR000569','HR000570','HR000571','HR000572','HR000573','HR000574','HR000575','HR000576');


CREATE TABLE hotelRoom(
id IDENTITY,
id_hotel INT,
room_Number int,
active boolean default true,
CONSTRAINT pk_hotelRoom_id PRIMARY KEY(id),
CONSTRAINT fk_hotel_hotelRoom FOREIGN KEY(id_hotel) REFERENCES hotel(id)
);

INSERT INTO hotelRoom(id_hotel,room_Number,active)VALUES(1,458,true);
INSERT INTO hotelRoom(id_hotel,room_Number,active)VALUES(1,459,true);
INSERT INTO hotelRoom(id_hotel,room_Number,active)VALUES(1,460,true);

INSERT INTO hotelRoom(id_hotel,room_Number,active)VALUES(2,247,true);
INSERT INTO hotelRoom(id_hotel,room_Number,active)VALUES(2,248,true);
INSERT INTO hotelRoom(id_hotel,room_Number,active)VALUES(2,249,true);


