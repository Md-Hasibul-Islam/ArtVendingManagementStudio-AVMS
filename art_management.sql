create database Art_management
use  Art_management


create table users(
	id int primary key identity(1,1),
	name varchar(200),
	email varchar(200),
	mobileNumber varchar(200),
	address varchar(200),
	password varchar(200),
	securityquestion varchar(200),
	answer varchar(200),
	status varchar(200)
)
INSERT INTO users (name, email, mobileNumber, address, password, securityquestion, answer, status)
VALUES ('John Doe', 'johndoe@example.com', '55589011234', '123 Main St', 'password123', 'What is your mothers maiden name?', 'Smith', 'true'),
('Jane Smith', 'janesmith@example.com', '55524635678', '456 Oak Ave', 'mypassword', 'What was the name of your first pet?', 'Rover', 'true'),
('Bob Johnson', 'bobjohnson@example.com', '55509349999', '789 Maple Blvd', 'password456', 'What city were you born in?', 'New York', 'false'),
('Sara Lee', 'saralee@example.com', '55589891111', '321 Elm St', 'pass1234', 'What is your favorite color?', 'Blue', 'true'),
('Tom Smith', 'tomsmith@example.com', '55512322222', '555 Cherry Ln', '12345678', 'What is your favorite book?', 'To Kill a Mockingbird', 'false'),
('Mary Jones', 'maryjones@example.com', '55512343333', '777 Pine St', 'password789', 'What is your favorite food?', 'Pizza', 'true'),
('Bill Williams', 'billwilliams@example.com', '55567864444', '888 Walnut Ave', 'mysecret', 'What is your favorite movie?', 'The Godfather', 'false'),
('Karen Davis', 'karendavis@example.com', '55514706666', '999 Cedar Rd', 'secretpass', 'What is your favorite song?', 'Bohemian Rhapsody', 'true'),
('Mike Brown', 'mikebrown@example.com', '55508647777', '1111 Birch Ln', '12345', 'What is your favorite animal?', 'Dog', 'false'),
('Lisa Johnson', 'lisajohnson@example.com', '55543218888', '2222 Pine St', 'passpass', 'What is your favorite hobby?', 'Reading', 'true');

--truncate table users

create table category(
	id int primary key identity(1,1),
	name varchar (200)
)
INSERT INTO category (name)
VALUES ('Oil Painting'), 
('Religious Painting'),
('Landscape'),
('Portrait'),
('Still life'),
('Abstract'),
('Realism');


create table artwork(
	id int primary key identity(1,1),
	name varchar(200),
	category varchar(200),
	price varchar(200)
)
INSERT INTO artwork (name, category, price)
VALUES ('Starry Night', 'Oil Painting', '25000 BDT'),
('The Persistence of Memory', 'Realism', '45000 BDT'),
('The Scream', 'Realism', '40000 BDT'),
('The Last Supper', 'Religious Painting', '55000 BDT'),
('True Beauty', 'portrait', '5000 BDT'),
('Circles', 'abstract', '7000 BDT'),
('Countryside', 'landscape', '6000 BDT'),
('William Wallace', 'portrait', '5500 BDT'),
('Shapes', 'abstract', '7500 BDT'),
('Braveheart', 'landscape', '6500 BDT'),
('Monalisa', 'portrait', '45900 BDT'),
('Boats', 'abstract', '8000 BDT'),
('The Scottish Tale', 'landscape', '5500 BDT');


create table Artist(
	id int primary key identity(1,1),
	artist_name varchar(200),
	category varchar(200),
	art_name varchar(200)
)
INSERT INTO Artist (artist_name, category, art_name)
VALUES ('Leonardo Da Vinci', 'Portrait', 'Monalisa'),
       ('Van Gohg', 'Oil', 'Starry Night'),
       ('David Lee', 'Abstract', 'Shapes'),
       ('Mel Gibson', 'Portrait', 'William Wallace'),
       ('Tom Wilson', 'Landscape', 'Countryside'),
       ('Emily Davis', 'Portrait', 'True Beauty');


CREATE TABLE bill(
	id INT  PRIMARY KEY,
	name VARCHAR(255),
	mobileNumber varchar(255),
	email VARCHAR(255),
	date varchar(255),
	total varchar(255),
	createdBy varchar(255),
);

--drop table bill


use Art_management

--drop table Employee



select * from bill
select * from Artist
select * from users
select * from category
select * from artwork

