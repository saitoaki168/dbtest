package test.repository.service;
 
import java.util.List;
 
import test.Idol;
import test.repository.IdolRepository;
import test.repository.IdolRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
public class IdolService {
   
  @Autowired
  IdolRepository repository;
  @Autowired
  IdolRepositoryCustom repositoryCustom;
   
  public List<Idol> search(String genre, String arrival) {
    List<Idol> result;
    if ("".equals(genre) && "".equals(arrival)) {
      result = repository.findAll();
    } else {
      result = repositoryCustom.search(genre, arrival);
    }
    return result;
  }

}