# _{Hair Salon}_

#### _{A program used for Hair Salon employees }, {5/6/2016}_

#### By _**{Reed Lambier}**_

## Description

_{This application is used for employers and employees to organize their business and clients at their Salon's. It will match up Stylists with their specific clients accurately and efficiently. }_

## Setup/Installation Requirements

$ cd ~/Desktop
$ git clone https://github.com/77paradox77/Java-RestaurantReview-SQL.git
$ cd Hair-Salon

## Open Terminal and run the Postgres application in a seperate window of your terminal:

Hair-Salon Guest$ postgres

## Now we create the hair salon database:

$ psql
$ CREATE DATABASE Hair_Salon;
$ pg_dump Hair_Salon > Hair_Salon.sql
$ psql Hair_Salon < Hair_Salon.sql

## Now in terminal we must run the program with gradle:

Hair-Salon Guest$ gradle run

## Known Bugs

There are several small issues with the .vtl files that are currently being sorted out.

## Support and contact details

If you have any questions or comments please feel free to contact me at: Rlambier46@gmail.com

## Technologies Used

This program was written in Java, CSS3, HTML5.

### License

*This program will be run underneath the license of MIT*

Copyright (c) 2016 **_{Reed Lambier}_**
