package reviews.resturants;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue
	private Long id;
	private String name;

	public List<Review> getReviews() {
		return reviews;
	}

	@OneToMany(mappedBy = "category")
	private List<Review> reviews;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Category(long id, String name) {
		this.id = id;
		this.name = name;
	}

	private Category() {
	}
}
