package reviews.resturants;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	@Id
	@GeneratedValue
	// Many
	private Long id;
	private String title;
	private String image;
	private String logo;
	@Lob
	private String content;
	private String phoneNumber;
	private String address;
	private String hoursOfOperationA;
	private String hoursOfOperationB;
	private String hoursOfOperationC;
	
	@ManyToOne
	private Category category;

	public Long getId() {
		return id;
	}

	public String getImage() {
		return image;
	}
	
	public String getLogo() {
		return logo;
	}

	public String getContent() {
		return content;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getHoursOfOperationA() {
		return hoursOfOperationA;
	}

	public String getHoursOfOperationB() {
		return hoursOfOperationB;
	}

	public String getHoursOfOperationC() {
		return hoursOfOperationC;
	}

	public String getTitle() {
		return title;
	}

	
	private Review() {
	}

	public Review(Category category, String title, String image, String logo, String content, String phoneNumber, String address, String hoursOfOperationA,
			String hoursOfOperationB, String hoursOfOperationC) {
		this.category = category;
		this.title = title;
		this.image = image;
		this.logo = logo;
		this.content = content;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.hoursOfOperationA = hoursOfOperationA;
		this.hoursOfOperationB = hoursOfOperationB;
		this.hoursOfOperationC = hoursOfOperationC;
	}

}
