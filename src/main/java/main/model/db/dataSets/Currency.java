package main.model.db.dataSets;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;


@Entity
@Table(name = "currency")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotEmpty
    @Column(name = "CUR1")
    private String cur1;

    @NotEmpty
    @Column(name="CUR2")
    private String cur2;

    @NotEmpty
    @Column(name="ONDATE")
    private Date ondate;

    @NotEmpty
    @Column(name="RATE")
    private int rate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCur1() {
        return cur1;
    }

    public void setCur1(String cur1) {
        this.cur1 = cur1;
    }

    public String getCur2() {
        return cur2;
    }

    public void setCur2(String cur2) {
        this.cur2 = cur2;
    }

    public Date getOndate() {
        return ondate;
    }

    public void setOndate(Date ondate) {
        this.ondate = ondate;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "id=" + id +
                ", cur1='" + cur1 + '\'' +
                ", cur2='" + cur2 + '\'' +
                ", rate='" + rate + '\'' +
                ", ondate=" + ondate +
                '}';
    }
}