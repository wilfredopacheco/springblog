CREATE database blogs_db;

CREATE USER adlister_user@localhost IDENTIFIED BY 'p@$$w0rd';
GRANT ALL ON blogs_db.* TO adlister_user@localhost;

USE blogs_db;

CREATE TABLE users (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    gender VARCHAR(6),
    name_title VARCHAR(10),
    first_name VARCHAR(15),
    last_name VARCHAR(15),
    street VARCHAR(26),
    city VARCHAR(17),
    state VARCHAR(17),
    zip_code VARCHAR(17) ,
    latitude NUMERIC(10),
    longitude NUMERIC(10),
    timezone_offset VARCHAR(15),
    timezone_description VARCHAR(100),
    email VARCHAR(30),
    uuid VARCHAR(36),
    username VARCHAR(23),
    password VARCHAR(100),
    login_salt VARCHAR(8),
    login_md5 VARCHAR(32),
    login_sha1 VARCHAR(40),
    login_sha256 VARCHAR(64),
    dob_date VARCHAR(20),
    dob_age INT,
    registered_date VARCHAR(20),
    registered_age INT,
    phone VARCHAR(20),
    cell VARCHAR(23),
    id_name VARCHAR(4),
    id_value VARCHAR(17),
    picture_large VARCHAR(60),
    picture_medium VARCHAR(60),
    picture_thumbnail VARCHAR(60),
    nat VARCHAR(2),
    info_seed VARCHAR(16),
    info_results INT,
    info_page INT,
    info_version NUMERIC(2, 1),
    PRIMARY KEY (id)
);

INSERT INTO users (gender, name_title, first_name, last_name, street, city, state, zip_code, latitude, longitude, timezone_offset, timezone_description, email, uuid, username, password
,login_salt, login_md5, login_sha1, login_sha256, dob_date, dob_age, registered_date, registered_age, phone, cell, id_name, id_value, picture_large, picture_medium, picture_thumbnail, nat, info_seed, info_results, info_page, info_version) VALUES
('female','ms','caitlin','wood','20 universal drive','christchurch','auckland',19409,61.370716,-152.404419,'-9:00','Alaska','caitlin.wood@example.com','2ff10e10-1528-46ae-95a4-fe357e71f0a0','crazywolf905','$2a$12$4X.XmYp/anE0L0ERLxhVFuyJApgY.c.4zASptazZepm6X.cTQ9/CG','tjHxO5hv','37869539a913c2207f8391b3dc67d8cd','8847735f4fcac36d91d21f7d542cfd0f605d2c59','0a91c37da796d281ad7526359eba53c82814c317285f1969f1fad4982523e53a','1956-08-02T05:54:13Z',62,'2007-10-29T11:03:57Z',10,'(840)-906-0110','(859)-639-7472',NULL,NULL,'https://randomuser.me/api/portraits/women/44.jpg','https://randomuser.me/api/portraits/med/women/44.jpg','https://randomuser.me/api/portraits/thumb/women/44.jpg','NZ','d6e9e391817afe7c',1,1,1.2),
('male','mr','eino','laitinen','7811 pyynikintie','lemland','uusimaa',56478,31.054487,-97.563461,'+5:45','Kathmandu','eino.laitinen@example.com','36bc97f8-a4d7-44bf-ae7e-6cffc3aecbb0','heavytiger441','$2a$12$jCdGkjlaM3uu8vSD8dleluiDboHMUhkCLf0jc/H003C1pV/74WDjG','Nr1DsS8N','3485b660fb0b5bb38d6ce0663dddc423','c4dac915a466339d7954aee5518924467cf99810','60f22da7b8bf9a370e3a7c9c41439289a47e7e5d4e82e121cb238da24692efe4','1987-06-12T04:53:32Z',31,'2017-07-23T14:44:24Z',1,'08-268-777','040-555-14-29','HETU','NaNNA525undefined','https://randomuser.me/api/portraits/men/96.jpg','https://randomuser.me/api/portraits/med/men/96.jpg','https://randomuser.me/api/portraits/thumb/men/96.jpg','FI','e20072e164726f67',1,1,1.2),
('male','mr','sigmund','bechtold','bahnhofstraße 125','recklinghausen','sachsen-anhalt',79386,40.349457,-88.986137,'-10:00','Hawaii','sigmund.bechtold@example.com','d0151bdc-0a47-46b0-a00d-d5d6f3c47d86','angryswan839','$2a$12$PTYIJwN/c4K4heERpqVs1eLikf.z.Rkp.BW4.1ndOV9GQ40qB9azi','aQrExTbP','10f5505a44eb13d247d60a32ae9c6356','1d5a098298840cdea7e78e160bd917211804c831','f1cb7c2491a699a52e73ba640aec189a778fc541209b193c05c16ee591fbc193','1962-04-27T14:08:05Z',56,'2015-06-26T06:30:55Z',3,'0918-3485324','0177-6546860',NULL,NULL,'https://randomuser.me/api/portraits/men/38.jpg','https://randomuser.me/api/portraits/med/men/38.jpg','https://randomuser.me/api/portraits/thumb/men/38.jpg','DE','329c7d3a2bc51d74',1,1,1.2),
('male','mr','leon','jones','2699 george street','portmarnock','waterford',38761,39.059811,-105.311104,'+9:00','Tokyo, Seoul, Osaka, Sapporo, Yakutsk','leon.jones@example.com','97e43ce5-36d5-47bb-b958-7225e4722c8c','greenleopard529','$2a$12$jXaWq3XUSc6OPsNSTHkCGOWTctubNaLGMSVxD2Tsm6UoKA1i4V7hC','pyYxEQRC','846c9434c5383e833ce336a1e01501b8','3b2ed9302f25dca8d27608e65a91ef563d417cf1','5b01ad340791a920aeca1d64244b122fccc868ea7c130551b3c759f511e73a99','1951-12-02T16:09:29Z',66,'2004-11-25T06:27:20Z',13,'071-241-1757','081-425-6275','PPS','2088143T','https://randomuser.me/api/portraits/men/32.jpg','https://randomuser.me/api/portraits/med/men/32.jpg','https://randomuser.me/api/portraits/thumb/men/32.jpg','IE','60450324c36bb484',1,1,1.2),
('female','madame','michelle','clement','2390 rue paul bert','ferreyres','nidwalden',5493,34.840515,-106.248482,'+2:00','Kaliningrad, South Africa','michelle.clement@example.com','b2a83f48-2dfc-49ae-9812-4e6abb72ea7a','blackfish922','$2a$12$CcWVrQQZs9MrcT54kUTTYOcYZNXPitCE28K4naSHMKe8X12kr6keS','29XMP4gG','a888e7e9af385e14342921f9cef30ccc','9dcdd1df534d9c98548724756fecf682b361737d','42abe4dd7fb4f0795bfb8def0579d618065ee7a0c6464b2bc19399017599653c','1966-04-13T08:06:05Z',52,'2013-04-04T22:35:32Z',5,'(196)-464-4170','(287)-131-4559','AVS','756.8593.1304.18','https://randomuser.me/api/portraits/women/71.jpg','https://randomuser.me/api/portraits/med/women/71.jpg','https://randomuser.me/api/portraits/thumb/women/71.jpg','CH','0dea58e7285e6feb',1,1,1.2),
('female','miss','sally','denkel','3520 bağdat cd','kastamonu','bilecik',60371,42.165726,-74.948051,'-11:00','Midway Island, Samoa','sally.denkel@example.com','d4505d72-85ac-4b0d-9d08-cf03ac9674a8','orangerabbit958','$2a$12$WvbsXi4JCCIKIUY1igs6VOMw3.2AwT9xW0p/2rWmYwu1kKqfuLYse','uPYSd1K2','c890c43f67004324d4147b71864c661a','9e356cca0094acd16c946ef8e097c831925eb712','2b44722a1d2a015b4f3b7338c3b05a71c33817994f11c5be56cc786d50132e02','1945-04-19T14:38:39Z',73,'2005-10-26T21:36:54Z',12,'(753)-436-5799','(565)-567-6632',NULL,NULL,'https://randomuser.me/api/portraits/women/63.jpg','https://randomuser.me/api/portraits/med/women/63.jpg','https://randomuser.me/api/portraits/thumb/women/63.jpg','TR','5f97d268894bbe21',1,1,1.2),
('female','mrs','lilja','justi','812 fredrikinkatu','nurmijärvi','kainuu',46382,44.268543,-89.616508,'-12:00','Eniwetok, Kwajalein','lilja.justi@example.com','73901193-68cf-4822-becf-240b0338fd00','yellowcat366','$2a$12$gSB8Bv/ifA188EbS4G.LVudjUog7xIeZpdW5DiSsMvOW.F/qLeYEi','IW0Glk84','fe2e550b69ec71bab6622914cdc6c391','2c114569d7a02f52435e4b2ef78f361245d7b7b7','644efab89e6512485e03bbee107ce8933c6463cec6b40c9aafd19ed4882179b7','1945-01-22T03:09:17Z',73,'2014-03-24T02:04:43Z',4,'03-259-800','044-418-22-81','HETU','NaNNA760undefined','https://randomuser.me/api/portraits/women/5.jpg','https://randomuser.me/api/portraits/med/women/5.jpg','https://randomuser.me/api/portraits/thumb/women/5.jpg','FI','e7c39ad1c1fa19bc',1,1,1.2),
('male','mr','thomas','bowman','5184 george street','carlow','kerry',43549,35.565342,-96.928917,'-3:30','Newfoundland','thomas.bowman@example.com','e1483265-8351-446f-86e4-9a8652ab25a0','tinyfish625','$2a$12$hY1R2W/ymmv4UdUwm4lY5./qYAA4Wa0m/0t.bxjwAsNF5QSW8fGT6','Gpuhtx9b','92fe3edf559d6d2714317c13b76d3507','9c4f74cc3d99d64d7852f8a98b44e5a0402bceb7','d0093af48796675ce1ca875fce69824a64ff4aba37645410c69675a87e7c0e8c','1979-11-06T12:54:38Z',38,'2011-01-11T19:30:03Z',7,'031-167-1360','081-591-6920','PPS','9427189T','https://randomuser.me/api/portraits/men/41.jpg','https://randomuser.me/api/portraits/med/men/41.jpg','https://randomuser.me/api/portraits/thumb/men/41.jpg','IE','64f110dafceb233d',1,1,1.2),
('male','mr','sammy','sullivan','583 main street','sunderland','warwickshire','D3C 9NF',42.011539,-93.210526,'+2:00','Kaliningrad, South Africa','sammy.sullivan@example.com','de806dec-b2db-4fa3-8ec1-3eb3cf375aa8','smallbutterfly303','$2a$12$0QH92VqOIOnBCIb7PC3QsuGXc12YQLctx0.oRuiPZ7zF7jMWPxkoy','SlZR8OmI','3b6df1e2599cad595d3bf885bd046488','7d0a54cac2d1fd4bd4cd732b41736eb9e4195358','9a35b2b5de8bd7a6566db8fa33343e203b9d176f3081b2d3ea9aaec2c07f13fd','1993-07-14T12:27:31Z',25,'2013-11-27T19:38:53Z',4,'0115815 799 2507','0742-463-125','NINO','RX 68 02 45 A','https://randomuser.me/api/portraits/men/21.jpg','https://randomuser.me/api/portraits/med/men/21.jpg','https://randomuser.me/api/portraits/thumb/men/21.jpg','GB','5649d9218b8ce822',1,1,1.2),
('male','mr','quin','schetters','7238 gansstraat','hoorn','noord-brabant',66333,35.747845,-86.692345,'-5:00','Eastern Time (US & Canada), Bogota, Lima','c','b93b368a-6665-4a51-80b4-9e1468664b6d','sadfish623','$2a$12$wyeAVAoBtWGpMvYWr/uWcubAD/.W5Wk7QF14SqPwUjXg8ZRFqvZ2S','yxyuMuga','dc0f78b7c792957ee91401d298749223','ecfb3b3595ac8388e567405117133f732d7478b0','494fd9fce7fb5df37f26c6331af578725a0c896e9f408d0d62b62cb8e734c3e3','1991-01-20T02:20:30Z',27,'2003-07-19T08:38:17Z',15,'(354)-336-4878','(446)-925-1031','BSN',12934612,'https://randomuser.me/api/portraits/men/27.jpg','https://randomuser.me/api/portraits/med/men/27.jpg','https://randomuser.me/api/portraits/thumb/men/27.jpg','NL','ef35b30c8f0130e7',1,1,1.2);

UPDATE users SET username = first_name;
-- this command displays the users
-- SELECT * FROM users\G

CREATE TABLE posts(
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id INT UNSIGNED DEFAULT NULL,
  title VARCHAR(100) NOT NULL,
  body VARCHAR(100) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id)
  REFERENCES users (id)
);

INSERT INTO posts (user_id, title, body) VALUES
(1,'a good day', 'meh'),
(2, 'a bad day', 'meh again'),
(3, 'a good day and a bad day', 'this week has been so meh');