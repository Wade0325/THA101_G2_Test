package vo;

import java.io.Serializable;

public class PriceList implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer service_item;
	private Integer service_price;

	public PriceList() {

	}

	public PriceList(Integer serviceItem, Integer servicePrice) {
		super();
		this.service_item = serviceItem;
		this.service_price = servicePrice;
	}

	public Integer getServiceItem() {
		return service_item;
	}

	public void setServiceItem(Integer serviceItem) {
		this.service_item = serviceItem;
	}

	public Integer getServicePrice() {
		return service_price;
	}

	public void setServicePrice(Integer servicePrice) {
		this.service_price = servicePrice;
	}

}
