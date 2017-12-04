package main.WSClient;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"getCursOnDateResult"})
@XmlRootElement(name = "GetCursOnDateResponse")
public class GetCursOnDateResponse {

    @XmlElement(name = "GetCursOnDateResult")
    protected GetCursOnDateResponse.GetCursOnDateResult getCursOnDateResult;

    public GetCursOnDateResponse.GetCursOnDateResult getGetCursOnDateResult() {
        return getCursOnDateResult;
    }

    public void setGetCursOnDateResult(GetCursOnDateResponse.GetCursOnDateResult value) {
        this.getCursOnDateResult = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"any"})
    public static class GetCursOnDateResult {

        @XmlElement(name="diffgram",namespace="urn:schemas-microsoft-com:xml-diffgram-v1")
        protected ValuteData any;
        public ValuteData getAny() {
            return any;
        }
        public void setAny(ValuteData any) {
            this.any = any;
        }
    }


}