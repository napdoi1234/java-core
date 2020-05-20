package javacore;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import model.HangHoaModel;
import model.HoaDonModel;
import model.KhachHangModel;
import service.IHangHoaService;
import service.IHoaDonService;
import service.IKhachHangService;
import service.impl.HangHoaService;
import service.impl.HoaDonService;
import service.impl.KhachHangService;

public class core {
	
	private IHangHoaService hangHoaService;
	private IHoaDonService hoaDonService;
	private IKhachHangService khachHangService;
	
	public core() {
		hangHoaService= new HangHoaService();
		hoaDonService= new HoaDonService();
		khachHangService= new KhachHangService();		
	}

	public static void main(String[] args) {
		List<HangHoaModel>  hangHoaList=new ArrayList<HangHoaModel>();
		List<HoaDonModel> hoaDonList= new ArrayList<HoaDonModel>();
		List<KhachHangModel> khachHangList= new ArrayList<KhachHangModel>();
		core C=new core();
		Scanner sc= new Scanner(System.in);
		int mode=0;
		do {
			System.out.println("Lựa chọn chế độ");
			System.out.println("1 - Xem danh sách thông tin khách hàng ");
			System.out.println("2 - Xem danh sách thông tin hóa đơn");
			System.out.println("3 - Xem danh sách thông tin hàng hóa");
			System.out.println("4 - Thoát");
			try {
				mode=sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Bạn nhập sai chức năng");
				break;
			}
			if(mode==1) {
				khachHangList=C.khachHangService.findAll();
				for(KhachHangModel khmd:khachHangList) {
					System.out.println("Id khách hàng: "+khmd.getId()+" Tên: "+khmd.getName()+" Giới tính: "+khmd.getGender()+" Năm sinh: "+khmd.getDateOfBirth());
				}
			}else if(mode==2) {
				hoaDonList=C.hoaDonService.findAll();
				for(HoaDonModel hdmd:hoaDonList) {
					System.out.println("Id hóa đơn: "+hdmd.getIdHD()+" Tên người mua: "+hdmd.getNameGuest()+" Tên sản phẩm: "+hdmd.getNameProduct()+" Số lượng mua: "+hdmd.getQuantity()+" Ngày mua: "+hdmd.getDateOfPurchase()+" Tổng giá: "+hdmd.getTotalPrice());
				}
			}else if(mode==3) {
				hangHoaList=C.hangHoaService.findAll();
				for(HangHoaModel hhmd:hangHoaList) {
					System.out.println("Id hàng hóa: "+hhmd.getId()+" Tên sản phẩm: "+hhmd.getName()+" Số lượng trong kho: "+hhmd.getQuantity()+"Giá mỗi đơn vị: "+hhmd.getPrice());
				}
			}
			else System.out.println("Hệ thống chưa có chức năng này");
			
		}while(mode!=4);
	}
}
