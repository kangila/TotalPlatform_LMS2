package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "notice_file")
@Getter
@Setter
public class NoticeFile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer nfId;
	
	private Integer fileId; //파일 번호
	
	@ManyToOne
	@JoinColumn(name = "notice_id")
	private Notice notice;
}
