package service.impl;

import java.util.List;

import dao.IHangHoaDAO;
import dao.impl.HangHoaDAO;
import model.HangHoaModel;
import service.IHangHoaService;

public class HangHoaService implements IHangHoaService {
	private IHangHoaDAO hangHoaDAO;

	public HangHoaService() {
		hangHoaDAO= new HangHoaDAO();
	}
	@Override
	public List<HangHoaModel> findAll() {
		return hangHoaDAO.findAll();
	}

}
