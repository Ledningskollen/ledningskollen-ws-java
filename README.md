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
