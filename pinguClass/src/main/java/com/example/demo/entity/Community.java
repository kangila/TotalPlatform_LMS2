package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "community")
@Getter
@Setter
public class Community {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cmId;
	
	private String title;
	private String content;
	private LocalDateTime lastUpdate; //최근업데이트 날짜
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToMany(mappedBy = "community")
    private List<CommunityFile> communityFiles;
	
	@OneToMany(mappedBy = "community")
    private List<CommunityLike> communityLikes;
	
	@OneToMany(mappedBy = "community")
    private List<CommunityComment> communityComments;

}
