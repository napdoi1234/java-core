package dao;

import java.util.List;

import model.KhachHangModel;


public interface IKhachHangDAO extends GenericDAO<KhachHangModel> {
	List<KhachHangModel> findAll();
}
