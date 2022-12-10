package ba.sum.fsre.knjiznica.repositories;

import ba.sum.fsre.knjiznica.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}