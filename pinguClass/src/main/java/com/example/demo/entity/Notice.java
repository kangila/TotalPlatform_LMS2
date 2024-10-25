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
@Table(name = "notice")
@Getter
@Setter
public class Notice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer noticeId;
	
	private String title;
	private String content;
	private LocalDateTime lastUpdate; //최근업데이트 날짜
	
	@ManyToOne
	@JoinColumn(name = "admin_id")
	private Admin admin;
	
	@OneToMany(mappedBy = "notice")
    private List<NoticeFile> noticeFiles;
}
