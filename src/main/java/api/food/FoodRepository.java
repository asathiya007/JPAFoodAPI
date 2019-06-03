package api.food;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, String> {
	
	List<Food> findByFoodGroupId(String fgId);
	
}
