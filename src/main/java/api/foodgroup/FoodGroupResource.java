package api.foodgroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foodgroups")
public class FoodGroupResource {
	
	@Autowired
	private FoodGroupRepository fgRepo;
	
	@GetMapping
	public List<FoodGroup> getFoodGroups() {
		return fgRepo.findAll();
	}
	
	@GetMapping("/{fgId}")
	public FoodGroup getFoodGroup(@PathVariable String fgId) {
		return fgRepo.findById(fgId).get();
	}
	
	@PostMapping
	public void addFoodGroup(@RequestBody FoodGroup fg) {
		fgRepo.save(fg);
	}
	
	@PutMapping("/{fgId}")
	public void updateFoodGroup(@RequestBody FoodGroup fg) {
		fgRepo.save(fg);
	}
}
