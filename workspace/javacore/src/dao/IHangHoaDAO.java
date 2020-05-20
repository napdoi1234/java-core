package dao;

import java.util.List;

import model.HangHoaModel;

public interface IHangHoaDAO extends GenericDAO<HangHoaModel> {
	List<HangHoaModel> findAll();
}
