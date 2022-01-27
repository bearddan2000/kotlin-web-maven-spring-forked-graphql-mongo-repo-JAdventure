package example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "weapon")
data class Weapon(

  @Id
  var id: String

  , @Indexed var name: String
  , var description: String
  , var position: String
  , var level: Int
  , var properties: Properties
){

  constructor(): this("0", "none", "none", "right", 1, Properties())

  constructor(newName: String, newDescription: String): this() {
    this.name = newName;
    this.description = newDescription;
  }

  override fun toString(): String {
    var sb = StringBuilder()
    sb.append("{")
    sb.append(" 'id': '" + id + "'")
    sb.append(", 'name': '" + name + "'")
    sb.append(", 'description': '" + description + "'")
    sb.append(", 'position': '" + position + "'")
    sb.append(", 'level': " + level)
    sb.append(", 'properties': " + properties.toString())
    sb.append("}")
    return sb.toString()
  }
}
