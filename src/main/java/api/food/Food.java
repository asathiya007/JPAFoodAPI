package api.food;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="foods")
public class Food {
	
	@Id
	@Column(name="id")
	private String id;
	@Column(name="name")
	private String name;
	@Column(name="tasty")
	private boolean tasty;
	@Column(name="healthy")
	private boolean healthy;
	@Column(name="food_group")
	private String foodGroupId;
	
	public Food() {
		super();
	}

	public Food(String id, String name, boolean tasty, boolean healthy, 
			String foodGroupName) {
		super();
		this.id = id;
		this.name = name;
		this.tasty = tasty;
		this.healthy = healthy;
		this.foodGroupId = foodGroupName;
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
	
	public boolean isTasty() {
		return tasty;
	}
	
	public void setTasty(boolean tasty) {
		this.tasty = tasty;
	}
	
	public boolean isHealthy() {
		return healthy;
	}
	
	public void setHealthy(boolean healthy) {
		this.healthy = healthy;
	}
	
	public String getFoodGroup() {
		return foodGroupId;
	}
	
	public void setFoodGroup(String foodGroup) {
		this.foodGroupId = foodGroup;
	}
	
}
