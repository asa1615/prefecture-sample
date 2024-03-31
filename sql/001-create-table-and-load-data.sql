DROP TABLE IF EXISTS prefectures;

CREATE TABLE  prefectures(
 id int unsigned AUTO_INCREMENT,
 prefecture VARCHAR(20) NOT NULL,
 PRIMARY KEY(id)
);

INSERT INTO prefectures (prefecture) VALUES ("北海道");
INSERT INTO prefectures (prefecture) VALUES ("宮城県");
INSERT INTO prefectures (prefecture) VALUES ("新潟県");
INSERT INTO prefectures (prefecture) VALUES ("大阪府");
INSERT INTO prefectures (prefecture) VALUES ("京都府");
INSERT INTO prefectures (prefecture) VALUES ("福岡県");