package main.WSClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public  class ValuteCursOnDate {
    @XmlElement(name="Vname")
    private String name;
    @XmlElement(name="Vnom")
    private BigDecimal nom;
    @XmlElement(name="Vcurs")
    private BigDecimal curs;
    @XmlElement(name="Vcode")
    private int code;
    @XmlElement(name="VchCode")
    private String chCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getNom() {
        return nom;
    }

    public void setNom(BigDecimal nom) {
        this.nom = nom;
    }

    public BigDecimal getCurs() {
        return curs;
    }

    public void setCurs(BigDecimal curs) {
        this.curs = curs;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getChCode() {
        return chCode;
    }

    public void setChCode(String chCode) {
        this.chCode = chCode;
    }
}