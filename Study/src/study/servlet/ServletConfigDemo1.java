package study.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigDemo1
 */
@WebServlet("/ServletConfigDemo1")
public class ServletConfigDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConfigDemo1() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    /**
     * 定义ServletConfig对象来接收配置的初始化参数
     */
    private ServletConfig config;
    
    /**
     * 当servlet配置了初始化参数后，web容器在创建servlet实例对象时，
     * 会自动将这些初始化参数封装到ServletConfig对象中，并在调用servlet的init方法时，
     * 将ServletConfig对象传递给servlet。进而，程序员通过ServletConfig对象就可以
     * 得到当前servlet的初始化参数信息。
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取在web.xml中配置的初始化参数
        String paramVal = this.config.getInitParameter("name");//获取指定的初始化参数
        response.getWriter().print(paramVal);
        
        response.getWriter().print("<hr/>");
        //获取所有的初始化参数
        Enumeration<String> e = config.getInitParameterNames();
        while(e.hasMoreElements()){
            String name = e.nextElement();
            String value = config.getInitParameter(name);
            response.getWriter().print(name + "=" + value + "<br/>");
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
