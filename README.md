Ledningskollen Web Services Example Client for Java
===================================================

This is a references implementation of a client for
[Ledningskollen](http://www.ledningskollen.se)'s web services, written in Java.

The code uses Java's JAX WS, and is compatible with Java 6 and upwards. It does
not require any extra libraries or frameworks, although other compliant JAX WS
implementations should work as well.

The current reference implementation contains code for making calls to the
Login and CableOwner web services, created by generating code with JAX WS's
[wsimport](http://docs.oracle.com/javase/6/docs/technotes/tools/share/wsimport.html)
tool. Support for other services can easily be added by running the tool
like in the example below:

    wsimport.exe -extension -p se.ledningskollen.api.cableowner -s src https://ella.ledningskollen.se/cableowner/CableOwner.asmx?wsdl

(Replace package and WSDL URL with the service you want to generate code for.)
This example assumes `wsimport` is in your path and that your current working
directory is the reference implementation's root directory.

Note about cookies
------------------

Ledningskollen's web services uses cookies for preserving the authentication
state between requests. More specifically, it requires the client to share the
same authentication cookie between all web service endpoints in the
Ledningskollen web service API. The authentication cookie is obtained from the
[Login web service](https://ella.ledningskollen.se/cableowner/Login.asmx?wsdl),
and should then be used with any following call including the call to logout.

JAX WS does not include builtin support for this type of state tracking, and
it has to be implemented manually by the client. This is done in the class
`se.ledningskollen.example.client.Client`. This code can be re-used to easily
share the login state between any Ledningskollen web service endpoints.
An example:

```java
    Client client = new Client(login, password);
    if (client.login()) {
        CableOwner cableOwnerService = new CableOwner();
        CableOwnerSoap cableOwnerSoap = cableOwnerService.getCableOwnerSoap();
        client.initService((BindingProvider) cableOwnerSoap);

        // ...use cableOwnerService for WS calls here...
    } else {
        // ...error handling...
    }
```
