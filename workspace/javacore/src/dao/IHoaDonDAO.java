package dao;

import java.util.List;

import model.HoaDonModel;

public interface IHoaDonDAO extends GenericDAO<HoaDonModel>{
	List<HoaDonModel> findAll();
}
