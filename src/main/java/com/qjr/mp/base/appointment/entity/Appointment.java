package com.qjr.mp.base.appointment.entity;

import java.util.Date;

import com.qjr.mp.base.book.entity.Book;

public class Appointment {

	private String bookId;// 图书ID

	private String studentId;// 学号

	private String appointTime;// 预约时间

	// 多对一的复合属性
	private Book book;// 图书实体

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getAppointTime() {
		return appointTime;
	}

	public void setAppointTime(String appointTime) {
		this.appointTime = appointTime;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
}
