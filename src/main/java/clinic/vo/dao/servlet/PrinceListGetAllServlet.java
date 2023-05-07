package clinic.vo.dao.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.PriceListDao;
import dao.PriceListDaoImpl;
import vo.PriceList;

@WebServlet("/PrinceListGetAllServlet")
public class PrinceListGetAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PrinceListGetAllServlet() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		PriceListDao dao = new PriceListDaoImpl();
		List<PriceList> list = dao.selectAll();
		Gson gson = new Gson();
		String jsonStr = gson.toJson(list);
		rep.getWriter().write(jsonStr);
	}
}
