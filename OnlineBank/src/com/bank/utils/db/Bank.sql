create database bankdb;

use bankdb;

create table BankUser(userName varchar(255) NOT NULL PRIMARY KEY, password varchar(255), userRole varchar(255));