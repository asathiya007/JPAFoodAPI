package api.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("foodgroups/{fgId}/foods")
public class FoodResource {

	@Autowired 
	private FoodRepository fRepo;
	
	@GetMapping
	public List<Food> getFoods(@PathVariable String fgId) {
		return fRepo.findByFoodGroupId(fgId);
	}
	
	@GetMapping("/{fId}")
	public Food getFood(@PathVariable String fId) {
		return fRepo.findById(fId).get();
	}

	@PostMapping
	public void addFood(@RequestBody Food food, @PathVariable String fgId) {
		food.setFoodGroup(fgId);
		fRepo.save(food);
	}
	
}
