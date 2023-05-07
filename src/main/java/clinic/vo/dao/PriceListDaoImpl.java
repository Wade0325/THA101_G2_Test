package clinic.vo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vo.PriceList;

public class PriceListDaoImpl implements PriceListDao {

	@Override
	public int insert(PriceList priceList) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String sql = "insert into price_list values(?, ?)";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tha101g2", "root", "Abcd1234");
				PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setInt(1, priceList.getserviceItem());
			ps.setInt(2, priceList.getServicePrice());
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public int deleteByService_item(Integer service_item) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String sql = "delete from price_list where service_item = ?";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tha101g2", "root", "Abcd1234");
				PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setInt(1, service_item);
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public int updateByService_item(PriceList priceList) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String sql = "update price_list set" + "service_price = ? " + "where service_item = ?";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tha101g2", "root", "Abcd1234");
				PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setInt(1, priceList.getServiceItem());
			ps.setInt(2, priceList.getServicePrice());
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public PriceList selectByServiceItem(Integer service_item) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String sql = "select * from price_list where service_item = ?";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tha101g2", "root", "Abcd1234");
				PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setInt(1, service_item);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					PriceList priceList = new PriceList();
					priceList.setServiceItem(rs.getInt("service_item"));
					priceList.setServicePrice(rs.getInt("service_price"));
					return priceList;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<PriceList> selectAll() {
		String sql = "select * from price_list";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tha101g2", "root", "Abcd1234");
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			List<PriceList> list = new ArrayList<PriceList>();
			while (rs.next()) {
				PriceList priceList = new PriceList();
				priceList.setServiceItem(rs.getInt("service_item"));
				priceList.setServicePrice(rs.getInt("service_price"));
				list.add(priceList);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
