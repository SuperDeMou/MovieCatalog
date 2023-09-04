# spring-boot-security-oauth2
This article aims to provide a working example of spring boot security oauth2. To ge started with this project just checkout the project
and set up the database configuration as per application.properties and run Application.java as a java application and you are done.
The complete explanation is provided on my blog - [spring security oauth2 example](http://www.devglan.com/spring-security/spring-boot-security-oauth2-example)
This project uses
1. Spring Boot 1.5.8.RELEASE
2. Java 8
3. MySql

Visit [spring security](http://www.devglan.com/tutorial/topics/spring-security) for other similar articles on spring security.

![header](https://user-images.githubusercontent.com/38620899/106385660-2de04b00-63b0-11eb-9747-843cdc397c76.PNG)

> Status: Developing ⚠️

### It is a web application planned by me, where I perform the CRUD of Calisthenics Movements.

## Some fields in main Model is:

+ name 
+ description
+ repetation num
+ sequency num
+ dificult category
+ i know
+ user_id
+ image
  
Also that, has a User with this fields:

+ name
+ email
+ cpf
+ birth
+ active

## In addition to CRUD, I implement other features such as:

* See the more recently movement created, using Cookie.
* Entire verification system to validate forms with personalized messages.
* Message of success when create a movement, using Session Flash.
* Profile User editable.

## This features are in developing:

- Search for movements by name and/or dificulted category.
- Email verification.

## Technologies Used:

<table>
  <tr>
    <td>Java</td>
    <td>Spring Boot</td>
    <td>MySql</td>
  </tr>
  <tr>
    <td>17.*</td>
    <td>3.1.*</td>
    <td>8.0</td>
  </tr>
</table>

## How to run the application:

1. run shell: java install
2. run shell: mysql install
4. create file .env (can copy from .env.example)
5. configure your database variables in .env
6. run shell: php artisan migrate
7. run shell: php artisan serve

## How to use mail service:

1. create free account in mailtrap
2. into of mailtrap site, go to My Inbox
3. go to SMT settigns
4. choice Laravel option in Integrations
5. copy and past in your .env

<center><img src="https://user-images.githubusercontent.com/38620899/106393900-5aa85880-63d8-11eb-88f1-07ac30adad80.gif"></center>