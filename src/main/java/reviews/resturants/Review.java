package reviews.resturants;

import java.sql.Clob;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	@Id
	@Basic(fetch=FetchType.LAZY)
	
	// Many
	private long id;
	private String title;
	private String image;
	private String reviewCategory;
	@Lob
	private String content;
	private String phoneNumber;
	private String address;
	private String hoursOfOperationA;
	private String hoursOfOperationB;
	private String hoursOfOperationC;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="rev_id")
	private Category review;

	public long getId() {
		return id;
	}

	public String getImage() {
		return image;
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

	public String getReviewCategory() {
		return reviewCategory;
	}
	
	private Review() {
	}

	public Review(long id, String title, String image, String reviewCategory, String content, String phoneNumber,
			String address, String hoursOfOperationA, String hoursOfOperationB, String hoursOfOperationC) {
		this.id = id;
		this.title = title;
		this.image = image;
		this.reviewCategory = reviewCategory;
		this.content = content;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.hoursOfOperationA = hoursOfOperationA;
		this.hoursOfOperationB = hoursOfOperationB;
		this.hoursOfOperationC = hoursOfOperationC;
	}

}
