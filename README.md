# ABSC Java Interview

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

This project uses an in memory dictionary/map to persist data during runtime. This dictionary/map is provided in the Data class.

## Tasks
* Code
  * Finish building out the Person model found at com.absc.interview.java.model.Person
  * Finish building out the Data class found at com.absc.interview.java.model.Data
  * Create a new API resource called PersonResource 
  * Create an endpoint on PersonResource that gets a Person's age
    * Path - `/person/{id}/age`
    * Returns a number for age
  * Create an endpoint on PersonResource that gets a Person's profile
    * Path - `/person/{id}/profile`
    * Returns a string for the profile
  * Create an endpoint on PersonResource to retrieve a Person
    * Path - `/person/{id}`
    * Returns a Person object
  * Create an endpoint on PersonResource to save a Person
    * Path - `/person`
    * Returns a boolean on a success or failure
  * Create an endpoint on PersonResource to update a Person
    * Path - `/person/{id}`
    * Returns a boolean on a success or failure
  * Create an endpoint on PersonResource to delete a Person
    * Path - `/person/{id}`
    * Returns a Person object
* Architecture
  * Create a new docker image that is able to run the application
  * Create a NGINX reverse proxy that allows a user to use `http://localhost/` for application access.