
CREATE DATABASE hospitality_db;
USE hospitality_db;

CREATE TABLE hotels(id INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(100),location VARCHAR(100));
CREATE TABLE reservations(
id INT AUTO_INCREMENT PRIMARY KEY,
room_id INT,guest_id INT,check_in DATE,check_out DATE);

INSERT INTO hotels(name,location) VALUES ('Hotel One','Delhi'),('Hotel Two','Chennai');
