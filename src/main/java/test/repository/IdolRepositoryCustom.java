package test.repository;

import java.util.List;
 
import test.Idol;
 
public interface IdolRepositoryCustom {
  public List<Idol> search(String genre, String arrival);


}