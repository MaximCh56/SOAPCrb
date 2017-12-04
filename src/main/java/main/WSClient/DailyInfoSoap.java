package main.WSClient;


import com.sun.xml.ws.runtime.config.ObjectFactory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


@WebService(name = "DailyInfoSoap", targetNamespace = "http://web.cbr.ru/")
@XmlSeeAlso({ObjectFactory.class})
public interface DailyInfoSoap {
    @WebMethod(operationName = "GetCursOnDate", action = "http://web.cbr.ru/GetCursOnDate")
    @WebResult(name = "GetCursOnDateResult", targetNamespace = "http://web.cbr.ru/")
    @RequestWrapper(localName = "GetCursOnDate", targetNamespace = "http://web.cbr.ru/", className = "GetCursOnDate")
    @ResponseWrapper(localName = "GetCursOnDateResponse", targetNamespace = "http://web.cbr.ru/", className = "GetCursOnDateResponse")
    public GetCursOnDateResponse.GetCursOnDateResult getCursOnDate(@WebParam(name = "On_date", targetNamespace = "http://web.cbr.ru/") XMLGregorianCalendar onDate);

}
