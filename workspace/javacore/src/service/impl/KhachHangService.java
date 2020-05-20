package service.impl;

import java.util.List;

import dao.IKhachHangDAO;
import dao.impl.KhachHangDAO;
import model.KhachHangModel;
import service.IKhachHangService;

public class KhachHangService implements IKhachHangService {
	
	private IKhachHangDAO khachhangDAO;
	
	public KhachHangService() {
		khachhangDAO= new KhachHangDAO();
	}

	@Override
	public List<KhachHangModel> findAll() {
		// TODO Auto-generated method stub
		return khachhangDAO.findAll();
	}

}
