package reviews.resturants;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class RestaurantPopulator implements CommandLineRunner{
	
	@Resource
	private CategoryRepository catagoryRepo;
	
	@Resource
	private ReviewRepository reviewRepo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
