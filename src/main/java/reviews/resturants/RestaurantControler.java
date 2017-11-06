package reviews.resturants;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestaurantControler {

	@Resource
	public CategoryRepository categoryRepository;

	@Resource
	public ReviewRepository reviewRepository;

	@RequestMapping("/restaurant")
	public String showRestaurant(@RequestParam("id") long id, Model model) {
		model.addAttribute("modelRestaurant", reviewRepository.findOne(id));
		return "restaurant-template";
	}

	@RequestMapping("/categories")
	public String showAll(Model model) {
		model.addAttribute("modelAllCategories", categoryRepository.findAll());
		return "category-all-template";
	}

	@RequestMapping("/category")
	public String showCategory(@RequestParam("id") long id, Model model) {
		model.addAttribute("modelCategory", categoryRepository.findOne(id));
		return "category-template";
	}
}