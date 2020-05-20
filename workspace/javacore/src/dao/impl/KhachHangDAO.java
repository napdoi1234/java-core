package dao.impl;

import java.util.List;

import dao.IKhachHangDAO;
import model.KhachHangModel;

public class KhachHangDAO extends AbstractDAO<KhachHangModel> implements IKhachHangDAO{

	@Override
	public List<KhachHangModel> findAll() {
		String sql="SELECT * from khachhang";
		return query(sql, "khachhang");
	}

}
