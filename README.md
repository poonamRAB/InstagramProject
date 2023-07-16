# InstagramProject
This Is a simple Insta Project.

## Framework and Language Used
  + Spring Boot
  + Java

------

## Data Flow
  1. controller
       - PostController
       - UserController
  2. dto
      - SignInInput
      - SignInOutput
      - SignUpInput
      - SignUpOutput
  4. model
       - AuthenticationToken
       - Post
       - User
  5. repository
      - IAuthenticationRepo
      - IPostRepo
      - IUserRepo
  6. service
       - PostService
       - UserService

-----

## Data Structure Used
  - List


------

## Project Summary

    This is a simple instagram project. In this project there are three models AuthenticationToken, Post, User.
    Here user can sign In / sign Up. to sign up user need to fill all the details. If user is already has signed up then , 
    he/she can simply signIn using mailId provided by them during sign Up.

