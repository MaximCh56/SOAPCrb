package main.WSClient;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"onDate"})
@XmlRootElement(name = "GetCursOnDate")
public class GetCursOnDate {

    @XmlElement(name = "On_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar onDate;

    public XMLGregorianCalendar getOnDate() {
        return onDate;
    }

    public void setOnDate(XMLGregorianCalendar value) {
        this.onDate = value;
    }

}