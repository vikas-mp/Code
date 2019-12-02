# Code
Initial Setup

Create a data base in MYSQL with name world by using following command

CREATE DATABASE world;

Clone the project from the github into the eclipse. 

Please change the mysql user name and password to its respective value in application.properties under src/main/java/resources

Run the main class EmplloyeeApplication. 

CRUD Operations

Create API
(POST)	localhost:8080/company/employees/ 
Go to Authorization tab select Basic auth in type and give username as admin	and password as admin
Body
{"name":"VIK","designation":"SE","startDate":"20021995","dept":"bu","endDate":"19021995","status":"working","DOB":"10921995","reportingManager":"vilau","gender":"male","bloodGroup":"bpositve","address":"goa"}
Response
200 OK
{
    "id": 1,
    "name": "VIK",
    "designation": "SE",
    "startDate": "20021995",
    "dept": "bu",
    "endDate": "19021995",
    "status": "working",
    "reportingManager": "vilau",
    "gender": "male",
    "bloodGroup": "bpositve",
    "address": "goa",
    "dob": “10921995”
}



Retrieve API:
(GET)	localhost:8080/company/employees/ 
Go to Authorization tab select Basic auth in type and give username as admin	and password as admin
Response 
200 OK
[
    {
        "id": 1,
        "name": "VIK",
        "designation": "SE",
        "startDate": "20021995",
        "dept": "bu",
        "endDate": "19021995",
        "status": "working",
        "reportingManager": "vilau",
        "gender": "male",
        "bloodGroup": "bpositve",
        "address": "goa",
        "dob": “10921995”
    },
    {
        "id": 2,
        "name": "VIK",
        "designation": "bpositve",
        "startDate": "20021995",
        "dept": "bu",
        "endDate": "19021995",
        "status": "working",
        "reportingManager": "vilau",
        "gender": "male",
        "bloodGroup": "bpositve",
        "address": "AP",
        "dob": "10921995"
    }
]

Retrieve by id
(GET)	localhost:8080/company/employees/2
Go to Authorization tab select Basic auth in type and give username as admin	and password as admin

Response 
200 OK
{
    "id": 2,
    "name": "VIK",
    "designation": "bpositve",
    "startDate": "20021995",
    "dept": "bu",
    "endDate": "19021995",
    "status": "working",
    "reportingManager": "vilau",
    "gender": "male",
    "bloodGroup": "bpositve",
    "address": "AP",
    "dob": "10921995"
}

Delete API
(DELETE)	localhost:8080/company/employees/2

Response
 200 OK


Update API (update address from goa to delhi)
(PUT) localhost:8080/company/employees/1
Go to Authorization tab select Basic auth in type and give username as admin	and password as admin

Body
{
    "id": 1, "name "VIK", "designation": "SE", "startDate": "20021995","dept": "bu", "endDate": 9021995",  “status": "working", "reportingManager": "vilau", "gender": "male","bloodGroup": "bpositve",  "address": “delhi",    "dob": "10921995"}




Response 
200 OK
{
    "id": 1,
    "name": "VIK",
    "designation": "SE",
    "startDate": "20021995",
    "dept": "bu",
    "endDate": "19021995",
    "status": "working",
    "reportingManager": "vilau",
    "gender": "male",
    "bloodGroup": "bpositve",
    "address": "delhi",
    "dob": "10921995"
}

Junit 
Run the AppTest.java to check the test case for GET request.
