To run

edit /etc/hosts and add
127.0.0.1 somerandomsite.bla

To run the webserver
cd webserver/
./rebuild.sh

This starts the webserver on port 8081.

To start up on of the vulnerable services.
cd into spring-cloud-v1-vuln or spring-boot-hello-world-feature-enum
and run
mvn clean spring-boot:run
which will build and run the vulnerable service
This requires Java 8. It may work with newer Java versions, but not tested.



Then open a web browser at http://somerandomsite.bla:8081
Then select the link which matches the vulnerable service currently running.
The shutdown payload works with both services.
