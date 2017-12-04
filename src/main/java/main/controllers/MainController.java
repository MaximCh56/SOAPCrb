package main.controllers;

import main.WSClient.DailyInfo;
import main.WSClient.DailyInfoSoap;
import main.WSClient.GetCursOnDateResponse;
import main.model.db.ORMService;
import main.model.db.dataSets.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    private ORMService ormService;


    @GetMapping(value = "/")
    public ModelAndView getAllUsers() {
        try {
            Calendar cal = Calendar.getInstance();
            cal.setTime(new Date());
            GregorianCalendar gregorianCalendar = new GregorianCalendar(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH),cal.get(Calendar.DAY_OF_MONTH));
            DatatypeFactory datatypeFactory;
            datatypeFactory = DatatypeFactory.newInstance();
            XMLGregorianCalendar date = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
            DailyInfo service1 = new DailyInfo();
            DailyInfoSoap port1 = service1.getDailyInfoSoap();
            GetCursOnDateResponse.GetCursOnDateResult result = port1.getCursOnDate(date);
            for (int i = 0; i < result.getAny().getRows().size(); i++) {
                ormService.saveCurrency(result.getAny().getRows().get(i));
            }
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        List<Currency> currencies = ormService.queryFindAllUsersJPA();
        return new ModelAndView("index", "resultObject", currencies);
    }
}
