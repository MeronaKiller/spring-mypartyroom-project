package com.example.demo.dto;

import lombok.Data;

@Data
public class NoticeDto {
	private int noticeid, rnum, state, adminid;
	private String title, writeday, img, content, admin_name;
}
