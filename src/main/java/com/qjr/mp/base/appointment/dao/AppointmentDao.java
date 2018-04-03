package com.qjr.mp.base.appointment.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qjr.mp.base.appointment.entity.Appointment;

public interface AppointmentDao {
	int inserAppointment(@Param("bookId") String bookId,@Param("studentId") String studentId);
	 ////测试0403 18:34
	List<Appointment> queryByKeyWithBook(@Param("bookId") String bookId);
}
