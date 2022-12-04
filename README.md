#### Swagger UI: http://localhost:8080/swagger-ui/index.html

### How to run
execute `sh run.sh` and then the application could be accessed from the swagger-url (Unfortunately I don't support Windows yet :-) )


#### Changes explained
* That switch case in the Application.java file is a violation of `open close principle' i.e., every time a new signal is introduced into the system, another case statement has to be added.
* Now with this setup, a signalRegistry has been added which will maintain the list of signals in the system at any point of time.
* Now.. all that "my team" has to do is to to add a new signal class that extends Signal interface and name it with a unique number (which by the way is ensured by spring)
* Although more tests could be written for the REST controller and all, our intent is to test the core and that has been tested.