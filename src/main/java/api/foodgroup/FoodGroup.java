package api.foodgroup;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="food_groups")
public class FoodGroup {
	
	@Id
	@Column(name="name")
	private String name;

	public FoodGroup() {
		super();
	}

	public FoodGroup(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
