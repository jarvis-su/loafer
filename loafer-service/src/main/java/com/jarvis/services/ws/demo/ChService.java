package com.jarvis.services.ws.demo;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.WebParam.Mode;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(name = "SayHello", portName = "SayHellowServicePort", serviceName = "SayHelloServiceName",
        targetNamespace = "http://www.jarvis.com")
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
public class ChService {

    @WebMethod(action = "sayHello", operationName = "saySomeWord")
    @WebResult(name = "Person", partName = "PersonName")
    public Person sayHelloWord(@WebParam(name = "paramA", partName = "p1", mode = Mode.IN) String name) {
        Person persons = new Person();
        persons.setName("My name is " + name);
        return persons;
    }

}
