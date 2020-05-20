package dao.impl;

import java.util.List;

import dao.GenericDAO;
import dao.IHangHoaDAO;
import model.HangHoaModel;

public class HangHoaDAO extends AbstractDAO<HangHoaModel> implements IHangHoaDAO{

	@Override
	public List<HangHoaModel> findAll() {
		String sql="SELECT * from hanghoa";
		return query(sql, "hanghoa");
	}
}
