package study.petshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.petshop.Entity.Pet;

@Repository
public interface PetRepository  extends JpaRepository<Pet, Long> {
}
