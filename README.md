# _{Hair Salon}_

#### _{A program used for Hair Salon employees }, {5/6/2016}_

#### By _**{Reed Lambier}**_

## Description

_{This application is used for employers and employees to organize their business and clients at their Salon's. It will match up Stylists with their specific clients accurately and efficiently. }_

## Setup/Installation Requirements

* _$ cd ~/Desktop_
* _$ git clone_
* _https://github.com/77paradox77/Java-Week3-codeReview-.git_
* _$ cd Hair-Salon_


#### Open Terminal and run the Postgres application in a seperate window of your terminal:

*_Hair-Salon Guest$ postgres_

### Now that we have postgres running in the background we create the hair salon database:_

 ### Using terminal type the following:

 *_$ psql_

 ### Once inside psql you must type the following:
  *_CREATE DATABASE Hair_Salon;_
  *_psql Hair_Salon < Hair_Salon.sql_

 Now that our database is setup correctly in terminal we must run the following program with gradle. To do this last step type:

Hair-Salon Guest$ gradle run

No you may launch your web browser and view the site underneath the address: localhost:4567

## Known Bugs

There may be some minor bugs that need to be fixed after extensive use of the program. Most functionality should be streamlined with few errors.

## Support and contact details

If you have any questions or comments please feel free to contact me at: Rlambier46@gmail.com

## Technologies Used

This program was written in Java, CSS3, HTML5.

### License

*This program will be run underneath the license of MIT*

Copyright (c) 2016 **_{Reed Lambier}_**
