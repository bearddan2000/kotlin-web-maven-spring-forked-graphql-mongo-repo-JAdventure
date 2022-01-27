package example.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import example.model.Weapon;
import example.repository.WeaponRepository;

@Component
class Query : GraphQLQueryResolver {

  @Autowired
  lateinit var weaponRepository: WeaponRepository

  fun findAllWeapons(): String {
    var sb = StringBuilder();
    for ( w in weaponRepository.findAll() ) {
      sb.append(w.toString()+"\n");
    }
    return sb.toString();
  }

  fun countAll(): Long = weaponRepository.count();

}
