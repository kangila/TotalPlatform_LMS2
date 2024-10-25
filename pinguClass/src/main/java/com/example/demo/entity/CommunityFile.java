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
@Table(name = "community_file")
@Getter
@Setter
public class CommunityFile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cfileId;
	
	private Integer fileId; //파일 번호
	
	@ManyToOne
	@JoinColumn(name = "cm_id")
	private Community community;
}
