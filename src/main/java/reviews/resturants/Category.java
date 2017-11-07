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
	private String img;

	public List<Review> getReviews() {
		return reviews;
	}

	@OneToMany(mappedBy = "category")
	private List<Review> reviews;

	
	
	public Long getId() {
		return id;
	}
  
	public String getName() {
		return name;
	}
	
	public String getImg() {
		return img;
	}

	public Category(String name, String img) {
		this.name = name;
		this.img = img;
	}

	private Category() {
	}
}
