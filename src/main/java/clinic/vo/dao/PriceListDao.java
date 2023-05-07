package clinic.vo.dao;

import java.util.List;

import vo.PriceList;

public interface PriceListDao {

	int insert(PriceList priceList);

	int deleteByService_item(Integer service_item);

	int updateByService_item(PriceList priceList);

	PriceList selectByServiceItem(Integer service_item);

	List<PriceList> selectAll();

}