package service.impl;

import java.util.List;

import dao.IHoaDonDAO;
import dao.impl.HoaDonDAO;
import model.HoaDonModel;
import service.IHoaDonService;

public class HoaDonService implements IHoaDonService{
	
	private IHoaDonDAO hoadonDAO;
	
	public HoaDonService() {
		hoadonDAO= new HoaDonDAO();
	}
	
	@Override
	public List<HoaDonModel> findAll() {
		// TODO Auto-generated method stub
		return hoadonDAO.findAll();
	}

}
