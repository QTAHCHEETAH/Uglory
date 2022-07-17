package edu.kh.ugloryC.review.model.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class ReviewWrite {
	
	private int reviewNo;
	private String reviewContent;
	private String reviewEnrollDate;
	private int starRating;
	private int reviewCode;
	private int memberNo;
	private String memberName;
	
	private int productImageNo;
	private String productOrderDate;
	private String productName;
	private String optionName;
	private int totalPrice;
	
}