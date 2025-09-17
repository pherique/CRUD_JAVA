package crud_java_teste.agregadorDeInvestimentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import crud_java_teste.agregadorDeInvestimentos.entity.User;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface USerRepository extends JpaRepository<User, UUID> {
}
