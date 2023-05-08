package price_list;

public class PriceList {

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
