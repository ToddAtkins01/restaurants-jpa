package reviews.resturants;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@Column(name="rev_id")
	
	// One
	private long id;
	@OneToMany(mappedBy="review")
	private List<Review> reviews;

}
