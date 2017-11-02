package reviews.resturants;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class CategoryRepository {

	public CategoryRepository() {

		Category italian = new Category(1L, "Italian");
		categories.put(1L, italian);
		Category mexican = new Category(2L, "Mexican");
		categories.put(2L, mexican);
		Category asian = new Category(3L, "Asian");
		categories.put(3L, asian);
		Category american = new Category(4L, "American");
		categories.put(4L, american);
	}

	Map<Long, Category> categories = new HashMap<>();

	public Collection<Category> findAll() {
		return categories.values();
	}

	public Category findOne(Long id) {
		return categories.get(id);
	}
}
