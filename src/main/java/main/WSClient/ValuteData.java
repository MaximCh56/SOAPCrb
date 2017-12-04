package main.WSClient;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class ValuteData {

    @XmlElementWrapper(name="ValuteData")
    @XmlElement(name="ValuteCursOnDate")
    private List<ValuteCursOnDate> rows = new ArrayList<ValuteCursOnDate>();

    public List<ValuteCursOnDate> getRows() {
        return rows;
    }
    public void setRows(List<ValuteCursOnDate> rows) {
        this.rows = rows;
    }
}