# Trivia-API
This API is for managing users and trivia questions. This API could be used to build a front end for a web application version of [this](https://github.com/TR-1000/trivia_game) simple console trivia game.

* Players can register and login.
* Players can view and update their information and also delete their account.
* Logged in players can create/play a round of trivia.
* Only a current admin can create another admin account, but admin cannot create a player account.
* Admins can both view all player information, as well as update and delete a players account.
* Administrators can view all questions and their potential answers.
* Anyone can view rounds played by an individual player or all players.

Documentation for making requests to the API can be found [here](https://documenter.getpostman.com/view/8437872/TVmFifEd).

*Entity Relationship Diagram*  
![ERD](https://github.com/TR-1000/trivia-api/blob/master/sql/trivia_erd.png?raw=true)


## Running the API

To run the project you will need:
* [Java SE Development Kit 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
* [Eclipse](https://www.eclipse.org/downloads/packages/release/2020-09/r/eclipse-ide-java-developers) or code editor of your choice
* [Apache Maven](https://maven.apache.org/)
* [Tomcat v8.5 Server](https://tomcat.apache.org/download-80.cgi)
* [PostgreSQL](https://www.postgresql.org/) or your preferred RDBMS
* [Postman API Testing Tool](https://www.postman.com/)

To install the project to you to local machine:
* [Download](https://github.com/TR-1000/trivia-api/archive/master.zip) project source code and unzip it into a folder location.
* [Import source code as a Maven project into Eclipse](https://github.com/TR-1000/trivia-api/blob/master/Import_Maven_Project_Into_Eclipse-Javapapers.pdf)

* In the [src/main/java/utilities/ConnectionUtil.java](https://github.com/TR-1000/trivia-api/blob/master/src/main/java/utilities/ConnectionUtil.java) file
change `String username` and `String password` to your credentials:
```Java
public class ConnectionUtil {

public static Connection getConnection() throws SQLException {

		try {
			//Lets Tomcat see where the driver is
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String url = "jdbc:postgresql://localhost:5432/trivia";
		String username = {{yourPostgresUsername}};
		String password = {{yourPassword}};

		return DriverManager.getConnection(url, username, password);

	}

}
```
* Create a database named "trivia"
```sql
CREATE DATABASE trivia;
```
* Run the scripts in the SQL directory to create the tables. Seed the database with the provided scripts. The questions and answers data can be added using the scripts or by running the main method in [src/main/java/utilities/QuestionsBootstrapper.java](https://github.com/TR-1000/trivia-api/blob/master/src/main/java/utilities/QuestionsBootstrapper.java)  


* [Start the Tomcat server in Eclipse](https://github.com/TR-1000/trivia-api/blob/master/Tomcat_Configuration_In_Eclipse-Baeldung.pdf)

* [Make requests in Postman](https://documenter.getpostman.com/view/8437872/TVmFifEd)


### Roadmap

- [x] ~~Parse questions from the [triva_data.json](https://github.com/TR-1000/trivia-api/blob/master/trivia_data.json) file and add them to the database programmatically.~~

- [ ] Password hashing

- [ ] More logging

### Challenges
* Encountered some [issues](https://discuss.atom.io/t/atom-is-not-saving-files/72580/4) with Java code not saving after editing in Atom.

* ~~Currently there is code for adding questions and answers to the database and access them from the API, but that code isn't working properly yet.~~
It's working now.
