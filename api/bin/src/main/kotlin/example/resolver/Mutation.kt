package example.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import example.model.Weapon;
import example.repository.WeaponRepository;

@Component
class Mutation : GraphQLMutationResolver {

  @Autowired
  lateinit var weaponRepository: WeaponRepository

  fun createWeapon(name: String, description: String ): String {
    val w = Weapon(name, description);
    weaponRepository.save(w);
    return w.toString();
  }

}
