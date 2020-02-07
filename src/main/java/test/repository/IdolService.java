package test.repository;
 
import java.util.List;
 
import test.Idol;
import test.repository.IdolRepository;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
public class IdolService {
   
  @Autowired
  IdolRepository repository;
   
  public List<Idol> search(String title, String name, String genre, Integer arrival) {
    List<Idol> result = repository.findAll();
    return result;
  }
   
}