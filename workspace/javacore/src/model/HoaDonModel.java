package model;

import java.sql.Timestamp;

public class HoaDonModel {
	private Long idHD;
	private Long idHH;
	private String nameProduct;
	private Integer quantity;
	private Integer totalPrice;
	private Timestamp dateOfPurchase;
	private String nameGuest;
	private Long identityCard;
	
	public Long getIdHD() {
		return idHD;
	}
	public void setIdHD(Long idHD) {
		this.idHD = idHD;
	}
	public Long getIdHH() {
		return idHH;
	}
	public void setIdHH(Long idHH) {
		this.idHH = idHH;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Timestamp getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(Timestamp dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public String getNameGuest() {
		return nameGuest;
	}
	public void setNameGuest(String nameGuest) {
		this.nameGuest = nameGuest;
	}
	public Long getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(Long identityCard) {
		this.identityCard = identityCard;
	}
}
