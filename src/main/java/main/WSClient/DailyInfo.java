package main.WSClient;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import java.net.MalformedURLException;
import java.net.URL;


@WebServiceClient(name = "DailyInfo", targetNamespace = "http://web.cbr.ru/", wsdlLocation = "http://www.cbr.ru/DailyInfoWebServ/DailyInfo.asmx")
public class DailyInfo extends Service {

    private final static URL DAILYINFO_WSDL_LOCATION;
    private final static WebServiceException DAILYINFO_EXCEPTION;
    private final static QName DAILYINFO_QNAME = new QName("http://web.cbr.ru/", "DailyInfo");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.cbr.ru/DailyInfoWebServ/DailyInfo.asmx");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DAILYINFO_WSDL_LOCATION = url;
        DAILYINFO_EXCEPTION = e;
    }

    public DailyInfo() {
        super(__getWsdlLocation(), DAILYINFO_QNAME);
    }

    @WebEndpoint(name = "DailyInfoSoap")
    public DailyInfoSoap getDailyInfoSoap() {
        return super.getPort(new QName("http://web.cbr.ru/", "DailyInfoSoap"), DailyInfoSoap.class);
    }

    private static URL __getWsdlLocation() {
        if (DAILYINFO_EXCEPTION!= null) {
            throw DAILYINFO_EXCEPTION;
        }
        return DAILYINFO_WSDL_LOCATION;
    }

}