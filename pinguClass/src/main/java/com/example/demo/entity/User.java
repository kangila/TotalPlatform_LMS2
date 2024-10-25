package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	private String id;
	private String pw;
	private String email;
	private String name;
	private String tel;
	private String birth;
	private String gender;
	private LocalDateTime createDate; //회원가입일
	private String bannedYn; //정지여부
	private String signoutYn; //회원탈퇴여부
	
	@OneToMany(mappedBy = "user")
    private List<CsQuestion> questions; //1:1문의글 리스트
	
	@OneToMany(mappedBy = "user")
    private List<Community> communitys; //커뮤니티 작성글 리스트
	
	@OneToMany(mappedBy = "reporter")
    private List<Report> reporters; //신고한 리스트
	
	@OneToMany(mappedBy = "reportee")
    private List<Report> reportees; //신고 당한 리스트
	
	@OneToMany(mappedBy = "user")
    private List<CommunityLike> communityLikes; //커뮤니티 좋아요 리스트
	
	@OneToMany(mappedBy = "user")
    private List<CommunityComment> communityComments; //커뮤니티 댓글 리스트
	
	@OneToMany(mappedBy = "user")
	private List<SubPayment> subPayments; //구독 결제 리스트
	
	@OneToOne(mappedBy = "user")
	private Subscription subscription; //현재 구독 상태
	
	@OneToMany(mappedBy = "user")
	private List<Coupon> coupons; //쿠폰 코드 리스트
	
	@OneToMany(mappedBy = "user")
    private List<UserCategory> userCategorys; //유저카테고리 리스트
	
	@OneToMany(mappedBy = "user")
    private List<Registration> registrations; //수강 강좌 리스트
	
	@OneToMany(mappedBy = "user")
    private List<Review> reviews; //리뷰 리스트
	
	@OneToMany(mappedBy = "user")
    private List<Qna> qnas; //강좌 QnA 리스트
	
	@OneToMany(mappedBy = "user")
    private List<CoursePayment> coursePayments; //강좌 결제 리스트
}






