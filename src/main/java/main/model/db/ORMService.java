package main.model.db;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import main.WSClient.ValuteCursOnDate;
import main.model.db.dataSets.Currency;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ORMService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Currency> queryFindAllUsersJPA() {
        String query = "from Currency";
        TypedQuery<Currency> typedQuery = entityManager.createQuery(query, Currency.class);
        return typedQuery.getResultList();
    }


    public int saveCurrency(ValuteCursOnDate valuteCursOnDate){
        String qlString = "insert into Currency (CUR1,CUR2,ONDATE,RATE) values (?,?,?,?)";
        Query query = entityManager.createNativeQuery(qlString);
        query.setParameter(1, valuteCursOnDate.getChCode());
        query.setParameter(2, "RUR");
        query.setParameter(3, new Date());
        query.setParameter(4, valuteCursOnDate.getCurs());
        return query.executeUpdate();
    }


}
