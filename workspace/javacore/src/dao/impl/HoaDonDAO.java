package dao.impl;

import java.util.List;

import dao.IHoaDonDAO;
import model.HoaDonModel;

public class HoaDonDAO extends AbstractDAO<HoaDonModel> implements IHoaDonDAO {

	@Override
	public List<HoaDonModel> findAll() {
		String sql="SELECT * from hoadon";
		return query(sql, "hoadon");
	}

}
