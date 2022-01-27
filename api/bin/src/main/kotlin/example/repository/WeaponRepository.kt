package example.repository;

import example.model.Weapon;
import org.springframework.data.mongodb.repository.MongoRepository;

// No need implementation, just one interface, and you have CRUD, thanks Spring Data!
// MongoRepository’s methods: save(), findOne(), findById(), findAll(), count(), delete(), deleteById()
interface WeaponRepository : MongoRepository<Weapon, String> {}
