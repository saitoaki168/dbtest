package test.repository.impl;
 
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
 
import test.Idol;
import test.repository.IdolRepositoryCustom;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
@Component
public class IdolRepositoryCustomImpl implements IdolRepositoryCustom {
   
  @Autowired
  EntityManager manager;
   
  @SuppressWarnings("unchecked")
  @Override
  public List<Idol> search(String genre, String arrival) {
    StringBuilder sql = new StringBuilder();
    sql.append("SELECT i From Idol i WHERE ");
    boolean andFlg = false;
    boolean genreFlg = false;
    if (!"".equals(genre) && genre != null) {
      sql.append("i.genre LIKE :genre ");
      genreFlg = true;
      andFlg = true;
    }
    boolean arrivalFlg = false;
    if (!"".equals(arrival) && arrival != null) {
      if (andFlg) sql.append(" AND ");
      sql.append("i.arrival LIKE :arrival ");
      arrivalFlg = true;
      andFlg = true;
    }

    Query query = manager.createQuery(sql.toString());
    if (genreFlg) query.setParameter("genre", "%" + genre + "%");
    if (arrivalFlg) query.setParameter("arrival", "%" + arrival + "%");
    return query.getResultList();
  }

  
}