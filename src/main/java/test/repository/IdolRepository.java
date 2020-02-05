package test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.Idol;

@Repository
public interface IdolRepository extends JpaRepository<Idol, Integer> {
}