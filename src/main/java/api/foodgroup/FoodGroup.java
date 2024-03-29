package api.foodgroup;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="food_groups")
public class FoodGroup {
	
	@Id
	@Column(name="id")
	private String id;
	@Column(name="name")
	private String name;

	public FoodGroup() {
		super();
	}

	public FoodGroup(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
